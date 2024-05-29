package com.mai.watch_lab;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class WatchRegime implements Regime {
    @Override
    public void a() {
        System.out.println("часы поменялись");
    }

    @Override
    public void b() {
        System.out.println("минуты поменялись");
    }
}
