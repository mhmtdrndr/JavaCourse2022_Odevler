package javaCourseDay3HomeWork.Business;

import javaCourseDay3HomeWork.Entities.Course;
import javaCourseDay3HomeWork.core.Logger;
import javaCourseDay3HomeWork.dataAccess.CourseDao;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getCourseUnitPrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}
		
		courseDao.add(course);
		
		for(Logger logger:loggers) {
			logger.log(course.getCourseName());
		}
	}

}
