package com.springlearning;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	//sout
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
