package com.gorbatenko.springshell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HelloShell {

    private final HelloService helloService;

    public HelloShell(HelloService helloService) {
        this.helloService = helloService;
    }

    @ShellMethod(key = "hello-to", value = "Say hello to username")
    public String helloTo(@ShellOption({"username", "u"}) String username) {
        return helloService.helloTo(username);
    }

    @ShellMethod("buy to name and age")
    public String byeTo(String name, int age) {
        return helloService.byeTo(name, age);
    }
}