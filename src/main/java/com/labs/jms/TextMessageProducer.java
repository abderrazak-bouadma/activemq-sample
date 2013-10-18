package com.labs.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TextMessageProducer {

    private static final String PRODUCER_ID = "Producer #1";

    @Autowired
    private JmsTemplate jmsTemplate;

    void send() {
        int i = 0;
        while (true) {
            jmsTemplate.convertAndSend("Hello World ! for the " + i++ + " time, it's " + new SimpleDateFormat("dd/MM/yyyy hh:mm").format(new Date()));
        }

    }

    public void start() {
        send();
    }
}
