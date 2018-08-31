package test3;

public class Character {
	String name;
	int hp;

	public void run(){
		System.out.println(this.name+"は逃げ出した");
	}
	public void atttack(Matango m){
		System.out.println(this.name +"の攻撃");
		m.hp -=5;
		System.out.println("5のダメージを与えた");
		m.hp
	}

}
