package com.mai.real_spring;

import com.mai.my_spring.InjectRandomInt;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;

@Order(2)
@Book
@Film
public class ShakespearQuoter implements Quoter {
    @Setter
    @Value("${shake}")
    private String message;

    @InjectRandomInt(min = 3,max = 5)
    private int repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
