package com.command;

public class DanceCommand implements Command {
    Robot r;
    
    public DanceCommand(Robot r){
    	this.r=r;
    }
	@Override
	public void Perform() {
		// TODO Auto-generated method stub
		r.dance();
	}
    
    
}
