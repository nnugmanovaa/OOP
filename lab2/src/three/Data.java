package three;

public class Data {
	
	private int size;
	private double maximum;
	private double sum;
	
	public Data()
	{
		size = 0;
		maximum= 0 ;
		sum = 0;
	}
	
	public void addValue(String s)
	{
		Double d = Double.parseDouble(s);
		sum+=d;
		size++;
		if(d>maximum)
			maximum=d;
	}
	
	public double getAverage()
	{
		return sum/size;
	}
	
	public double getMax()
	{
		return maximum;
	}

	public static void main(String[] args) {
		
		

	}

}
