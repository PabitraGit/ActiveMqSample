package com.tr.mainapp;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ReceiveMessage {

	@JmsListener(destination = "sampleQueue")
    public void receiveMessage(String msg) {
        System.out.println("Received :" + msg);
    }
}
