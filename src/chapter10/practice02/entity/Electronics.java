package chapter10.practice02.entity;

public class Electronics extends Item {
	private String brand; // 브랜드
	private int warranty; // 보증기간 (개월)

	public Electronics(String id, String name, int price, int quantity, String brand, int warranty) {
		super(id, name, price, quantity);
		this.brand = brand;
		this.warranty = warranty;
	}
	
	public String getBrand() { return brand; }
	public int getWarranty() { return warranty; }
	@Override
	public String getCategory() { return "Electronics"; }
	
	@Override
	public String toString() {
		// super 부모 클래스의 인스턴스를 의미
		return super.toString() + " // Brand: " + brand + ", Warranty: " + warranty + " months";
	}
}