package org.example.showdata.dao;

import org.example.showdata.entites.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StatisticsDAO {


    @Autowired
     MongoTemplate mongoTemplate;

    public List<Data> findAll() {
        return mongoTemplate.findAll(Data.class, "stat");
    }


}
