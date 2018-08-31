import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("入力してください");
		System.out.println(br.readLine());
	}
}
