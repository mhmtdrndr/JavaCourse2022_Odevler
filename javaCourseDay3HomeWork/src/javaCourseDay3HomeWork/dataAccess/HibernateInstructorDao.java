package javaCourseDay3HomeWork.dataAccess;

import javaCourseDay3HomeWork.Entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Hibernate ile veritabanina eklendi:" + instructor.getInstructorFirstName());		
	}

}
