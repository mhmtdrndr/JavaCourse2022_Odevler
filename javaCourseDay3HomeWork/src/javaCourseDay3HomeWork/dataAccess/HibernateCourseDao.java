package javaCourseDay3HomeWork.dataAccess;

import javaCourseDay3HomeWork.Entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs kaydı Hibernate ile eklendi " + course.getCourseName());
	}

}
