package javaCourseDay3HomeWork.Business;

import javaCourseDay3HomeWork.Entities.Category;
import javaCourseDay3HomeWork.core.Logger;
import javaCourseDay3HomeWork.dataAccess.CategoryDao;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		for(Category categories:categoryDao.getAll()) {
			if(categories.getCategoryName().equals(category.getCategoryName())){
				throw new Exception("Aynı kategori isminde kayıt var " + category.getCategoryName());
			}
		}
		
		categoryDao.add(category);
		for(Logger logger:loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
