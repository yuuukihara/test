package practice2;

public class Seisyokusya {
	String name;
	int hp=50;
	final int MAXHP=50;
	int mp=10;
	final int MAXMP=10;

	void selfAid(){
		this.mp -= 5;
		this.hp = MAXHP;
		System.out.println("聖職者"+this.name+"はセルフエイドを発動！MP5を消費してHPがmaxになった");
	}

	int pray(int sec){
		System.out.println("現在MP"+this.mp+"聖職者"+this.name+"は"+sec+"間祈った");
		int recover = new java.util.Random().nextInt(3)+sec;

		int recoverActual = Math.min(this.MAXMP-this.mp, recover);

		this.mp += recoverActual;
		System.out.println("MPが"+recoverActual+"回復して現在"+this.mp);
		return recoverActual;
	}

}
