package day10_abstract;

// super
abstract class Employee{
	// Field
	private String name;
	private String department;

	// Constructor
	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	
	// Method
	abstract public int getPay();	// 하나라도 추상 메소드가 있으면 추상 클래스가 된다.
	
	public void empInfo() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + department);		
	}
}

// sub - 1
class SalaryWorker extends Employee{
	// Field
	private int salary;
	
	// Constructor
	public SalaryWorker(String name, String department, int salary) {
		super(name, department);
		this.salary = salary;
	}

	// Method
	@Override
	public int getPay() {
		return salary;
	}

	@Override
	public void empInfo() {
		super.empInfo();
		System.out.println("기본급 : " + getPay() + "만원");
		System.out.println("--------------------------");
	}
}

// sub - 1.1 (자손)
class SalesWorker extends SalaryWorker{
	// Field
	private int salesVolume;
	private double salesIncentive;
	
	// Constructor
	public SalesWorker(String name, String department, int salary) {
		super(name, department, salary);
	}

	// Method
	public void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
		if(salesVolume < 500) setSalesIncentive(0.01);
		else if(salesVolume < 1000) setSalesIncentive(0.05);
		else setSalesIncentive(0.1);
	}

	public void setSalesIncentive(double salesIncentive) {
		this.salesIncentive = salesIncentive;
	}
	
	public int getSalesPay() {
		return (int)(salesIncentive * salesVolume);
	}

	@Override
	public int getPay() {
		return super.getPay() + getSalesPay();
	}

	@Override
	public void empInfo() {
		System.out.println("판매수당 : " + getSalesPay() + "만원");
		super.empInfo();
	}
}

// sub - 2
class PartTimeWorker extends Employee{
	// Field
	private int workTime;
	private int payPerHour;
	
	// Constructor
	public PartTimeWorker(String name, String department, int payPerHour) {
		super(name, department);
	    this.payPerHour = payPerHour;
	}
	
	// Method
	public void setWorkTime(int workTime) {
		if(workTime < 0) return;
		else if(workTime > 200) this.workTime = 200;
		else this.workTime = workTime;
	}

	@Override
	public int getPay() {
		return workTime * payPerHour;
	}

	@Override
	public void empInfo() {
		super.empInfo();
		System.out.println("월급 : " + getPay() + "만원");
		System.out.println("--------------------------");
	}
}

class EmployeeManager{
	// Field
	private Employee[] em;
	private int idx;
	
	// Constructor
	public EmployeeManager(int count) {
		em = new Employee[count];
	}
	
	// Method
	public void addEmployee(Employee emp) {
		this.em[idx++] = emp;
	}
	
	public void empInfo() {
		for(Employee staff : em) {
			if(staff instanceof SalesWorker) {
				((SalesWorker)staff).setSalesVolume(1000);
			} else if(staff instanceof PartTimeWorker) {
				((PartTimeWorker)staff).setWorkTime(200);
			}
			staff.empInfo();
		}
	}
}

public class Ex04_Employee {
	public static void main(String[] args) {
		
		EmployeeManager manager = new EmployeeManager(3);
		manager.addEmployee(new SalaryWorker("곽다윤", "홍보부", 400));
		manager.addEmployee(new SalesWorker("조동형", "영업부", 100));
		manager.addEmployee(new PartTimeWorker("장건희", "판매부", 1));
		
		manager.empInfo();
		
		
	}
}
