package com.utyf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * Created by adm on 08.10.2016.
 *
 */


@Configuration
@ComponentScan
public class Test {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }

    public static void main(String[] args) {

        System.out.println("Hi");
        H2.run();

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Test.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
