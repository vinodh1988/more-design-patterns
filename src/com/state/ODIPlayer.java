package com.state;

public class ODIPlayer extends Player{
	public ODIPlayer(String name,String type){
		super(name,type);
	}
    public void play() {
    	super.play();
    	System.out.println("he has only one day but 50 over, will play bit fast");
    }
}
