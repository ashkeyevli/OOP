package course;

import java.util.Vector;

import javax.security.auth.Subject;

import enums.Faculty;

public class Course {
	public String courseTitle;
	public Course prerequisite = null;
	public int credits;
	public Vector<CourseFile> courseFiles;
	public Faculty faculty;
	public Vector<Subject> subjects;
	
	public Course() { }
	
	public Course(String courseTitle) {
		this.courseTitle = courseTitle;
	}	
	
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	
	public void addCourseFile(CourseFile courseFile) {
		if(courseFiles.contains(courseFile)) System.out.println("Textbook already exists.");
		else {
			courseFiles.addElement(courseFile);
			System.out.println("Course file was added succesfully.");
		}
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	public boolean equals(Object obj) {
		Course course = (Course) obj;
		return course.courseTitle.equals(courseTitle);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}

