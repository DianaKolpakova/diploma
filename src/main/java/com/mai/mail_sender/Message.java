package com.mai.mail_sender;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Message {

    private int type; // 1 - send Welcome mail, 2 - send email callback
    private String details;
}
