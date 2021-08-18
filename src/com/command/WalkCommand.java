package com.command;

public class WalkCommand implements Command {
    Robot r;
    
    public WalkCommand(Robot r){
    	this.r=r;
    }
	@Override
	public void Perform() {
		// TODO Auto-generated method stub
		r.walk();
	}
    
    
}
