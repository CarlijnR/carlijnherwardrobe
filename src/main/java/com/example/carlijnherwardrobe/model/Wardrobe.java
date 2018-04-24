package com.example.carlijnherwardrobe.model;
//created the class
public class Wardrobe {

    //made attributes
    private String name;

    private boolean openedWardrobe;

    private boolean isInWardrobe;

    //constructor
    public Wardrobe(String name) {
        this.name = name;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean openedWardrobe() {
        return openedWardrobe;
    }

    public void setOpenedWardrobe(boolean openedWardrobe) {
        this.openedWardrobe = openedWardrobe;
    }

    public boolean isInWardrobe() {
        return isInWardrobe;
    }

    public void setIsInWardrobe(boolean isInWardrobe) {
        this.isInWardrobe = isInWardrobe;
    }
}
