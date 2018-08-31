package model;

import java.io.Serializable;

public class Human implements Serializable{
	private String name;
	private int age;

	public Human(){
	}

	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return this.age;
	}

	public void setAge(int age){
		this.age = age;
	}

}
