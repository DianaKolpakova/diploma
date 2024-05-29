package com.mai.profiles_example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@TestConfiguration
public class DemoTestConf {

    @Value("${JAVA_HOME}")
    private String javaHome;

    @Bean
    public MaiDao maiDao(){
        return new MaiDaoStaging();
    }


    @Bean
    public MaiService maiService() {

        return new MaiService(maiDao());
    }


}
