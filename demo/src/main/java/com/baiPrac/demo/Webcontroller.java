package com.baiPrac.demo;

import org.springframework.stereotype.Controller;
import org.spirngframework.web.bind.annotation.*;

@Controller
public class WebController {

    @GetMapping(value = "/")
    @ResponseBody
    public String index(){
        return "Hello World!";
    }
}
