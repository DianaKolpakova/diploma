package com.mai.mail_sender;


public interface MailGenerator {
    String generateMailFromTemplate(Message message);
    int type();
}
