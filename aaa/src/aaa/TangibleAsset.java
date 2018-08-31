package aaa;

public abstract class TangibleAsset extends Assert{

	private String color;

	public TangibleAsset(String name,int price,String color){
		super(name,price);
		this.color = color;
	}

	public String getColor(){
		return this.color;
	}
}
