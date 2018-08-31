
public class Person {
	public String name;
	private int age;

	
	public Person(String name , int age){
		this.name = name;
	}
	public Person(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

}
