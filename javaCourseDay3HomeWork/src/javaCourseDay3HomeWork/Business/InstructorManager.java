package javaCourseDay3HomeWork.Business;

import javaCourseDay3HomeWork.Entities.Instructor;
import javaCourseDay3HomeWork.core.Logger;
import javaCourseDay3HomeWork.dataAccess.InstructorDao;

public class InstructorManager {
	
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getInstructorFirstName());
		}
	}

}
