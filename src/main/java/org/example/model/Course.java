package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Course {
    private String name;
    private double price;
    private CourseFormat courseFormat;
}
