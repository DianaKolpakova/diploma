package com.mai.watch_lab;

import org.springframework.stereotype.Component;

@Component
public class CalendarRegime implements Regime {
    @Override
    public void a() {
        System.out.println("года поменялись");
    }

    @Override
    public void b() {
        System.out.println("дни поменялись");
    }
}
