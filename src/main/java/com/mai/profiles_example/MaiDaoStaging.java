package com.mai.profiles_example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("STAGING")
public class MaiDaoStaging implements MaiDao {
    @Override
    public void crud() {
        System.out.println("saved to staging");
    }



    @Override
    public String data() {
        return "stagingdata";
    }
}
