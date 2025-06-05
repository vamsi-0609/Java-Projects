package Tests;


class Animal{

	void eat() {
		System.out.println("Animal eating the food");
	}
	
	void sleep() {
		System.out.println("Animal is sleeping");
	}
	
	void running() {
		System.out.println("Animal is running fast");
	}
}

class Dog extends Animal{
	String dname;
	Dog(String name){
		this.dname = name;
		System.out.println("This animal is a Dog and it is named as "+ dname);
	}
	
	void bark() {
		System.out.println(dname + " is a barking");
	}
	
	
	
}

class cat extends Animal{
	String cname;
	cat(String name){
		this.cname = name;
		System.out.println("This animal is a cat and it is named as "+ cname);
	}
	
	void sound() {
		System.out.println("Cat is making sound 'MEOW MEOW'");
	}
}

public class InheritanceEx {
	public static void main(String[] args) {
		System.out.println("----------------Dog-------------------");
		Dog d = new Dog("Chintu");
		d.bark();
		d.eat();
		d.sleep();
		System.out.println();
		System.out.println("---------------Cat--------------------");
		cat c = new cat("Tom");
		c.sound();
		c.running();
		

		
		
		
	}

}
