package net.mayalong.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
@author mayl
@create 2020-04-05 14:23
*/
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
