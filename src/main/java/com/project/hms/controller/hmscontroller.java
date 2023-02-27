package com.project.hms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.hms.Model.Book;
import com.project.hms.Service.hmsService;

@Controller
public class hmscontroller {
    
    //@GetMapping("/")
    //public String index(){
    //    return "index";
    //}


    @Autowired
    hmsService hmsservice;

    @PostMapping("/book_page")
    public String book(@ModelAttribute Book book){
        hmsservice.bookdata(book);
        return "index";
        
    }

    @GetMapping("/book")
    public String book(){
        return "book";
        
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}

