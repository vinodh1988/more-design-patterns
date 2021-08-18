package com.composite;

public class DevelopmentTeam extends WholeTeam {
    
	public DevelopmentTeam(String name,int count)
	{
		super(name,count);
	}
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Team "+ name+" performing Development with "+teamcount+ " employees");
	}

}
