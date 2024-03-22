package day08_inheritance2;

// super
class Employee{
	
	// Field
	String name;
	String department;
	
	// Constructor
	Employee(String name, String department){
		this.name = name;
		this.department = department;
	}
	
	// Method
	int getpay() { return 0; }
	
	void printEmployee() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + department);
	}
}

// sub
class SalaryMan extends Employee{
	
	// Field
	int salary;		// 기본급
	
	// Constructor
	SalaryMan(int salary, String name, String department){
		super(name, department);
		this.salary = salary;
	}
	
	// Method
	@Override
	int getpay() {
		return salary;
	}

	void printSalaryMan() {
		printEmployee();
		System.out.println("기본급 : " + salary);
	}
}

// sub (자손)
class SalesMan extends SalaryMan{
	
	// Field
	double salesIncentive;	// 판매 인센티브
	int salesVolume;		// 판매량
	
	// Constructor
	SalesMan(double salesIncentive, int salary, String name, String department){
		super(salary, name, department);
		this.salesIncentive = salesIncentive;
	}
	
	// Method
	void setSalesVolume(int salesVolume) {
		if(salesVolume < 0) {
			return;
		}
		this.salesVolume = salesVolume;
	}
	
	int getSalespay() {
		return (int)(salesIncentive * salesVolume);
	}

	@Override
	int getpay() {
		return super.getpay() + getSalespay();
	}
	
	void printSalesMan() {
		printSalaryMan();
		System.out.println("판매 인센티브 : " + salesIncentive + ", 판매량 : " + salesVolume);
	}	
}

// sub (자식)
class PartTimeWorker extends Employee{
	
	// Field
	int payPerHour;		// 시급
	int workTime;		// 일한 시간
	
	// Constructor
	PartTimeWorker(int payPerHour, String name, String department){
		super(name, department);
		this.payPerHour = payPerHour;
	}
	
	// Method
	void setWorkTime(int workTime) {
		if(workTime < 0) return;
		else if(workTime > 200) {
			this.workTime = 200;
		}
		else this.workTime = workTime;
	}

	@Override
	int getpay() {
		return payPerHour * workTime;
	}
	
	void printPartTimeWorker() {
		printEmployee();
		System.out.println("급여 : " + getpay() + ", 일한 시간 : " + workTime);
	}
}

public class Ex05_Employee {
	public static void main(String[] args) {
		
		SalaryMan salaryman = new SalaryMan(300, "송재훈", "홍보부");
		SalesMan salesman = new SalesMan(0.1, 100, "김현태", "영업부");
		salesman.setSalesVolume(1000);
		PartTimeWorker alba = new PartTimeWorker(1, "신준섭", "판매부");
		alba.setWorkTime(150);
		
		System.out.println("salaryman 월급 : " + salaryman.getpay() + "만원");
		System.out.println("salesman 월급 : " + salesman.getpay() + "만원");		
		System.out.println("alba 월급 : " + alba.getpay() + "만원");
		
		
		
		
	}
}
