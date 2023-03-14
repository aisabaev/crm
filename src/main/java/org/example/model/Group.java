package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;
@Getter
@Setter
@ToString

public class Group extends BaseEntity{

    private String name;
    private LocalTime groupTime;
    private Course course;
    private Mentor mentor;
    
}
