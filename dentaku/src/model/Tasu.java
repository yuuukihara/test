package model;

import java.io.Serializable;

public class Tasu implements Serializable{
	private int tasu1;
	private int tasu2;
	private int tasu3;
	private int tasu4;
	private int total;


	public Tasu(){}

	public Tasu(int tasu1,int tasu2,int tasu3,int tasu4){
		this.tasu1 = tasu1;
		this.tasu2 = tasu2;
		this.tasu3 = tasu3;
		this.tasu4 = tasu4;
	}
	public int getTasu1(){
		return tasu1;
	}
	public int getTasu2(){
		return tasu2;
	}
	public int getTasu3(){
		return tasu3;
	}
	public int getTasu4(){
		return tasu4;
	}
	public void setTotal(int setTotal){
		this.total = setTotal;
	}
	public int getTotal(){
		return total;
	}
}