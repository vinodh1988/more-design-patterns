package com.composite;

import java.util.ArrayList;
import java.util.List;

public class WholeTeam implements Team{
   protected String name;
   protected Integer teamcount;
   private List<Team> teams=new ArrayList<Team>();
   
   public WholeTeam(String name,int count)
   {
	   this.name=name;
	   this.teamcount=count;
   }
   
   public void perform() {
	 
	   System.out.println(name+ " The organization with "+teamcount+ " Employees "+ "is operating");
   	
       for(Team x:teams) {
    
    	   x.perform();
       }
   }
   
   public void addTeam(Team m) {
	   teams.add(m);
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getTeamcount() {
	return teamcount;
}

public void setTeamcount(Integer teamcount) {
	this.teamcount = teamcount;
}
   
   
}
