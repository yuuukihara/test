package aa;

public class model {
	private String id;
	private String name;

	public model(String id,String name){
		this.id = id;
		this.name = name;
	}

	public String getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}

}
