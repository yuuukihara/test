package model;

public class Fruit implements java.io.Serializable{
	private String name;
	private int price;
	private int count;

	public Fruit(String name,int price,int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}


	public Fruit(){
	}


	public String getName(){
		return this.name;
	}

	public int getPrice(){
		return this.price;
	}
	public int getTotalPrice(){
		return this.price * this.count;
	}

}
