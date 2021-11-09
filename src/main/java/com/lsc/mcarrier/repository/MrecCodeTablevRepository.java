package com.lsc.mcarrier.repository;

import com.lsc.mcarrier.entity.MrecCodeTablevEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MrecCodeTablevRepository extends CrudRepository<MrecCodeTablevEntity, String> {

    @Query("SELECT c from MrecCodeTablevEntity  c  order by  c.tableN, c.tableCd1, c.tableCd2")
    List<MrecCodeTablevEntity> findAll();

    @Query("SELECT c from MrecCodeTablevEntity  c  WHERE c.tableN = :tableN ORDER BY c.tableCd1, c.tableCd2")
    List<MrecCodeTablevEntity> findByTableN(@Param("tableN") String tableN);


}
