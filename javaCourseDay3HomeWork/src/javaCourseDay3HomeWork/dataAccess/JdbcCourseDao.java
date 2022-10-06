package javaCourseDay3HomeWork.dataAccess;

import javaCourseDay3HomeWork.Entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs kaydı JDBC ile eklendi " + course.getCourseName());		
	}

}
