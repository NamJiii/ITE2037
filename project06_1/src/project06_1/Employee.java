package project06_1;

public class Employee {
	String name;
	int employeeNum;
	String department="No Dept.";
	
	public Employee(String name, int employeeNum) {
		this.name=name;
		this.employeeNum=employeeNum;
	}
	
	public String getDepartment() { return this.department;}
	public void setDepartment(String dept) { this.department=dept; }
	
	public boolean equals(Employee compare) {
		return compare.name == this.name && compare.employeeNum==this.employeeNum;
	}
	
	public String toString() { return "Name : "+this.name+"\nEmp# : "+this.employeeNum; }
}
