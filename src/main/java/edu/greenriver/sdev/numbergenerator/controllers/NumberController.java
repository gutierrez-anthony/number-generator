package edu.greenriver.sdev.numbergenerator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NumberController {

    @RequestMapping("randnum")
    public String genNumber(){
        return "randnum";
    }
}
