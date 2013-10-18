package com.labs.jms;

import javax.jms.*;


public class MessageConsumer implements MessageListener {

    @Override
    public void onMessage(final Message message) {
        if (message instanceof TextMessage) {
            TextMessage aMessage = (TextMessage) message;
            try {
                System.out.println("TextMessage : " + aMessage.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        } else if (message instanceof MapMessage) {
            MapMessage mapMessage = (MapMessage) message;
            try {
                System.out.println("MapMessage : " + mapMessage.getMapNames());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }

    }
}
