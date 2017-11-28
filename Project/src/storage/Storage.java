package storage;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import course.Course;
import marks.Transcript;
import posted.News;
import users.Admin;
import users.Executor;
import users.Manager;
import users.Student;
import users.Teacher;

public class Storage {
	public static Vector<Admin> admins = new Vector<>();
	public static Vector<Student> students = new Vector<>();
	public static Vector<Teacher> teachers = new Vector<>();
	public static Vector<Manager> managers = new Vector<>();
	public static Vector<Executor> executors = new Vector<>();
	
	public static Vector<Course> cources = new Vector<>();
	public static Vector<News> newses = new Vector<>();
	public static Vector<Transcript> transcripts = new Vector<>();
	
	
	public static void serializeUsers() {		
		try {
			FileOutputStream foss = new FileOutputStream("database/students.out");
			ObjectOutputStream ooss = new ObjectOutputStream(foss);
			
			FileOutputStream fost = new FileOutputStream("database/teachers.out");
			ObjectOutputStream oost = new ObjectOutputStream(fost);
			
			FileOutputStream fose = new FileOutputStream("database/executors.out");
			ObjectOutputStream oose = new ObjectOutputStream(fose);
			
			FileOutputStream fosm = new FileOutputStream("database/managers.out");
			ObjectOutputStream oosm = new ObjectOutputStream(fosm);
			
			FileOutputStream fosa = new FileOutputStream("database/admins.out");
			ObjectOutputStream oosa = new ObjectOutputStream(fosa);
			
			try {
					ooss.writeObject(students);
					oost.writeObject(teachers);
					oose.writeObject(executors);
					oosm.writeObject(managers);
					oosa.writeObject(admins);
			} finally {
				ooss.flush();
				ooss.close();
				
				oost.flush();
				oost.close();
				
				oosm.flush();
				oosm.close();
				
				oose.flush();
				oose.close();
				
				oosa.flush();
				oosa.close();
			}
		} catch (NullPointerException npe) {
		    
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void serializeNews() {
		try {
			FileOutputStream fos = new FileOutputStream("database/news.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			try {
				oos.writeObject(newses);
			} finally {
				oos.flush();
				oos.close();
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void serializeCourse() {
		try {
			FileOutputStream fos = new FileOutputStream("courses.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			try {
				oos.writeObject(cources);
			} finally {
				oos.flush();
				oos.close();
			}
		} catch (NullPointerException e) {
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	@SuppressWarnings("unchecked")
	public static void deserializeUsers() throws EOFException {
		try {				
			FileInputStream fisa = new FileInputStream("database/admins.out");
			ObjectInputStream oina = new ObjectInputStream(fisa);	
			
			FileInputStream fiss = new FileInputStream("database/students.out");
			ObjectInputStream oins = new ObjectInputStream(fiss);
			
			FileInputStream fist = new FileInputStream("database/teachers.out");
			ObjectInputStream oint = new ObjectInputStream(fist);
			
			FileInputStream fism = new FileInputStream("database/managers.out");
			ObjectInputStream oinm = new ObjectInputStream(fism);
			
			FileInputStream fise = new FileInputStream("database/executors.out");
			ObjectInputStream oine = new ObjectInputStream(fise);
			
			try {
				Storage.students = (Vector<Student>) oins.readObject();
				Storage.admins = (Vector<Admin>) oina.readObject();
				Storage.executors = (Vector<Executor>) oine.readObject();
				Storage.managers = (Vector<Manager>) oinm.readObject();
				Storage.teachers = (Vector<Teacher>) oint.readObject();
			} finally {
				oins.close();
				oint.close();
				oinm.close();
				oine.close();
				oina.close();
			}
		} catch (EOFException e) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public static void serializeTranscript() {
		try {
			FileOutputStream fos = new FileOutputStream("database/transcripts.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			try {
				oos.writeObject(transcripts);
			} finally {
				oos.flush();
				oos.close();
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void desNews() throws ClassNotFoundException {
	    try {
	      FileInputStream fis = new FileInputStream("database/news.out");
	      ObjectInputStream ois = new ObjectInputStream(fis);
	      try {
	        newses = (Vector<News>)ois.readObject();
	      } finally {
	        ois.close();
	      }
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
	  
	  @SuppressWarnings("unchecked")
	public static void desCourse() throws ClassNotFoundException {
	    try {
	      FileInputStream fis = new FileInputStream("database/courses.out");
	      ObjectInputStream ois = new ObjectInputStream(fis);
	      try {
	        cources = (Vector<Course>)ois.readObject();
	      } finally {
	        ois.close();
	      }
	    } catch (EOFException e) {
			System.out.println("No courses yet.");
		} catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
	  
	  @SuppressWarnings("unchecked")
	public static void desTranscript() throws ClassNotFoundException {
	    try {
	      FileInputStream fis = new FileInputStream("database/transcripts.out");
	      ObjectInputStream ois = new ObjectInputStream(fis);
	      try {
	        transcripts = (Vector<Transcript>)ois.readObject();
	      } finally {
	        ois.close();
	      }
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
}

