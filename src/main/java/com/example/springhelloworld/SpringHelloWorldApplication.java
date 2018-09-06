package com.example.springhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class SpringHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHelloWorldApplication.class, args);
    }

    @RequestMapping("/hello")
    public String seyHello() {

        String str = "Hello world!!!";

        try {
            str += "<br/> <br/> Hostname: " + InetAddress.getLocalHost().getHostName();
            str += "<br/> <br/> Server Time: " + LocalDateTime.now();
        } catch (UnknownHostException e) {

            // do nothing
        }

        return str;
    }
}
