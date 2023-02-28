package edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SystemAdminController {

    @GetMapping(value = "/secured/sysadmin")
    public String displaySystemAdmin(){
        return "secured/sysadmin";
    }
}
