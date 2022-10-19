package kodlamaioProject.business;

import kodlamaioProject.dataAcces.ICourseCategoryDao;
import kodlamaioProject.entities.Category;
import kodlamaioProject.logger.ILogger;

public class CategoryManager {
	
	ICourseCategoryDao categoryDao;
	ILogger[] loggers;
	
	public CategoryManager(ICourseCategoryDao categoryDao, ILogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		
		if(categoryDao.isNameValid(category.getCategoryName())) {
			throw new Exception("Category name can't be same!!!");
		}
		
		categoryDao.add(category);
		
		for (ILogger iLogger : loggers) {
			
			iLogger.log(category.getCategoryName());
			
		}
		
	}
	
	
	

}
