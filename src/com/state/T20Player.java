package com.state;

public class T20Player extends Player{
	public T20Player(String name,String type){
		super(name,type);
	}
    public void play() {
    	super.play();
    	System.out.println("he has very little time, he ll play too fast");
    }
}
