
public class Student {
	private int id;
	private String name;
	private double gpa;
	
	public Student(int id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getGPA() {
		return this.gpa;
	}
}
