package com.mai.profiles_example;

import org.springframework.stereotype.Service;

@Service
public class MaiService {

    private MaiDao maiDao;

    public MaiService(MaiDao maiDao) {
        this.maiDao = maiDao;
    }

    public void work(){
        maiDao.crud();
    }
}
