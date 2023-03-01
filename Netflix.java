package netflix;
import java.util.*;

public class Netflix {
	User [] u=new User[3];
	Movies [] m=new Movies[3];
	//behaviours
	public void Login(String uname,String email_id ,long phno)
	{
		for(int i=0;i<u.length;i++)
		{
			User u1=u[i];
			if(u1!=null)
			{
				if(u1.getUname().equals(uname) && u1.getEmail_id().equals(email_id)&& u1.getPhone()==(phno))
				{
					System.out.println("logged in sucessfully");
					break;
				}
				else
				{
					System.out.println("invalid uname/email_id/phno");
					
				}
			}
				else
				{
					System.out.println("user not found");
					break;
				}
			}
		}
	 public void createAccount(User u1)
	 {
		for (int i = 0; i < u.length; i++)
		{
			if(u[i]==null)
			{
				u[i]=u1;
				System.out.println("account created sucessfully");
				break;
			}
		}
	}
	 public void addMovie(Movies m1)
	 {
		 for(int i=0;i<m.length;i++)
		 {
			 if(m[i]==null)
			 {
				 m[i]=m1;
				 break;
			 }
		 }
	 }
	 public void displayMovieList()
	 {
		 for(int i=0;i<m.length;i++)
		 {
			 if(m[i]!=null)
			 {
			 System.out.println(m[i]);
			 }
		 }
	 }
	 public void sortMovies()
	 {
		 if(m!=null) {
		 Arrays.sort(m);
		 for(int i=0;i<m.length;i++)
		 {
			 System.out.println(m[i]);
		 }
		 }
		 if(m==null)
		 { 
			 System.out.println("movies are not there please add movies55");
		 }
	 }
	 public void searchMovie(String moviename)
	 {
		 for(int i=0;i<m.length;i++)
		 {
			 if(m[i]!=null)
			 {
				 if(m[i].getMoviename().equals(moviename)) 
				 {
					 System.out.println(m[i]);
					 System.out.println("movie is present");
					 break;
				 }
				 else
				 {
					 System.out.println("movie not found");
					 break;
				 }
		     } 
		 }
	 }
	 public void removeMovie(String moviename)
	 {
			for (int i =0;i< m.length;i++)
			{
				if(m[i]!=null)
				{
					if(m[i].getMoviename().equals(moviename))
					{
						m[i]=null;
						System.out.println("movie removed");
						break;
					}
					else
						System.out.println("movie not found");
					break;
				}
			}
		}
	 public void logout()
	 {
		 System.out.println("logged out sucessfully");
	 }
	 public void movieDetails(String moviename)
	 {
		 for(int i=0;i<m.length;i++)
		 {
			 if(m[i].getMoviename().equals(moviename))
			 {
				 System.out.println(m[i]);
				 break;
			 }
			 else
			 {
				 System.out.println("enter the correct moviename");
			 }
		 }
	 }
	 public void changeRating(String moviename,int rating)
	 {
			for (int i = 0; i < m.length; i++)
			{
				if(m[i]!=null)
				{
					if(m[i].getMoviename().equals(moviename))
					{
						m[i].setRating(moviename , rating);
						break;
					}
					else
						System.out.println("movie not found");
				}
			}
		}
	 public void changeUname(String ouname,String nuname)
	 {
			for (int i = 0; i < u.length; i++) 
			{
				if(u[i]!=null) 
				{
					if(u[i].getUname().equals(ouname))
					{
						u[i].setUname(ouname,nuname);
						break;
				    }
					else
					{
						System.out.println("user not found");
			     	}
			}
		}
	 }
	 public void changePhno(long ophno,long nphno)
	 {
			for (int i = 0; i < u.length; i++) 
			{
				if(u[i]!=null)
				{
					if(u[i].getPhone()==ophno)
					{
						u[i].setPhno(ophno ,nphno);
						break;
					}
					else
						System.out.println("user not found");
				}
			}
		}
	 public void userList()
	 {
			for (int i = 0; i < u.length; i++)
			{
				if(u[i]!=null)
				{
					System.out.println(u[i]);
				}
			}
		}
}
	
