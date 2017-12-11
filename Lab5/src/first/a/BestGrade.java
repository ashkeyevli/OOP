package first.a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeMap;

class BestGrade {
	public static void main (String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
			String line, name;
			TreeMap<Integer, String> students = new TreeMap<>();
			StringTokenizer st;
			int score;
			while ((line = br.readLine()) != null) {
				st = new StringTokenizer(line, " ");
				name = st.nextToken() + " " + st.nextToken();
				score = Integer.parseInt(st.nextToken());
				students.put(score, name);				
			}
			br.close();
			int bestScore = students.lastKey();
			BufferedWriter bw = new BufferedWriter(new FileWriter("grades.txt"));
			for(Integer grade : students.keySet()) {
				if(grade >= bestScore - 10)
					bw.write(students.get(grade) + " - \"A\"\n");
				else if(grade >= bestScore - 20)
					bw.write(students.get(grade) + " - \"B\"\n");
				else if(grade >= bestScore - 30)
					bw.write(students.get(grade) + " - \"C\"\n");
				else if(grade >= bestScore - 40)
					bw.write(students.get(grade) + " - \"D\"\n");
				else 
					bw.write(students.get(grade) + " - \"F\"\n");
			}
			bw.close();
		} catch(FileNotFoundException fe) {
            System.out.println("File not found");
		} catch(IOException ioe) {
			System.out.println("Can’t read!");
			System.out.println(ioe.getMessage());
		}
	}
}
