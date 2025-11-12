package javaclass;

import java.util.*;


public class Pg1 {
	
	String regno;
	String name;
	static String cls;
	
	Pg1(String regno, String name){
		this.regno = regno;
		this.name = name;
		cls = "MCA";
	}
	
	Pg1(Pg1 p){
		this.regno =  p.regno;
		this.name = p.name;
	}
	
	 float display() {
		System.out.println("USN: "+regno);
		System.out.println("Name: "+name);
		return 22;
	}
	
	static void classInfo() {
		System.out.println("All students are of "+ cls);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		boolean b = false;

		System.out.println("Enter the USN:");
		String r = s.nextLine();
		
		System.out.println("Enter the name:");
		String n = s.nextLine();
		
		Pg1 p = new Pg1(r,n);
		Pg1 sc = new Pg1(r,n);
		float ss = p.display();
		Pg1 x = new Pg1(p);
		x.display();
		
		Pg1.classInfo();
		
		s.close();
	}
}
