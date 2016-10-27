package com.utyf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by adm on 09.10.2016.
 *
 */

@Component
public class MessagePrinter {
    @Autowired
    private MessageService service;

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
