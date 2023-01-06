package com.springcore;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
}