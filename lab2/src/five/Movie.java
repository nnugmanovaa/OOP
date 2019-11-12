package five;


enum Genre
{
	ACTION,
	HORROR,
	COMEDY
}


public class Movie {

	Genre genre;
	final String COUNTRY = "USA";
	static String director;
	String title;
	int year;
	
	static { //initialization block , runs once when class is initialized
		System.out.println("Welcome to movie night!");
	}
	{
		System.out.println("What kind of movie do you like ?");
	}
	
	public Movie(int year)
	{
		this.year = year;
	}
	
	public Movie(int year, String title)
	{
		this(year);
		setName(title);
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setName(String title)
	{
		this.title=title;
	}
	
	public void printTitle(int i, Movie movie)//overloading 
	{
		System.out.println(i + "." + movie.title);
	}
	
	public void printTitle(Movie movie)
	{
		System.out.println(movie.title);
		
		
	}
	public static void main(String[] args) {
		Movie m = new Movie(2019, "hgerele");

	}

}
