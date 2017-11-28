package users;

import java.io.Serializable;

import course.Course;
import enums.Faculty;
import marks.Transcript;
import storage.Storage;


public class Student extends User implements Serializable{

	private static final long serialVersionUID = -1025950313239087537L;

	private Faculty faculty;
	
	private String speciality;
	
	private int year;
	
	
	public Student()
	{	
	}
	
	public Faculty getFaculty() {
	    return faculty;
	}
	
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public String getSpeciality() {
	    return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getYear() {
	    return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void seeAttestation() {
		for(Transcript transcript : Storage.transcripts) 
			if(transcript.getCurrent()) System.out.println(transcript);
	}
	
	public void seeTranscript() {
		System.out.println(Storage.transcripts);
	}
	
	public void addCourse(Course course, Teacher teacher) {
		int retakes = 0;
		boolean prerequisite = false, contains = false;
		for(Transcript transcript : Storage.transcripts) {
			if(!transcript.getCurrent()) {
				if(transcript.marks.get(course).getTotal() < 50) retakes++;
				if(transcript.marks.get(course.prerequisite).getTotal() > 50) prerequisite = true;
			}
			else contains = transcript.marks.containsKey(course);
		}
		if(retakes >= 3 || !prerequisite || contains) 
			System.out.println("You can't take this course.");
		
		else {
			for(Transcript transcript : Storage.transcripts) { 
				if(transcript.getCurrent()) transcript.addCourse(course);
					teacher.addStudentToCourse(course, this);
			}
		}
		
	}
	
	public boolean equals(Object obj) { 
		Student student = (Student) obj;
	    return super.equals(student) && student.getFaculty() == faculty && student.getSpeciality().equals(this.speciality) && student.getYear() == year;
	}
	
	public String toString() {
	    return String.format("%s\nFaculty: %s. Speciality: %s. Year: %s.", super.toString(), faculty, speciality, year);
	}
	
}

