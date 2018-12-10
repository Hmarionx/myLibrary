package com.wildcodeschool.myLibrary.models;

public class ScienceFictionBook implements Book {

    private DrinkAdviceInterface drinkAdvice;

    public ScienceFictionBook(DrinkAdviceInterface theDrinkAdvice) {
        drinkAdvice = theDrinkAdvice;
    }

    @Override
    public String displayDrinkAdvice() {
        return this.drinkAdvice.sendDrinkAdvice();
    }

    @Override
    public String readExtract() {
        return "His name was Gaal Dornick...";
    }
}
