package com.command;

public class Humanoid implements Robot{
   public void walk() {
	   System.out.println("Robot is walking");
   }
   
   public void dance() {
	   System.out.println("Robot is dancing");
   }
   
   public void recharge() {
	   System.out.println("Robot is rechargin itself with some current");
   }
}
