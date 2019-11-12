package Task;

import java.io.IOException;

public class Driver {
	public static void main(String[] args) throws IOException {
		
	Grades grades = new Grades();
	grades.readFromFile();
	grades.findBestScore();
	grades.writeToFile();
	
	Analyze analyze = new Analyze();
	analyze.addScores();
	analyze.WriteFile();
	}
}
