package com.mai.profiles_example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("PROD")
public class MaiDaoProduction implements MaiDao {
    @Override
    public void crud() {
        System.out.println("saved to prod");
    }

    @Override
    public String data() {
        return "proddata";
    }
}
