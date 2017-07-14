package com.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyClass {

    @Autowired
    SpellChecker spellChecker;


    public void print(){
        spellChecker.check();

    }

}
