package clacapp.main;
import clacapp.logics.CalcLogic;
public class Calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 2;
		int total = CalcLogic.tasu(a,b);
		int delta = CalcLogic.hiku(a,b);
		System.out.println(total + delta);

		int [] height = {124,34123,142,32,431};
		for( int h :height){
			java.util.Arrays.sort(height);
			System.out.println(h);
		}
	}

}
