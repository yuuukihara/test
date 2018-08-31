package test;

public class Tes {
	public static void main(String[] args){
		Person hito = new Person("太郎",20);
		System.out.println(hito.getName());
		hito.setName("花子");
		System.out.println(hito.getName());
	}
}
