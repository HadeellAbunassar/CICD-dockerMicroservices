package org.example.analysis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Component
public class RetirveDataDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Integer> getAllGrades() {
        return jdbcTemplate.query("SELECT grade FROM grades", new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getInt("grade");
            }
        });
    }}
