package javaclass;
import java.util.*;
public class Calculator {	
	float a,b;
	static float res;//result
	Calculator(float a, float b){
		this.a = a;//this refers to the object
		this.b = b;
		res =0;
	}
	
	public void add() {
		res = a+b;
	}
	public void sub() {
		res = a-b;
	}
	public void mul() {
		res = a*b;
	}
	public void div() {
		res=a/b;
	}
	public static void reset() {
		res=0; //reset res to 0
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		float n1,n2;
		System.out.println("Enter number 1 and 2:");
		n1 = s.nextFloat();
		s.nextLine();//to prevent enter from being taken as second value
		n2 = s.nextFloat();
		Calculator c = new Calculator(n1,n2);
		while(true) {
			System.out.println("MENU");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Reset");
			System.out.println("6.Exit");
			System.out.println("Enter the choice:");
			int op = s.nextInt();
			switch(op) {
			case 1:
				c.add();
				System.out.println(res);
				break;
			case 2:
				c.sub();
				System.out.println(res);
				break;
			case 3:
				c.mul();
				System.out.println(res);
				break;
			case 4:
				if(c.b==0) {System.out.println("DIVISION BY ZERO"); break;}//cant divide a number by zero
				c.div();
				System.out.println(res);
				break;
			case 5:
				reset();
				System.out.println(res);
				break;
			case 6:
				System.out.println("Exiting");
				s.close();
				System.exit(0);
			default:
				System.out.println("INVALID CHOICE");
			}
			
			
		}
	}

}
