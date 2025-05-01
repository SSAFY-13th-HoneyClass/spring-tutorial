package com.ssafy.springboot;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
    private Long id;

    private String name;
}
