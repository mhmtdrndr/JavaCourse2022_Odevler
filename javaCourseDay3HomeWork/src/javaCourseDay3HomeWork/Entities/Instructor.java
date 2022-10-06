package javaCourseDay3HomeWork.Entities;

public class Instructor {

	private int id;
	private String instructorFirstName;
	private String instructorLastName;
	private String instructorEMail;

	public Instructor() {

	}

	public Instructor(int id, String instructorFirstName, String instructorLastName, String instructorEMail) {		
		this.id = id;
		this.instructorFirstName = instructorFirstName;
		this.instructorLastName = instructorLastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstructorFirstName() {
		return instructorFirstName;
	}

	public void setInstructorFirstName(String instructorFirstName) {
		this.instructorFirstName = instructorFirstName;
	}

	public String getInstructorLastName() {
		return instructorLastName;
	}

	public void setInstructorLastName(String instructorLastName) {
		this.instructorLastName = instructorLastName;
	}

	public String getInstructorEMail() {
		return instructorEMail;
	}

	public void setInstructorEMail(String instructorEMail) {
		this.instructorEMail = instructorEMail;
	}
	
	

}
