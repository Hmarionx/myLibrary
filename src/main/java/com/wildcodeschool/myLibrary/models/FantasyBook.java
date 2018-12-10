package com.wildcodeschool.myLibrary.models;

public class FantasyBook implements Book {

    private ServiceWhatever myServiceWhatever;

    public String readExtract() {
        return "When Mr. Bilbo Baggins of Bag End announced that...";
    }

    @Override
    public String displayDrinkAdvice() {
        return null;
    }

    public void setServiceWhatever(ServiceWhatever theServiceWhatever) {
        myServiceWhatever = theServiceWhatever;
    }

    public String sayWhatever() {
        return myServiceWhatever.speak();
    }
}
