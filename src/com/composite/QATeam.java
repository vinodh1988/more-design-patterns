package com.composite;

public class QATeam extends WholeTeam {
	public QATeam(String name,int count)
	{
		super(name,count);
	}
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Team "+ name+" performing QA with "+teamcount+ " employees");
	}
}
