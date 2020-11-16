package project06_1;

public class Engineer extends Employee {
	String workZone;
	String project;
	
	public Engineer(String name, int employeeNum, String workZone, String project) {
		super(name,employeeNum);
		this.workZone = workZone;
		this.project = project;
	}
	
	public boolean equals(Engineer compare) {
		return super.equals(compare)&&compare.workZone == this.workZone&&compare.project==this.project;	
	}
	
	public String toString() {
		return "Name : "+this.name+"\nEmp# : "+this.employeeNum+"\nlocation : "+this.department+", "+this.workZone;
	}
}