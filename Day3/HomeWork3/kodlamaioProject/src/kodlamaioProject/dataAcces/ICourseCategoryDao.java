package kodlamaioProject.dataAcces;

import kodlamaioProject.entities.Category;
import kodlamaioProject.entities.Course;

public interface ICourseCategoryDao {
	
	void add(Course course);
	void add(Category category);
	boolean isNameValid(String name);

}
