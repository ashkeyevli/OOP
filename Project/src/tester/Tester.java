package tester;

import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;

import storage.Storage;
import users.Admin;
import users.Student;

class Tester {
	public static void save() throws IOException{
		Storage.serializeUsers();
		Storage.serializeCourse();
		Storage.serializeNews();
		Storage.serializeTranscript();
	}
	
	public static void start() throws ClassNotFoundException, EOFException {
		Storage.desCourse();
		Storage.deserializeUsers();
		Storage.desNews();
		Storage.desTranscript();
	}
	
	public static boolean showStudents(){
		if(Storage.students.size()==0) {
			System.out.println("No students yet...");
			return false;
		}
		for(int i=0; i < Storage.students.size(); i++)
			System.out.println(i+1+ ")" + Storage.students.get(i));
		return true;
	}
	
	public static boolean showCourses(){
		if(Storage.cources.size()==0) {
			System.out.println("No courses yet...");
			return false;
		}
		for(int i=0; i<Storage.cources.size(); i++)
			System.out.println(i+1+ ")" +Storage.cources.get(i));
		return true;
	}
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Welcome to INTRANET!");
		Storage.deserializeUsers();
		Scanner in = new Scanner(System.in);
		menu: while (true) {
			System.out.print("Username: ");
			String username = in.nextLine();
			System.out.print("Password: ");
			String password = in.nextLine();
			if(username.contains("AD")) {
				Admin admin = new Admin(username, password.hashCode());
				if(Storage.admins.contains(admin)) 
					admin: while(true) {
						System.out.println("What would you like to do?");
						System.out.println("1. Add user.\n2. Delete user.\n3. Add course.\n4. Delete course.\n5. Exit.");
						int mode = in.nextInt();
						if(mode == 1) {
							System.out.println("1. Student.\n2. Teacher.\n3. Manager.\n4. Executor.\n5. Admin.");
							if(mode == 1) {
								Student student = new Student();
								System.out.print("Name: ");
								student.setName(in.nextLine());
								System.out.print("Lastname: ");
								student.setLastName(in.nextLine());
								System.out.print("Password: ");
								student.setPassword(in.nextLine().hashCode());
								System.out.print("Year of study: ");
								student.setYear(in.nextInt());
								System.out.println("Faculty: ");
//								admin.addUser(student);
//								continue menu;
							}
						}
						if(mode == 2) {
							System.out.println("1. Student.\n2. Teacher.\n3. Manager.\n4. Executor.\n5. Admin.");
							if(mode == 1) {
								int i = 1;
								for (Student student : Storage.students) {
									System.out.println(i + ")" + student);
								}
								int number = in.nextInt();
								admin.deleteUser(Storage.students.elementAt(number - 1));
							}
						}
						if(mode == 3) {
							
						}
						if(mode == 4) {
							
						}
						else System.exit(0);
					}
					}
				else {
					System.out.println("Invalid username or password. Please try again.");
					continue menu;
				}
		}
		
//	    Admin admin = new Admin();
//	    admin.setSalary(1000);
//	    admin.setUsername("ADAiganym0");
//	    admin.setEmail("test@gmail.com");
//	    admin.setPassword("hello".hashCode());
//	    admin.setLastName("jsa;ldfjsa");
//	    admin.setName("aiganym");
//	    Vector<Admin> admins = new Vector<>();
//	    admins.addElement(admin);
//	    System.out.println(admins);
//	    
//	    FileOutputStream fosa = new FileOutputStream("database/admins.out");
//	    ObjectOutputStream oosa = new ObjectOutputStream(fosa);
//	    oosa.writeObject(admins);
//	    oosa.flush();
//	    oosa.close();
	}
}
