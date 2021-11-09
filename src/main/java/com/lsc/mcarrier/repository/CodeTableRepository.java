package com.lsc.mcarrier.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.lsc.mcarrier.entity.CodeTableEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CodeTableRepository extends CrudRepository<CodeTableEntity, String> {

    @Query("SELECT c from CodeTableEntity  c WHERE c.tableN = :tableName order by  c.tableE")
    List<CodeTableEntity> findByTableName(@Param("tableName") String tableName);

    @Query("SELECT c from CodeTableEntity  c WHERE c.tableN IN :tableNames order by c.tableN, c.tableE")
    List<CodeTableEntity> findByTableName(@Param("tableNames") List<String> tableName);

    @Query("SELECT C " +
            "FROM CodeTableEntity C " +
            "WHERE C.tableN = 'ERROR' AND C.tableCd >= '5000' AND C.tableCd < '7000' ORDER BY C.tableCd")
            List<CodeTableEntity> getMCarrierErrorMessages();

    @Query("SELECT c from CodeTableEntity  c WHERE c.tableN = 'ERROR' order by  c.tableE")
    List<CodeTableEntity> findCodeTableMessages();

    @Query("SELECT c from CodeTableEntity  c WHERE c.tableN = :tableName AND  c.tableCd = :tableCd order by  c.tableE")
    CodeTableEntity findByTableNameAndTableCd(@Param("tableName") String tableName, @Param("tableCd") String tableCd);



}
