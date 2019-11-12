package three;

import java.util.Scanner;

public class Analyzer {
	
	Data data;
	
	public Analyzer()
	{
		data = new Data();
	}
	
	public void Analyze()
	{
		String s;
		Scanner  sc = new Scanner(System.in);
		
		while(true)
		{
			s = sc.nextLine();
			if(s.equals("Q"))
				break;
			else
				data.addValue(s);
		}
		
		System.out.printf("Average = " + data.getAverage());
		System.out.printf("\nMaximum = " + data.getMax());
	}
	
	

	public static void main(String[] args) {
		Analyzer analyzer = new Analyzer();
		analyzer.Analyze();

	}

}
