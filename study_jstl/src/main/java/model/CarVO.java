package model;

public class CarVO {
	private String num;
	private String name;
	private int price;
	
	public CarVO() {}

	public CarVO(String num, String name, int price) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
	}

	public String getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}
