package com.state;

public class Main {
   public static void main(String n[]) {
	   PlayerBehavior.whatDoesHeDo(new ODIPlayer("Rahul","odi"));   
	   PlayerBehavior.whatDoesHeDo(new TestPlayer("Ganesh","test"));   
	   PlayerBehavior.whatDoesHeDo(new T20Player("Jay","t20"));   
   }
}
