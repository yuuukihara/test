package fefeaeijfoif;

public class Cleric {

	private int hp;
	private String name;
	private int mp;
	private int maxhp = 50;
	private int maxmp = 10;

	Cleric(String name,int hp,int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public void selfAid(){
		this.mp -= 5;
		this.hp = maxhp;
		System.out.println(this.name+"はmpを5消費してhpがmaxになった"+this.mp+""+this.hp);
	}

	public void pray(int sec){
		int ran = new java.util.Random().nextInt(2);
		int recover = ran+sec;

		int actual = Math.min(maxmp-this.mp,recover);
		this.mp += actual;

		System.out.println("回復量は"+actual+"現在のmp"+this.mp);
	}

}
