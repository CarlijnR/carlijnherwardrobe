package com.example.carlijnherwardrobe.controller;

//import the model and springboot
import com.example.carlijnherwardrobe.model.Wardrobe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//making a path
@RequestMapping("/api/wardrobe")
public class WardrobeController {

    //make a path and create a new wardrobe -> doesn't work atm
    @GetMapping("/test/{name}")
    public void createWardrobe(@PathVariable String name) {
        Wardrobe testobject = new Wardrobe(name);
    }
}
