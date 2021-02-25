package com.prvi.proj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/InfoController")
public class InfoController {

    @GetMapping
    @ResponseBody
    public String getInfo(){
        String html = "<html><head></head><body><h1>ime: brane</h1><h2>prezime: branic</h2></body></html>";
        return html;
    }

}
