package test3;

public class Hero {
	private String name="みなと";
	private int hp =100;

	public void atttack(Matango m){
		System.out.println(this.name +"の攻撃");
		m.hp -=5;
		System.out.println("5のダメージを与えた");
	}

	public void run(){
		System.out.println(this.name+"は逃げ出した");
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getHp(){
		return this.hp;
	}

	public void setHp(int hp){
		this.hp = hp;
	}

}
