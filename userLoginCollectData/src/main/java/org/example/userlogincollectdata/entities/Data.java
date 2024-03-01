package org.example.userlogincollectdata.entities;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Data {
    private int id;
    private String grade;

    @Override
    public String toString() {
        return "Grade : " + grade;
    }

}
