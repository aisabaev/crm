package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;

@Getter
@Setter
@ToString

public class CourseFormat extends BaseEntity {
    private String format; // BOOTCAMP || MEETUP || ORDINARY || ONLINE MEETUP
    private int courseDurationWeeks;
    private LocalTime lessonDuration;
    private int lessonsPerWeek;
    private boolean isOnline;
}
