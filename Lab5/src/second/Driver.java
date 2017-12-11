package second;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

class Driver {
	private static String getInfo(String line) {        
		   String[] arr = line.split(" ");  
		   return arr[arr.length -1];            
	} 
	
	 public static String getTime(){
	        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	        Date date = new Date();
	        return dateFormat.format(date);
	 }

	public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			driver: while(true) {				
				System.out.println("Please, choose mode. \n1) user. \n2) admin\n3) quit.");
				String line, mode = in.readLine();
				
				if(mode.equals("user")) {
					FileInputStream fis = new FileInputStream("courses.out");
					ObjectInputStream oin = new ObjectInputStream(fis);
					@SuppressWarnings("unchecked")
					Vector<Course> courses = (Vector<Course>) oin.readObject();
					oin.close();					
					System.out.println("1. Type \"courses\" to see all courses."
							+ "\n2. Type \"show\" to see full description.");
					user: while(true) {
						line = in.readLine();
						if(line.contains("courses")) {
							int index = 1;
							for (Course course : courses) {
								System.out.println(Integer.toString(index++) + ") "+ course.getCourseTitle());
							}
							continue user;
						}
						
						else if(line.contains("show")){
							System.out.println("Type course number.");
							int index = Integer.parseInt(in.readLine());
							if(index <= courses.size() && index >= 1) 
								System.out.println(courses.elementAt(index - 1));
							else System.out.println("Course doesn't exist.");
							continue user;
						}
						else if(line.equals("quit")) {System.out.println("Bye!!!"); break driver;}
					}
				}
				
				else if(mode.equals("admin")) {
					admin: while(true) {
						BufferedReader br = new BufferedReader(new FileReader("admin.txt"));
						System.out.print("Username: ");
						String username = in.readLine();
						System.out.print("Password: ");
						String password = in.readLine();
						if(getInfo(br.readLine()).equals(username) && getInfo(br.readLine()).equals(password)) {
							br.close();
							BufferedWriter bw = new BufferedWriter(new FileWriter("admin.txt", true));
							bw.write(getTime() + " admin logged in to a system\n");
							System.out.println("To add new course, type \"new course\"");
							Vector<Course> courses = new Vector<>();
							admin_mode: while(true) {				
								line = in.readLine();
								
								if(line.equals("new course")) {
									Instructor instructor = new Instructor();
									Textbook textbook = new Textbook();
									Course course = new Course();
									
									System.out.println("Instructor's name: ");
									instructor.setFirstName(in.readLine());
									System.out.println("Surname: ");
									instructor.setLastName(in.readLine());
									System.out.println("Department: ");
									instructor.setDepartment(in.readLine());
									System.out.println("Email:");
									instructor.setEmail(in.readLine());
									bw.write(getTime() + " admin added new instructor " + instructor.getFirstName() + "\n");
									
									System.out.println("Textbook title:");
									textbook.setTitle(in.readLine());
									System.out.println("ISBN:");
									textbook.setIsbn(Integer.parseInt(in.readLine()));
									System.out.println("Author:");
									textbook.setAuthor(in.readLine());
									bw.write(getTime() + " admin added new textbook " + textbook.getTitle() + "\n");	
									
									System.out.println("Course title:");	
									course = new Course(in.readLine(), textbook, instructor);				
									if(!courses.contains(course)) courses.add(course);		
									else System.out.println("Course already exists.");
									bw.write(getTime() + " admin added new course " + course.getCourseTitle() + "\n");
									
									continue admin_mode;
								}
								else if(line.equals("quit")) { 
									bw.close(); 
									FileOutputStream fos = new FileOutputStream("courses.out");
									ObjectOutputStream oos = new ObjectOutputStream(fos);
									oos.writeObject(courses);
									oos.flush();
									oos.close();
									System.out.println("Bye!!!"); 
									break driver;}
								bw.close();
							} 
						}
						else {
							br.close();
							System.out.println("Wrong username or password. Please, try again.");
							continue admin;
						}
					}					
				}
				else if(mode.equals("quit")) {System.out.println("Bye!!!"); break driver;}
				else {
					System.out.println("Invalid input. Try again.");
					continue driver;
				}
			}
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
		}
	}
}
