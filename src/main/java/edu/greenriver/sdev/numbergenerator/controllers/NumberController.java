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

    @RequestMapping("powerball")
    public String genPowerball(Model modelVars) {
        modelVars.addAttribute("num1", service.between(1, 69));
        modelVars.addAttribute("num2", service.between(1, 69));
        modelVars.addAttribute("num3", service.between(1, 69));
        modelVars.addAttribute("num4", service.between(1, 69));
        modelVars.addAttribute("num5", service.between(1, 69));
        modelVars.addAttribute("num6", service.between(1, 29));
        return "powerball.html";
    }

    @RequestMapping("largeNumGenerator")
    public String genLargeNumber(Model modelVars) {
        modelVars.addAttribute("nums", service.betweenLarge(20, 1, 21));
        return "largeNumGenerator.html";
    }
}
