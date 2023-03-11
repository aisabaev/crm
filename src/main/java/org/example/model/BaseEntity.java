package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class BaseEntity {
    private Long id;
    private LocalDateTime dateCreated;
}
