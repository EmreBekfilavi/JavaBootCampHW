package kodlamaioProject.entities;

public class Course {

	private String teacherName;
	private String courseName;
	private double price;

	public Course(String teacherName, String courseName, double price) {
		this.teacherName = teacherName;
		this.courseName = courseName;
		this.price = price;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
