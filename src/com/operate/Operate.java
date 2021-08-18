package com.operate;

import com.composite.DevelopmentTeam;
import com.composite.OperationsTeam;
import com.composite.QATeam;
import com.composite.WholeTeam;

public class Operate {
    public static void main(String[] args) {
		WholeTeam team=new WholeTeam("ABC Company",150);
		QATeam team1=new QATeam("QA Team For Java Project",10);
		QATeam team2=new QATeam("QA Team For ERP Project",10);
		QATeam team3=new QATeam("QA Team For Analytics Project",10);
		
		OperationsTeam operations1=new OperationsTeam("Operation team for Cloud Infra",15);
		
		DevelopmentTeam dev1=new DevelopmentTeam("Development Team for java",10);
		DevelopmentTeam dev2=new DevelopmentTeam("Development Team for ERP",10);
		DevelopmentTeam dev3=new DevelopmentTeam("Development Team for Analytics",10);
		
		team.addTeam(team1);
		team.addTeam(team2);
		team.addTeam(team3);
		team.addTeam(dev1);
		team.addTeam(dev2);
		team.addTeam(dev3);
		team.addTeam(operations1);
		team.addTeam(ObjectProvider.getPrototype(team1));
		team.addTeam(ObjectProvider.getPrototype(dev3));
		
		team.perform();
		
	}
}
