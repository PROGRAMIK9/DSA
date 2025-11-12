package javaclass;

public class Animal {
	String habitat;
	String name;
	int age;
	static int count;
	Animal(String habitat, String name, int age){
		this.habitat = habitat;
		this.name = name;
		this.age = age;
		count++;
	}
	
	void displayHabitat(){
		System.out.println(this.habitat);
	}
	
	int age() {
		int s;
		return this.age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal rabbit = new Animal("land","rabbit",10);
		rabbit.displayHabitat();
		Animal lion = new Animal("Land","Lion",20);
		int age = lion.age();
		System.out.println(count);
		System.out.println(age);
		if(true) {
			int s;
		}
	}

}
