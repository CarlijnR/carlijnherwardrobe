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

    private Wardrobe wardrobe = new Wardrobe("Kledingkast", false,false);

    @GetMapping("/new")
    public String newWardrobe () {
        return("IKEA just delivered a brand new wardrobe for you to play with");
    }

    @GetMapping("/open")
    public String openWardrobe() {
        if (wardrobe.openedWardrobe() == false) {
            wardrobe.setOpenedWardrobe(false);
            //places the sentence in the div
            return("The wardrobe opens");
        } else {
            return("You can't open the wardrobe, it was already open");
        }
    }

    @GetMapping("/close")
    public String closeWardrobe() {
        if (wardrobe.openedWardrobe() == true) {
            wardrobe.setOpenedWardrobe(false);
            return("The wardrobe closes");
        } else {
            return("You can't close the wardrobe, it was already closed");
        }
    }

    @GetMapping("/getIn")
    public String getInWardrobe() {
        double narniaChance = ((Math.random() * 10) + 1);
        if (wardrobe.isInWardrobe() == true || wardrobe.openedWardrobe()== false) {
            return("You can't get in the wardrobe, because you are already inside");
        } else if (narniaChance <= 8){
            wardrobe.setIsInWardrobe(true);
            return("You are now inside the wardrobe, you see a fine collection of clothes.");
        } else {
            wardrobe.setIsInWardrobe(true);
            wardrobe.setInNarnia(true);
            return("You have entered the magic world of Narnia");

        }
    }

    @GetMapping("/getOut")
    public String getOutWardrobe() {
        if (wardrobe.isInWardrobe() == true) {
            wardrobe.setIsInWardrobe(false);
            return("You are now outside the wardrobe again");
        } else {
            return("You cant go out of the wardrobe, because you are already outside");
        }
    }

    @GetMapping("/kick")
    public String kickWardrobe () {
        //placed variable in function to let it calculate each time the button is pressed
        double powerKick = ((Math.random() * 10) + 1);
        if (powerKick > 9) {
            return("The housekeeper gives you a time out");
        } else {
            return("You have hurt your foot!");
        }
    }
}
