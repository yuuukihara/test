package test3;

public class Matango {
	int hp;
	final int LEVEL = 10;
	char suffix;

	void run(){
		System.out.println("敵"+this.suffix+"は逃げ出した");
	}
	void attack(){
		System.out.println("３のダメージをうけた");
		this.hp -= 3;
		System.out.println("敵のHPは"+this.hp);
	}

}
