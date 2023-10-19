package com.code;

public class Person {
	private String name;
	private int age;
	private String city;
	public Person() {
		System.out.println("-----Default Constructor-------");
		name="Rishabh";
		age=27;
		city="pune";
	}
	public Person(String name, int age, String city) {
        System.out.println("----paremeterize contructor invoked-----");
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void display()
	{
		System.out.println("Name="+name+ " "+"Age= "+age+" "+"City= "+city);
	}
	

	

}
