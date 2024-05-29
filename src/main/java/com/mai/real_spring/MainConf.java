package com.mai.real_spring;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@PropertySource("classpath:application.properties")
//@ImportResource("classpath:context.xml")
public class MainConf {


    @Bean
    public Quoter shakeSpearSuper() {
        return new ShakespearQuoter();
    }


    public static void main(String[] args) {

//        ApplicationContext context = SpringApplication.run(MainConf.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);
        System.out.println();

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//                context.getBean(TalkingRobot.class).talk();

    }
}
