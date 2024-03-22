package Test;

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
	int getPay() { return 0; }
	
	void empInfo() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + department);
	}
}

// sub -1(자식)
class SalaryWorker extends Employee{
	// Field
	int salary;
	
	// Constructor
	SalaryWorker(int salary, String name, String department){
		super(name, department);
		this.salary = salary;
	}
	
	// Method
	@Override
	int getPay() {
		return salary;
	}

	@Override
	void empInfo() {
		super.empInfo();
		System.out.println("기본급 : " + getPay() + "만원");
		System.out.println("----------------------");
	}
}

// sub -2(자손)
class SalesWorker extends SalaryWorker{
	// Field
	int salesVolume;
	double salesIncentive;
	
	// Constructor
	SalesWorker(int salary, String name, String department){
		super(salary, name, department);
	}
	
	// Method
	@Override
	int getPay() {
		return super.getPay() + getSalesPay();
	}

	@Override
	void empInfo() {
		System.out.println("판매수당 : " + getSalesPay() + "만원");
		super.empInfo();
	}
	
	int getSalesPay() {
		return (int)(salesVolume * salesIncentive);
	}
	
	void setSalesVolume(int salesVolume) {
		if(salesVolume < 0) return;
		this.salesVolume = salesVolume;
		if(salesVolume < 500) setSalesIncentive(0.03);
		else if(salesVolume < 1000) setSalesIncentive(0.05);
		else setSalesIncentive(0.1);
	}
	
	void setSalesIncentive(double salesIncentive) {
		this.salesIncentive = salesIncentive;
	}
}

// sub -3(자식)
class PartTimeWorker extends Employee{
	// Field
	int workTime;
	int payPerHour;
	
	// Constructor
	PartTimeWorker(int payPerHour, String name, String department){
		super(name, department);
		this.payPerHour = payPerHour;
	}
	
	// Method
	@Override
	int getPay() {
		return workTime * payPerHour;
	}

	@Override
	void empInfo() {
		super.empInfo();
		System.out.println("월급 : " + getPay() + "만원");
		System.out.println("------------------------");
	}
	
	void setWorkTime(int workTime) {
	    if(workTime < 0) return;
	    else if(workTime > 200) this.workTime = 200;
	    else this.workTime = workTime;
	}
}

public class Test01 {
	public static void main(String[] args) {
		
		Employee[] em = new Employee[3];
		em[0] = new SalaryWorker(400, "송재훈", "홍보부");
		em[1] = new SalesWorker(100, "김현태", "영업부");
		em[2] = new PartTimeWorker(1, "신준섭", "판매부");
		
		for(Employee employee : em) {
			if(employee instanceof SalesWorker) {
				((SalesWorker)employee).setSalesVolume(1200);
			} else if(employee instanceof PartTimeWorker) {
				((PartTimeWorker)employee).setWorkTime(180);
			}
			employee.empInfo();
		}
		
		
		
	}
}
