package com.operate;

import com.composite.DevelopmentTeam;
import com.composite.OperationsTeam;
import com.composite.QATeam;
import com.composite.Team;
import com.composite.WholeTeam;

public class ObjectProvider {
  static int ocounter;
  static int qcounter;
  static int dcounter;
  
  public static Team getPrototype(Team obj) {
	  WholeTeam ref=(WholeTeam)obj;
	  if(obj instanceof OperationsTeam)
		  return new OperationsTeam(ref.getName() + ++ocounter,ref.getTeamcount());
	  if(obj instanceof QATeam)
		  return new QATeam(ref.getName() + ++qcounter,ref.getTeamcount());
	  if(obj instanceof DevelopmentTeam)
		  return new DevelopmentTeam(ref.getName() + ++dcounter,ref.getTeamcount());
	  return null;
  }
}
