package com.example.testconfigconsumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RefreshScope
public class ProfileController {


    @Value("${member.rent.min}")
    private String memberRentMin;

    @Value("${vehicle.default.model}")
    private String vehicleModel;


    @RequestMapping("/profile")
    public String getConfig(Model model) {
        model.addAttribute("model", vehicleModel);
        model.addAttribute("min", memberRentMin);
        return "mprofile";

    }

}
