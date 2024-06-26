package com.mai.mail_sender;

import org.springframework.stereotype.Component;

@Component
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateMailFromTemplate(Message message) {
        return "happy birthday";
    }

    @Override
    public int type() {
        return 3;
    }
}
