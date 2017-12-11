package second;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Vector;

class Course implements Serializable{
	String courseTitle;
	Textbook textbook; 
	Instructor instructor;
	
	public Course(String courseTitle, Textbook textbook, Instructor instructor) {
		this.courseTitle = courseTitle;
		this.textbook = textbook;
		this.instructor = instructor;
	}
	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCourseTitle() {
		return courseTitle;
	}
	
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	
	public Object getTextbook() {
		try {
			return textbook.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}
	
	public Object getInstructor() {
		try {
			return instructor.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	@Override
	public String toString() {
		return String.format("Course title: %s. Instructor: %s. Textbook: %s", courseTitle, instructor, textbook);
	}
	
	@Override
	public boolean equals(Object obj) {
		Course c = (Course) obj;
		return c.getCourseTitle().equals(courseTitle) && c.instructor.equals(instructor) && c.textbook.equals(textbook);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	public static void main(String[] args) {
		Date date = new Date();
		Vector<Date> personDetails = new Vector<>();
		Collections.sort(personDetails, new Comparator<Date>()
		{
		  public int compare(Date o1, Date o2) {
		    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		    Date d1 = sdf.parse(o1.getDateAsString());
		    Date d2 = sdf.parse(o2.getDateAsString());
		    return d1.compareTo(d2);
		  }

		
	}
}
