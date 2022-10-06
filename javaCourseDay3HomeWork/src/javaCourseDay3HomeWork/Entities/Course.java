package javaCourseDay3HomeWork.Entities;

public class Course {

	private int id;
	private int categoryId;
	private String courseName;
	private String courseDetail;
	private String instructor;
	private double courseUnitPrice;

	public Course() {

	}

	public Course(int id, int categoryId, String courseName, String courseDetail, String instructor,
			double courseUnitPrice) {
		this.id = id;
		this.categoryId = categoryId;
		this.courseName = courseName;
		this.courseDetail = courseDetail;
		this.instructor = instructor;
		this.courseUnitPrice = courseUnitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDetail() {
		return courseDetail;
	}

	public void setCourseDetail(String courseDetail) {
		this.courseDetail = courseDetail;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public double getCourseUnitPrice() {
		return courseUnitPrice;
	}

	public void setCourseUnitPrice(double courseUnitPrice) {
		this.courseUnitPrice = courseUnitPrice;
	}

}
