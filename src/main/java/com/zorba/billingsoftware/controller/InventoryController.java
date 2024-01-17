package com.zorba.billingsoftware.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    //Just for testing
    @GetMapping ("/team2_Suraj")
    public String inventory(){
        System.out.println("hello");
        return "hello";
    }


}
