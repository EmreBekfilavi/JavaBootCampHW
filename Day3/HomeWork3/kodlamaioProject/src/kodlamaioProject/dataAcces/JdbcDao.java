package kodlamaioProject.dataAcces;

import java.util.ArrayList;
import java.util.List;

import kodlamaioProject.entities.Category;
import kodlamaioProject.entities.Course;

public class JdbcDao implements ICourseCategoryDao {

	List<Category> categoryName = new ArrayList<>();
	List<Course> courseName = new ArrayList<>();
	
	public void add(Course course) {
		
		courseName.add(course);
		System.out.println("Course Added: "+course.getTeacherName()+course.getCourseName());
		
		
	}

	
	public void add(Category category) {
		
		categoryName.add(category);
		System.out.println("Added with JDBC Method");
		
	}

	
	public boolean isNameValid(String name) {
		
		for (Category category : categoryName) {
			
			if(category.getCategoryName().equalsIgnoreCase(name)) {
				return true;
			}
			
		}
		
		for (Course course : courseName) {
			
			if(course.getCourseName().equalsIgnoreCase(name)) {
				return true;
			}
			
		}
		
		return false;
	}



}
