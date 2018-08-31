package aaa;

public abstract class Assert {

	private String name;
	private int price;

	public Assert(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
