package com.example.manual;

/**
 * Created by Vinod Akkepalli on 6/26/2017.
 */

public class JokeFactory {
    public JokeFactory() {
    }

    public String getJoke(){
        return "This is auto-generated joke from " + getClass().getSimpleName();
    }

    public String getManualJoke(){
        return "This is manual joke from " + getClass().getSimpleName();
    }
}
