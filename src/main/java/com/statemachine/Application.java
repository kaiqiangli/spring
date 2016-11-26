package com.statemachine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

/**
 * @author likaiqiang
 * @description application boot
 * @create 2016-11-13 下午2:57
 **/
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private StateMachine<States, Events> stateMachine;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        stateMachine.sendEvent(Events.E1);
        stateMachine.sendEvent(Events.E2);
    }

}
