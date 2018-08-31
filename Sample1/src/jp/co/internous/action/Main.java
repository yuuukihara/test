package jp.co.internous.action;

public class Main {
	public static void main(String[] args){
		System.out.println("Hello");
		System.out.println(goukei());
		System.out.println(goukei2(2,13));
	}
	public static int goukei(){
		return 1+2;
	}
	public static int goukei2(int num1,int num2){
		return num1+num2;
	}
}
