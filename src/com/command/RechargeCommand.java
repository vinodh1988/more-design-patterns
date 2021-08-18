package com.command;

public class RechargeCommand implements Command {
    Robot r;
    
    public RechargeCommand(Robot r){
    	this.r=r;
    }
	@Override
	public void Perform() {
		// TODO Auto-generated method stub
		r.recharge();
	}
    
    
}

