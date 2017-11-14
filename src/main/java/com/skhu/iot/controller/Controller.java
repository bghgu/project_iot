package com.skhu.iot.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ds on 2017-11-02.
 */

@RestController
public class Controller {

    @GetMapping("/")
    public @ResponseBody String test() {
        System.out.println(1);
        return "1";
    }

    @PostMapping("/")
    public @ResponseBody String a(@RequestBody String data) {
        System.out.println(data);
        return data;
    }
}
