package test;

public class Person {
	private String name;
	private int age;

	Person(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
}
