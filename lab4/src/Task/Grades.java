package Task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Grades {
	private HashMap<String, String> map;
	private HashMap<String, String> ans;

	{
		map = new HashMap<>();
		ans = new HashMap<>();
	}

	public HashMap<String, String> getMap() {
		return map;
	}
	
	public HashMap<String, String> getAns() {
		return ans;
	}

	public void readFromFile() throws IOException {
		BufferedReader bfr = new BufferedReader(new FileReader("scores"));
		String line;
		while ((line = bfr.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line, "-");
			map.put(st.nextToken(), st.nextToken());
		}
		bfr.close();
	}

	public void findBestScore() {
		int maxi = 0;

		for (HashMap.Entry<String, String> entry : map.entrySet()) {
			if (maxi < Integer.parseInt(entry.getValue()))
				maxi = Integer.parseInt(entry.getValue());
		}
		for (HashMap.Entry<String, String> entry : map.entrySet()) {
			if (Integer.parseInt(entry.getValue()) >= maxi - 10) {
				ans.put(entry.getKey() + " -", "'A'");
			} else if (Integer.parseInt(entry.getValue()) >= maxi - 20) {
				ans.put(entry.getKey() + " -", "'B'");
			} else if (Integer.parseInt(entry.getValue()) >= maxi - 30) {
				ans.put(entry.getKey() + " -", "'C'");
			} else if (Integer.parseInt(entry.getValue()) >= maxi - 40) {
				ans.put(entry.getKey() + " -", "'D'");
			} else
				ans.put(entry.getKey() + " -", "'F'");
		}
	}

	public void writeToFile() throws IOException {
		FileWriter fw = new FileWriter("grades");
		BufferedWriter bwr = new BufferedWriter(fw);
		for (HashMap.Entry<String, String> entry : ans.entrySet()) {
			bwr.write(entry.getKey() + " " + entry.getValue() + "\n");
		}
		bwr.close();
	}
}
