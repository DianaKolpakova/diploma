package com.mai.my_spring;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Elf {
    @InjectRandomInt(min=3,max=10)
    private int power;

    @InjectRandomInt(min=25,max=50)
    private int speed;


    private int age;
}







