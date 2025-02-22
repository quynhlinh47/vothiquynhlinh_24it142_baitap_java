package exercise4_2;

public class Staff extends Person{
	private String school;
	private double pay;
	public Staff(String name, String address, String school, double pay) {
		super (name, address);
		this.school = school;
        this.pay = pay;
       	}
	public String getSchool() {
	    return this.school;
	}
    public void setSchool(String s) {
    	this.school = s;
    }
    public double getPay() {
    	return this.pay;
    }
    public void setPay(double pay) {
    	this.pay = pay;
    }
    public String toString() {
    	return "Staff[" + super.toString() + ",shool =" + this.school + ",pay =" + this.pay + "]";
    }
	
}
