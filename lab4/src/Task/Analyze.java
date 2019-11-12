package Task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Vector;

public class Analyze {
	private Vector<Integer> scores;

	{
		scores = new Vector<>();
	}

	public Vector<Integer> getScores() {
		return scores;
	}

	public void addScores() throws IOException {
		HashMap<String, String> hsmap = new HashMap<>();
		BufferedReader bf = new BufferedReader(new FileReader("scores"));
		String line;
		while ((line = bf.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line, "-");
			hsmap.put(st.nextToken(), st.nextToken());
		}
		bf.close();
		for (HashMap.Entry<String, String> entry : hsmap.entrySet()) {
			scores.add(Integer.parseInt(entry.getValue()));
		}
	}

	public Integer getAverage() {
		int avg = 0;
		for (int i : scores) {
			avg += i;
		}
		return avg / scores.size();
	}

	public Integer getMax() {
		int maxi = 0;
		for (int i : scores) {
			if (maxi < i) {
				maxi = i;
			}
		}
		return maxi;
	}

	public Integer getMin() {
		int mini = 10000;
		for (int i : scores) {
			if (mini > i) {
				mini = i;
			}
		}
		return mini;
	}

	public void WriteFile() throws IOException {
		FileWriter fw = new FileWriter("grades", true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("\nAverage - " + getAverage() + "\n" + "Maximum - " + getMax() + "\n" + "Minimum - " + getMin());
		bw.close();
	}

}
