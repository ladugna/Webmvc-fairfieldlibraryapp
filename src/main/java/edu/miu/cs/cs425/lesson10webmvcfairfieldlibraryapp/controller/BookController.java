package edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.controller;

import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = "/secured/book/list")
    public ModelAndView displayBooks(){
        var modelAndView =new ModelAndView();
        var books=bookService.getAllBooks();
        modelAndView.addObject("books", books);
        modelAndView.setViewName("secured/book/list");
        return modelAndView;
    }
}
