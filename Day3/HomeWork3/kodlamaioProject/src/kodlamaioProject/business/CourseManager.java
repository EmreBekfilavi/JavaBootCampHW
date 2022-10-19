package kodlamaioProject.business;

import kodlamaioProject.dataAcces.ICourseCategoryDao;
import kodlamaioProject.entities.Course;
import kodlamaioProject.logger.ILogger;

public class CourseManager {
	
	ICourseCategoryDao courseDao;
	ILogger[] loggers;
	
	public CourseManager(ICourseCategoryDao courseDao, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		
		if(course.getPrice() <= 0) {
			throw new Exception("Price can't be 0 or less!!!");
		}
		
		if(courseDao.isNameValid(course.getCourseName())) {
			throw new Exception("Course Name can't be same!!!");
		}
		
		courseDao.add(course);
		
	}
	
	

}
