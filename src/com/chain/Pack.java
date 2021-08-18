package com.chain;

public class Pack implements Task {
	  private Task t;
		
	    public Pack(Task t) {
	    	this.t=t;
	    }
		@Override
		public void doit() {
			// TODO Auto-generated method stub
		
			t.doit();
			
			System.out.println("Packing the application");
			
		}
}
