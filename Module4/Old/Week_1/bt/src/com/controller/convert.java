package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class convert {
    @GetMapping("/home")
    public String home(){
        return "result";
    }

    @GetMapping("/convert")
    public String convertUSD(@RequestParam long moneyUSD, Model model){
        model.addAttribute("moneyVND",moneyUSD*21000);
        return "result";
    }
}
