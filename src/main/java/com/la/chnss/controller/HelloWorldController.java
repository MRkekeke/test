package com.la.chnss.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "？？？？";
    }

    @GetMapping("/asd")
    public String asd() {
        return "asd";
    }

    @GetMapping("/qwe")
    public String qwe(int a) {
        return "qwe" + a;
    }

    @GetMapping("/person")
    public String person(String name) {
            return   name+"真漂亮" ;

    }
}
