package com.chain;
//chain of responsibilities
public class Chain {
   
	public static void release() {
		Task t=new Pack(new Test(new Build()));
		t.doit();
		System.out.println("Product successfully packed we are releasing it");
	}
}
