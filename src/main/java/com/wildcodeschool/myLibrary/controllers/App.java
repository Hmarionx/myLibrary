package com.wildcodeschool.myLibrary.controllers;

import com.wildcodeschool.myLibrary.models.Book;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class App {
    void start() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        Book myBook = context.getBean("theBook", Book.class);
        context.close();

        System.out.println("");
        System.out.println("******************");
        System.out.println(myBook.readExtract());
        System.out.println("******************");
        System.out.println(myBook.displayDrinkAdvice());
        System.out.println("******************");
    }
}
