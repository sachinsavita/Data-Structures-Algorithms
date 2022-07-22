package Strings;

public class ToStringDemo {
	
	static int rollno;  
	static String name;  
	static String city;  
	  
	 ToStringDemo(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 } 
	 
	 
	 public String toString(){//overriding the toString() method  
		  return rollno+" "+name+" "+city;  
		 } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ToStringDemo st = new ToStringDemo(101,"Raj","lucknow");
		
		System.out.println(st);
	}

}
