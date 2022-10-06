package javaCourseDay3HomeWork.dataAccess;

import java.util.List;

import javaCourseDay3HomeWork.Entities.Course;

public interface CourseDao {
	void add(Course course);
	List<Course> getAll();
}
