package com.composite;

public class OperationsTeam extends WholeTeam {
	public OperationsTeam(String name,int count)
	{
		super(name,count);
	}
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Team "+ name+" performing Operations with "+teamcount+ " employees");
	}
}
