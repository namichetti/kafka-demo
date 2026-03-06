package com.amichetti.kafka.demo.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Student {

    private Long id;
    private String firstname;
    private String lastname;

}
