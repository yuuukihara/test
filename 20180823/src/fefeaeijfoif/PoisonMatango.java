package fefeaeijfoif;

public class PoisonMatango extends Matango{

	public PoisonMatango(int hp,String suffix){
		this.hp = hp;
		this.suffix = suffix;
	}

	private int attackCount = 5;

	public void attack(Hero h){
		super.attack(h);
		if(this.attackCount >0 ){
			System.out.println("胞子をばら撒いた");
			int damege;
			damege = h.hp/5;
			h.hp -= damege;
			System.out.println(damege+"のダメージ"+h.hp);
			attackCount--;
		}
	}

}
