package org.example.showdata.entites;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;


@Setter
@Getter
public class Data {
    @Id
    private String id;
    private double average;
    private int minimum;
    private int maximum;

}

