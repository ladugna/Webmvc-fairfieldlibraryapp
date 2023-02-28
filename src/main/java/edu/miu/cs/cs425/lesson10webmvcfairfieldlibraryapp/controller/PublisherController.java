package edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.controller;

import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.service.PublisherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PublisherController {
    private PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }
    @GetMapping(value = "/secured/publisher/list")
    public ModelAndView displayPublishers(){
        var modelAndView =new ModelAndView();
        var publishers=publisherService.getAllPublisher();
        modelAndView.addObject("publishers", publishers);
        modelAndView.setViewName("secured/publisher/list");
        return modelAndView;
    }
}
