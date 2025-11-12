package javaclass;

public class Conditiinals {
	public static void main(String args[]) {
		for(int i =0; i< 11; i++) {
			if(i==9)break;
			if(i%2==0) continue;
			System.out.println(i);
		}
	}
}
