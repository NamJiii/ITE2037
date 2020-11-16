package project11_1;

public class Contact implements Comparable{
	private String name;
	private String telNum;
	private String email;
	
	public Contact(String name, String telNum, String email) {
		/* your code */
		if(name!=null) this.name=name.trim();
		else this.name=name;
		if(telNum!=null) this.telNum=telNum.trim();
		else this.telNum=telNum;
		if(email!=null) this.email=email.trim();
		else this.email=email;
		
	/*	this.name = name != null ? name.trim() : name;
		this.telNum = telNum != null ? telNum.trim() : telNum;
		this.email = email != null ? email.trim() : email;*/
	}
	
	public Contact(String name) {
		this(name,null,null);
		/* your code */
	}
	
	public String getTelNum() {	return telNum; }
	public void setTelNum(String telNum) { this.telNum = telNum != null ? telNum.trim() : null; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email != null ? email.trim() : null; }
	public String getName() { return name; }
	
	public String toString() {
		return "Name: " + name + "\ttelNum: " + telNum + "\temail: " + email + "\n";
	}
	
	public boolean equals(Object obj) {
		return compareTo(obj) == 0;
	}
	
	public int compareTo(Object obj) {
		if(obj==null) throw new NullPointerException("Object is null");
		else if(this.getClass()!=obj.getClass()) throw new ClassCastException("Object not of the same type");
		else {
			Contact otherManager = (Contact) obj;
			int compare = this.getName().compareTo(otherManager.getName());
			return compare;
		}
	}
}
