package staticTest;

class Company{
	static int money;
	String name;
	int age;
	int income;
	
	public Company(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class StaticTask {
	public static void main(String[] args) {
		Company employee1 = new Company("ÇÑµ¿¼®", 20);
		Company employee2 = new Company("ÀÌµµÀº", 21);
		Company employee3 = new Company("¼­°æ´ö", 22);
		Company employee4 = new Company("±èÈ«ÁØ", 23);
		
		employee1.income += 10_000;
		employee2.income += 1_000;
		employee3.income += 2_000;
		employee4.income -= 10_000;
		
		employee1.money += employee1.income;
		employee2.money += employee2.income;
		employee3.money += employee3.income;
		employee4.money += employee4.income;
		
		System.out.println(Company.money);
	}
}
