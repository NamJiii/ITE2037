package project03_4;

public class Employee {

	private String name;
	private int age;
	private String position;
	private int salary;
	private int vacationDays;
	
	public Employee() {
		this.position = "Engineer";
		this.salary = 15000;
		this.vacationDays = 20;
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
		this.position = "Engineer";
		this.salary = 15000;
		this.vacationDays = 20;
	}
	
	public Employee(String name, int age, String position, int salary, int vacationDays) {
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
		this.vacationDays = vacationDays;
	}

	public Employee(String name, int age, String position, int salary) {
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
		this.vacationDays = 20;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void outInfo() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("position: "+position);
		System.out.println("salary: "+salary);
		System.out.println("vacationDays: "+vacationDays);
	}
	
	public String vacation(int vacation) {
		if(vacation <= this.vacationDays) {
			this.vacationDays = this.vacationDays - vacation;
			return "possible";
		}
		else return "impossible";
	}
}
