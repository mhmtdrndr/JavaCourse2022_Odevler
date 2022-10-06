package javaCourseDay3HomeWork.dataAccess;

import javaCourseDay3HomeWork.Entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen JDBC ile veritabanina eklendi:" + instructor.getInstructorFirstName());
	}

}
