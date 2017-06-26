package com.example;

import com.example.manual.JokeFactory;

public class JokeFactoryAuto {

    public JokeFactoryAuto() {
    }

    public String getJoke(){
        return "Auto-generated joke from " + getClass().getSimpleName();
    }

    public String getManualJoke(){
        return new JokeFactory().getManualJoke();
    }
}
