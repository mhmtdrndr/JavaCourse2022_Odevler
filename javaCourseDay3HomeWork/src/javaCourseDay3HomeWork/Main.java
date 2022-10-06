package javaCourseDay3HomeWork;

import javaCourseDay3HomeWork.Business.CategoryManager;
import javaCourseDay3HomeWork.Business.CourseManager;
import javaCourseDay3HomeWork.Entities.Category;
import javaCourseDay3HomeWork.Entities.Course;
import javaCourseDay3HomeWork.core.DatabaseLogger;
import javaCourseDay3HomeWork.core.EmailLogger;
import javaCourseDay3HomeWork.core.Logger;
import javaCourseDay3HomeWork.dataAccess.HibernateCategoryDao;
import javaCourseDay3HomeWork.dataAccess.HibernateCourseDao;


public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new EmailLogger(), new DatabaseLogger()};
		
		
		Course course1 = new Course(1, 1, "JAVA", "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", "Engin Demiroğ", 0);	 //başarılı kurs kaydı	
		
		Course course2 = new Course(2, 2, "C#", "Senior Yazılım Geliştirici Yetiştirme Kampı", "Engin Demiroğ", 0); //kurs fiyatı 0 dan küçük olduğu için hata fırlatır.
		
		Course course3 = new Course(3, 2, "C#", "Senior Yazılım Geliştirici Yetiştirme Kampı", "Engin Demiroğ", 0); //aynı kurs ismi olduğu için hata fırlatır.
		
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
	

/*
		Category category1 = new Category(1, "Backend");//başarılı kategori kaydı
		Category category2 = new Category(2, "Frontend");//başarılı kategori kaydı
		Category category3 = new Category(3, "Backend"); // aynı isimde olduğu için hata fırlatır 
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.add(category3);
*/
	}

}
