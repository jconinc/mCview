package com.lsc.service;

import com.lsc.mcarrier.entity.CodeTableEntity;
import com.lsc.mcarrier.entity.ListItem;
import com.lsc.mapper.CommonMapper;
import com.lsc.model.CodeTable;
import com.lsc.mcarrier.repository.CodeTableRepository;
import com.lsc.mcarrier.repository.MrecCodeTablevRepository;
import com.lsc.util.HelperEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class CommonService {

    @Autowired
    private CodeTableRepository codeTableRepository;

    @Autowired
    private CommonMapper commonMapper;

    @Autowired
    private MrecCodeTablevRepository codeTablevRepository;

    public List<CodeTable> getCodeTableMsgs(){
        List<CodeTable> allLists = new ArrayList<CodeTable>();
        //get all the list for the application
        List<CodeTableEntity> codeTableMessages = codeTableRepository.findCodeTableMessages();
        allLists.addAll(commonMapper.codeTablesToModels(codeTableMessages));

        return allLists;
    }



    public CodeTable findByCodeTableNameAndCode(String tableName, String tableCode){
        List<CodeTable> allLists = new ArrayList<CodeTable>();
        //get all the list for the application
        CodeTableEntity codeTableMessage = codeTableRepository.findByTableNameAndTableCd(tableName, tableCode);
        return commonMapper.codeTableToModel(codeTableMessage);
    }


    public HashMap<String, List<ListItem>> getAppLists(){
        HashMap<String, List<ListItem>> allLists = new HashMap<>();
        HashMap<String, String> keys = new HashMap<>();
        //get all the list for the application
        List<String> allTableN = new ArrayList<String>();
        String previousTableN = "";

        for(HelperEnum.ListTypes aType: HelperEnum.ListTypes.values()){
            allTableN.add(aType.getTableName());
            keys.put(aType.getTableName(), aType.getKeyName());
        }
        List<CodeTableEntity> codeTableEntities = codeTableRepository.findByTableName(allTableN), tableEntities;
        tableEntities = new ArrayList<CodeTableEntity>();

        for(int i = 0 ; i < codeTableEntities.size(); i++){
            if("".equals(previousTableN)){
                previousTableN = codeTableEntities.get(i).getTableN();
            }
            if(!previousTableN.equals(codeTableEntities.get(i).getTableN())){
                allLists.put(keys.get(previousTableN), commonMapper.codeTableToList(tableEntities));
                tableEntities = new ArrayList<CodeTableEntity>();
            }
            tableEntities.add(codeTableEntities.get(i));
            previousTableN = codeTableEntities.get(i).getTableN();
        }
        allLists.put(keys.get(previousTableN), commonMapper.codeTableToList(tableEntities));


        return allLists;
    }



    public List<CodeTable> getCodeValues(String tableName){
        List<CodeTableEntity> codeValues = codeTableRepository.findByTableName(tableName);

        List<CodeTable> toReturn = new ArrayList<CodeTable>();
        if(codeValues != null && codeValues.size() > 0){
            toReturn = commonMapper.codeTablesToModels(codeValues);
        }
        return toReturn;
    }


}
