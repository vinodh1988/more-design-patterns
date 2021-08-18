package com.state;

public class Player {
   private String name;
   private String type;
   private String jersey;
   public Player(String name,String type) {
	   this.name=name;
	   this.type=type;
   }
   public void play() {
	   System.out.println(name+" is a "+type+ " player playing with "+jersey +  " jersey" );
   }
   
   public void allot() {
	   if(this.type.contentEquals("test"))
           this.jersey="White Jersey";
	   else if(this.type.contentEquals("odi"))
           this.jersey="Color Jersey";
	   else if(this.type.contentEquals("t20"))
           this.jersey="Round neck color Jersey";
           
   }
}
