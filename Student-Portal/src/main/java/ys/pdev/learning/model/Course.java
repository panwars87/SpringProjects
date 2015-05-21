package ys.pdev.learning.model;

import java.io.Serializable;

public class Course implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int courseId;
	private String courseName;
	private String courseNumber;
	private String courseDescription;
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName
				+ ", courseNumber=" + courseNumber + ", courseDescription="
				+ courseDescription + "]";
	}
}
