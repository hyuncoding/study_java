//package classTest;
//
//class Store {
//
//	String product;
//	int price;
//	int count;
//
//	public Store(String product, int price, int count) {
//		this.product = product;
//		this.price = price; 
//		this.count = count;
//	}
//	
//	void sellProduct(Customer customer) {
//		double discountedPrice = 0.0;
//		if(count > 0) {
//			count--;
//			discountedPrice = Double.parseDouble(String.format("%.3f", price * (100 - customer.discountRate) / 100.0));
//			customer.buyProduct(discountedPrice);
//			return;
//		} 
//		customer.buyProduct(0.0);
//		return;
//	}
//}
//
//class Customer {
//	
//	String name;
//	String phoneNumber;
//	double money;
//	int discountRate;
//	
//	public Customer(String name, String phoneNumber, double money, int discountRate) {
//		this.name = name;
//		this.phoneNumber = phoneNumber;
//		this.money = money;
//		this.discountRate = discountRate;
//	}
//	
//	void buyProduct(double productPrice) {
//		if(productPrice == 0) {
//			return;
//		}
//		money -= productPrice;
//		return;
//	}
//}
//
//public class ClassTask3 {
//	public static void main(String[] args) {
//		
//		Store store1 = new Store("iPad", 1_000_000, 5);
//		Customer customer1 = new Customer("ȫ�浿", "01012341234", 1_200_000, 10); 
//		
//		System.out.println(store1.count);
//		System.out.println(customer1.money);
//		
//		store1.sellProduct(customer1);
//		
//		System.out.println(store1.count);
//		System.out.println(customer1.money);
//		
//	}
//}
