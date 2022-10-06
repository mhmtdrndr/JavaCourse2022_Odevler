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
		for(Course courses:courseDao.getAll()) {
			if(courses.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs ismi aynı olamaz : " + course.getCourseName());
			}
		}
		
		if (course.getCourseUnitPrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}
		
		courseDao.add(course);
		
		for(Logger logger:loggers) {
			logger.log(course.getCourseName());
		}
	}

}
