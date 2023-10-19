package com.tester;
import com.code.Person;
public class Testperson {

	public static void main(String[] args) {
		Person p=new Person();
		p.display();
		System.out.println("Name= "+p.getName());
		System.out.println("Age= "+p.getAge());
		System.out.println("City= "+p.getCity());
		p.setName("Pranav");
		p.setCity("mumbai");
		p.setAge(25);
		p.display();
		
		Person p1=new Person("Shreyas",23,"Chatrapati Sambhaji Nagar");
		p1.display();
		System.out.println("Name= "+p1.getName());
		System.out.println("Age= "+p1.getAge());
		System.out.println("City= "+p1.getCity());
		p1.setName("Shreyu");
		p1.setCity("Nashik");
		p1.setAge(24);
		p1.display();
		
	}

}
