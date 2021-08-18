package com.command;

public class MainClass {
    public static void main(String n[]) {
    	//behavior
    	Robot r=new Humanoid();
    	
    	Instructor.Instruct(new WalkCommand(r));
    	Instructor.Instruct(new RechargeCommand(r));
    	Instructor.Instruct(new DanceCommand(r));
    	
    	r=new RobotDoll();
    	
       	Instructor.Instruct(new WalkCommand(r));
    	Instructor.Instruct(new RechargeCommand(r));
    	Instructor.Instruct(new DanceCommand(r));
    }
}
