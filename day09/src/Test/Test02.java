package Test;

class Product{
	private String model;
	private int price;
	
	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public String getModel() { return model; }
	public int getPrice() { return price; }
}

class TV extends Product{
	public TV(String model, int price) {
		super(model, price);
	}
}

class Computer extends Product{
	public Computer(String model, int price) {
		super(model, price);
	}
}

class Customer{
	private int money;
	private int bonusPoint;
	private Product[] cart = new Product[2];
	private int numOfProduct;
	
	public Customer(int money) {
		this(money, 0);
	}
	
	public Customer(int money, int bonusPoint) {	// 기존회원
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	public void buy(Product product) {
		if(money < product.getPrice()) {
			System.out.println("돈이 " + (product.getPrice() - money) + "원 부족하다.");
			return;
		}
		money -= product.getPrice();
		bonusPoint += (int)(product.getPrice() * 0.05);
		cart[numOfProduct++] = product;
	}
	
	public void purchaseList() {
		int total = 0;
		
		for(int i = 0; i < numOfProduct; i++) {
			System.out.println(cart[i].getModel() + " : " + cart[i].getPrice());
			total += cart[i].getPrice();
		}
		System.out.println("총 구매금액 : " + total);
		System.out.println("보너스 포인트 : " + bonusPoint);
		System.out.println("남은 돈 : " + money);
		System.out.println("---------------------");
	}
}

public class Test02 {
	public static void main(String[] args) {

		Customer customer1 = new Customer(50000);
		customer1.buy(new TV("헬로티비", 15000));
		customer1.buy(new Computer("삼성컴퓨터", 30000));
		
		customer1.purchaseList();
		
	    Customer customer2 = new Customer(100000, 50);
	    customer2.buy(new TV("헬로티비", 50000));
	    customer2.buy(new Computer("삼성컴퓨터", 45000));
	    
	    customer2.purchaseList();
	}
}
