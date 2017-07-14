package com.springlearning;

import org.springframework.stereotype.Component;

@Component
public class SpellChecker {

    public SpellChecker(){
        System.out.println("Inside SpellChecker constructor." );
    }

    public void checkSpelling(){
        System.out.println("Inside checkSpelling." );
    }

    public void check() {
        System.out.println("Inside check" );
    }
}
