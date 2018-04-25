package com.example.carlijnherwardrobe.model;
//created the class
public class Wardrobe {

    //made attributes
    private String name;

    private boolean openedWardrobe;

    private boolean isInWardrobe;

    private boolean inNarnia;

    //constructor
    public Wardrobe(String name, boolean openedWardrobe, boolean isInWardrobe) {
        this.name = name;
        this.openedWardrobe = false;
        this.isInWardrobe = false;
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

    public boolean isInNarnia() {
        return inNarnia;
    }

    public void setInNarnia(boolean inNarnia) {
        this.inNarnia = inNarnia;
    }
}
