package jp.co.internous.action;

public class Test {
	public static void main(String[]args){
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 25;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro = new Person("山口次郎",44);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person sburo = new Person("山口三郎");
		System.out.println(sburo.name);
		System.out.println(sburo.age);

		Person yosida = new Person(14);
		System.out.println(yosida.name);
		System.out.println(yosida.age);

		Person itou = new Person(13,"伊藤始");
		System.out.println(itou.name);
		System.out.println(itou.age);
	}
}
