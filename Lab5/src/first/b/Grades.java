package first.b;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.TreeSet;

class Grades {
	private static String getScore(String line) {        
	   String[] arr = line.split(" ");  
	   return arr[arr.length -1];            
	}     
	
	public static void main (String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
			String line;
			TreeSet<Integer> scores = new TreeSet<>();
			int average = 0;
			while ((line = br.readLine()) != null) {
				scores.add(Integer.parseInt(getScore(line)));
				average += Integer.parseInt(getScore(line));
			}
				
			br.close();
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("grades.txt", true));
			bw.write("Average - " + average/scores.size() +"\n");
			bw.write("Maximum - " + scores.last() +"\n");
			bw.write("Minimum - " + scores.first() +"\n");
			bw.close();
		} catch(FileNotFoundException fe) {
            System.out.println("File not found");
		} catch(IOException ioe) {
			System.out.println("Can’t read!");
			System.out.println(ioe.getMessage());
		} catch (NoSuchElementException  e) {
			System.out.println(e.getMessage());
		}
	}
}
