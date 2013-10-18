package com.labs.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import java.util.HashMap;
import java.util.Map;


public class MapMessageProducer {

    private static final String PRODUCER_ID = "MAP_MSG";

    @Autowired
    private JmsTemplate jmsTemplate;

    void send() {
        Map<String, String> map = new HashMap<String, String>();
        int i = 0;
        while (true) {
            map.put("Hello World #" + i++, "Hello World");
            jmsTemplate.convertAndSend(map);
        }
    }

    public void start() {
        send();
    }
}
