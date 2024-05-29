package com.mai.mail_sender;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan
@EnableScheduling
public class MailConf {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(MailConf.class);
    }
}
