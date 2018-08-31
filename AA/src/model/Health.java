package model;

import java.io.Serializable;

public class Health implements Serializable{
	private double weight;
	private double height;
	private double bmi;
	private String bodytype;

	public double getWeight(){
		return this.weight;
	}
	public double getHeight(){
		return this.height;
	}
	public double getBMI(){
		return this.bmi;
	}
	public String getBodyType(){
		return this.bodytype;
	}

	public void setWeight(double weight){
		this.weight = weight;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public void setBMI(double bmi){
		this.bmi = bmi;
	}
	public void setBodyType(String bodytype){
		this.bodytype = bodytype;
	}

}
