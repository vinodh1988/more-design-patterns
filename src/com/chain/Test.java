package com.chain;

public class Test implements Task{
    private Task t;
	
    public Test(Task t) {
    	this.t=t;
    }
	@Override
	public void doit(){
		// TODO Auto-generated method stub
		
		t.doit();
		
		System.out.println("Testing the application");
		
	}
      
}
