package netflix;

import java.util.Objects;

public class Movies implements Comparable {
	//states
	private String moviename;
	private String duration;
	private int rating;
	//constructors
	Movies()
	{
		System.out.println("movie added sucessfully");
	}
	Movies(String moviename , String duration , int rating)
	{
		this();
		this.moviename=moviename;
		this.duration=duration;
		this.rating=rating;
	}
	//getters
	public String getMoviename()
	{
		return moviename;
	}
	public String getDuration()
	{
		return duration;
	}
	public int getRating()
	{
		return rating;
	}
	//setters
	public void setRating(String moviename, int rating)
	{
		if(this.moviename==moviename)
		{
			this.rating=rating;
			System.out.println("rating is updated to:"+rating);
		}
		else
		{
			System.out.println("moviename doesn't exist in the list");
		}
    }
	public int compareTo(Object o)
	{
		
		Movies m=(Movies)o;
		return this.moviename.compareTo(m.moviename);
	}
	@Override
	public String toString()
	{
		return "moviename:"+ moviename +"\t duration"+duration+"\t rating"+rating;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(moviename , duration ,rating);
	}
	@Override
	public boolean equals(Object o)
	{
		Movies m=(Movies)o;
		if(this.moviename.equals(m.moviename)&&this.duration.equals(m.duration)&&this.rating==rating)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
