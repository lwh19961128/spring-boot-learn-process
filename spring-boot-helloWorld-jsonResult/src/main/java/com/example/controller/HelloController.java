package com.example.controller;

import com.example.common.api.Result;
import com.example.model.Hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public Result error() {
        Hello hello = new Hello();
        return Result.error(hello);
    }

    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public Result success() {
        Hello hello = new Hello();
        return Result.success();
    }
}
