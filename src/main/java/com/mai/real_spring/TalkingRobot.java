package com.mai.real_spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component("tr")
public class TalkingRobot {


    @Film
    private List<Quoter> quoters;

    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}








