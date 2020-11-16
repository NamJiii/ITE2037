package project06_1;

public class Manager extends Employee {
	int officeNum;
	String team;
	
	public Manager(String name, int employeeNum, int officeNum, String team) {
		super(name,employeeNum);
		this.officeNum = officeNum;
		this.team = team;
	}
	
	public boolean equals(Manager compare) {
		return compare.name==this.name && compare.employeeNum==this.employeeNum && compare.officeNum==this.officeNum && compare.team==this.team;
	}
	
	public String toString() {
		return "Name : "+this.name+"\nlocation : "+this.department+", "+this.officeNum;
	}
}