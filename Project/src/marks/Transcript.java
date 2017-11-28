package marks;

import java.io.Serializable;
import java.util.HashMap;

import course.Course;

public class Transcript implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1358492825345668705L;
	public HashMap<Course, Mark> marks;
	private String studentID;
	private double gpa;
	private int credits;
	private boolean current = true;
	
	public Transcript(String id) { 
		studentID = id;
	}
	
	public void addCourse(Course c) {
		marks.put(c, new Mark());
		credits += c.credits;
	}

	public void addMark(Course c, int points) {
		marks.get(c).addMark(points);
	}

	public String toString() {
	    String string = "";
	    for (Course key : marks.keySet()) {
	        string += key.courseTitle + marks.get(key).toString() + "\n";
	    }
	    return string;
	}

	public double calculateGpa() {
		 for (Course key : marks.keySet()) {
		        gpa += key.credits * marks.get(key).toNumber();
		    }
		return gpa / credits; 		
	}
	
	public void finishSemester() {
		current = false;
	}

	public boolean getCurrent() {
		return current;
	}
 }

