package demo.sjdbc.SJDBCDEMO;

public class Student {

	private int roll;
	private String name;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public Student() {
		super();
		setRoll(roll);
		setName(name);
	}
	
}
