package com.gorbatenko.springshell;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String helloTo(String username) {
        return "Hello, " + username;
    }

    public String byeTo(String username, int age) {
        return "Bye, " + username + " (" + age + ")";
    }
}