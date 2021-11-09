package com.lsc.mapper;

import com.lsc.mcarrier.entity.*;
import com.lsc.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel="spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CommonMapper {

    /**
     * Converts an CodeTableEntity to a CodeTable model
     * @param codeTable
     * @return
     */
    CodeTable codeTableToModel(CodeTableEntity codeTable);

    List<MrecCodeTablev> codeTablevEntityToModels(List<MrecCodeTablevEntity> items);

    MrecUser mrecUserEntityToModel(MrecUserEntity mrecUserEntity);
    MrecUserEntity mrecUserModelToEntity(MrecUser mrecUser);
    List<MrecUser> mrecUserEntitiesToModels(List<MrecUserEntity> mrecUserEntity);
    List<MrecUserEntity> mrecUserModelsToEntities(List<MrecUser> mrecUser);


    MrecAcct mrecAcctEntityToModel(MrecAcctEntity mrecAcctEntity);
    MrecAcctEntity mrecAcctModelToEntity(MrecAcct mrecAcct);
    List<MrecAcct> mrecAcctEntitiesToModels(List<MrecAcctEntity> mrecAcctEntity);
    List<MrecAcctEntity> mrecAcctModelsToEntities(List<MrecAcct> mrecAcct);





    MrecUserAccountEntity mrecUserAccountModelToEntity(MrecUserAccount entityList);
    MrecUserAccount mrecUserAccountEntityToModel(MrecUserAccountEntity entityList);
    List<MrecUserAccount> mrecUserAccountEntityToModels(List<MrecUserAccountEntity> entityList);
    List<MrecUserAccountEntity> mrecUserAccountModelsToEntity(List<MrecUserAccount> model);


    List<CodeTable> codeTablesToModels(List<CodeTableEntity> codeTables);
    List<ListItem> codeTableToList(List<CodeTableEntity> codeTables);


}
