package kodlamaioProject;

import kodlamaioProject.business.CategoryManager;
import kodlamaioProject.business.CourseManager;
import kodlamaioProject.dataAcces.HibernateDao;
import kodlamaioProject.dataAcces.JdbcDao;
import kodlamaioProject.entities.Category;
import kodlamaioProject.entities.Course;
import kodlamaioProject.logger.ILogger;
import kodlamaioProject.logger.MailLogger;
import kodlamaioProject.logger.SmsLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Category category1 = new Category("Programming");
		Category category2 = new Category("Data Structure");
		Category category3 = new Category("Design");
		
		Course course1 = new Course("Emre Bekfilavi ","Java ", 200);
		Course course2 = new Course("Mert Bekfilavi ","Oracle ", 350);
		Course course3 = new Course("Reşat Bekfilavi ","MySql Design ", 450);
		
		ILogger[] loggers = {new MailLogger(), new SmsLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers);
		CourseManager courseManager = new CourseManager(new HibernateDao(), loggers);
		
		categoryManager.add(category1);
		courseManager.add(course1);
		
		categoryManager.add(category2);
		courseManager.add(course2);
		
		categoryManager.add(category3);
		courseManager.add(course3);
		

	}

}
