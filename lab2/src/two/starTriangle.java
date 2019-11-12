package two;

public class starTriangle {
	
	public int width;
	
	public starTriangle(int width)
	{
		this.width = width;
	}
	
	@Override
	public String toString()
	{
		String temp = "";
		for(int i=0; i<width; i++)
		{
			for(int j=0; j<=i; j++)
			{
				temp+="[*]";
			}
			temp+="\n";
		}
		return temp;
	}

	public static void main(String[] args) {
		starTriangle st = new starTriangle(3);
		System.out.println(st.toString());

	}

}

