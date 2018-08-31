package jp.co.internous.action;

public class Test {
	public static void main(String[]args){
		Person taro = new Person();
		taro.name ="山田太郎";
		taro.age = 25;
		taro.address = "中野";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.address);
		taro.talk();

		Person ziro = new Person();
		ziro.name ="木村次郎";
		ziro.age = 18;
		System.out.println(ziro.name);
		System.out.println(ziro.age);

		Person hana = new Person();
		hana.name ="伊藤花子";
		hana.age = 11;
		System.out.println(hana.name);
		System.out.println(hana.age);

		Robot a = new Robot();
		a.name = "aibo";
		a.talk();

		Robot b = new Robot();
		b.name = "asimo";
		b.run();

		Robot c = new Robot();
		c.name = "peppar";
		c.walk();

		Robot d = new Robot();
		d.name = "doraemon";
		d.talk();

	}

}
