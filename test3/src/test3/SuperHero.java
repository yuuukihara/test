package test3;

public class SuperHero extends Hero{
	private boolean flying;
	public void fly(){
		this.flying = true;
		System.out.println("飛び上がった");
	}
	public void land(){
		this.flying = false;
		System.out.println("着陸した");
	}
	public void run(){
		System.out.println(getName()+"は撤退した");
	}
	
	
}
