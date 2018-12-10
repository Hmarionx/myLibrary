package com.wildcodeschool.myLibrary.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fantasyBook")
public class FantasyBook implements Book {


    private ServiceWhatever myServiceWhatever;
    private DrinkAdviceInterface drinkAdvice;

    @Autowired
    public FantasyBook(@Qualifier("cosyDrinkAdvice") DrinkAdviceInterface theDrinkAdvice) {
        drinkAdvice = theDrinkAdvice;
    }

    public String readExtract() {
        return "When Mr. Bilbo Baggins of Bag End announced that...";
    }

    public String displayDrinkAdvice() {
        return this.drinkAdvice.sendDrinkAdvice();
    }


    public void setServiceWhatever(ServiceWhatever theServiceWhatever) {
        myServiceWhatever = theServiceWhatever;
    }

    public String sayWhatever() {
        return myServiceWhatever.speak();
    }
}
