package javaCourseDay3HomeWork.dataAccess;

import java.util.ArrayList;
import java.util.List;

import javaCourseDay3HomeWork.Entities.Course;

public class JdbcCourseDao implements CourseDao {
	
	List<Course> courses = new ArrayList<Course>();

	@Override
	public void add(Course course) {
		courses.add(course);
		System.out.println("Kurs kaydı JDBC ile eklendi " + course.getCourseName());		
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return this.courses;
	}

}
