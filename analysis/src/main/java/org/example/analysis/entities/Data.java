package org.example.analysis.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Setter
@Getter
public class Data {
    @Id
    private String id;
    private double average;
    private int minimum;
    private int maximum;

}

