package edu.greenriver.sdev.numbergenerator.controllers;

import edu.greenriver.sdev.numbergenerator.services.NumberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NumberController {
    private NumberService service;

    public NumberController(NumberService service) {
        this.service = service;
    }

    @RequestMapping("randnum")
    public String genNumber(Model modelVars){
        modelVars.addAttribute("num", service.between(1, 20));
        return "randnum.html" ;
    }
}
