package com.mai.real_spring;

import com.mai.my_spring.Loggable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;

import java.util.List;

import static java.util.Arrays.asList;

@Order(1)
@Film
public class TerminatorQuoter implements Quoter {

    private List<String> messages;


    @Value("${terminator}")
    public void setMessages(String[] messages) {
        this.messages = asList(messages);
    }

    @Override
    @Loggable
    public void sayQuote() {
        messages.forEach(System.out::println);
    }
}



