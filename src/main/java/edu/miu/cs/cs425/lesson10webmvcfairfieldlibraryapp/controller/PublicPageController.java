package edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicPageController {

    //    @RequestMapping(value = "/", method = RequestMethod.GET) // version 3.X
    @GetMapping(value = "/") // version 4.x+
    public String displayHomePage(){
        return "public/index";
    }

    @GetMapping(value = "/about")
    public String displayAboutPage(){
        return "public/about";
    }
}
