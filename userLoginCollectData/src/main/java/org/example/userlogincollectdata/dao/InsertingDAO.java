package org.example.userlogincollectdata.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class InsertingDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createTableIfNotExist() {
        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS grades (id INT AUTO_INCREMENT PRIMARY KEY, grade DOUBLE)");
    }

    public void insertData(double grade) {
        createTableIfNotExist();
            jdbcTemplate.update("INSERT INTO grades (grade) VALUES (?)", grade);

    }

}
