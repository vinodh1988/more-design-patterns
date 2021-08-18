package com.state;

public class TestPlayer extends Player {
	
	TestPlayer(String name,String type){
		super(name,type);
	}
    public void play() {
    	super.play();
    	System.out.println("he has all the time in the world , will play too slow");
    }
}
