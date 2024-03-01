package org.example.analysis.dao;

import org.example.analysis.entities.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StatisticsDAO {


    @Autowired
    MongoTemplate mongoTemplate;

    public void calculateStatistics( List<Integer> grades ){
        Data data = new Data();
        data.setAverage(grades.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0));
        data.setMinimum(grades.stream().mapToInt(Integer::intValue).min().orElse(0));
        data.setMaximum( grades.stream().mapToInt(Integer::intValue).max().orElse(0));
        updateDocument(data);

    }

    public void updateDocument(Data data){
        mongoTemplate.remove(new Query(), "stat");
        mongoTemplate.save(data, "stat");
    }

}
