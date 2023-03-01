package netflix;
import java.util.Scanner;

public class NetflixDriver 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		Netflix n=new Netflix();
	/*	User [] u= {new User("PAVAN1","1@gmail",12345678l),
				    new User("PAVAN2","2@gmail",1234567892l),
				    new User("PAVAN3","3@gmail",1234567893l),
				    new User("PAVAN4","4@gmail",1234567489l),
				    new User("PAVAN5","5@gmail",1234567895l),
				    new User("PAVAN6","6@gmail",1234567896l),
				    new User("PAVAN7","7@gmail",1234567897l),
				    new User("PAVAN8","8@gmail",1234567898l),
				    new User("PAVAN9","9@gmail",1234567899l),
				    new User("PAVAN10","10@gmail",1234567890l)
					};
		Movies [] m= {new Movies("BATMAN1","1.0 hr",1),
				      new Movies("BATMAN2","1.1 hr",2),
				      new Movies("BATMAN3","1.2 hr",3),
				      new Movies("BATMAN4","1.3 hr",4),
				      new Movies("BATMAN5","1.4 hr",5),
				      new Movies("BATMAN6","1.5 hr",6),
				      new Movies("BATMAN7","1.6hr",7),
				      new Movies("BATMAN8","1.7 hr",8),
				      new Movies("BATMAN9","1.8 hr",9),
				      new Movies("BATMAN10","1.9 hr",10)
				      };*/
		boolean b=true;
		do {
			Thread.sleep(3000);
			System.out.println("1.create account");
			System.out.println("2.login ");
			System.out.println("3.add movie");
			System.out.println("4.search movie");
			System.out.println("5.sort movies");
			System.out.println("6.get movie details");
			System.out.println("7.remove movie");
			System.out.println("8.change rating");
			System.out.println("9.change username");
			System.out.println("10.change phoneno");
			System.out.println("11.display user detail");
			
			
			System.out.println("12.logout");
			System.out.println("13.exit");
			System.out.println("Enter your choice");
			int ch=s.nextInt();
			switch(ch) 
				{
						case 1:
						{
							System.out.println("enter your username");
							String uname=s.next();
							System.out.println("enter your mail id");
							String umail=s.next();
							System.out.println("enter your contact number");
							long cno=s.nextLong();
							n.createAccount(new User(uname,umail,cno));
						}
						break;
			            case 2:
				        {
				    	   System.out.println("enter your name");
				    	   String uname1=s.next();
				    	   System.out.println("enter your mail id");
				    	   String email_id1=s.next();
				    	   System.out.println("enter phno");
				    	   long phno1=s.nextLong();
				    	   n.Login(uname1, email_id1 ,phno1);
				        }
				        break;
			            case 3:
						{
							System.out.println("Enter the movie name");
							s.nextLine();
							String mname=s.nextLine();
							System.out.println("Enter the duration");
							String duration=s.nextLine();
							System.out.println("Enter the rating");
							int rating=s.nextInt();
							n.addMovie(new Movies(mname,duration,rating));
						}
						break;
					    case 4:
						{
							System.out.println("Enter the movie name");
							s.nextLine();
							String mname=s.nextLine();
							n.searchMovie(mname);
						}
					   break;
					   case 5:
					   {
						   n.sortMovies();
					   }
					   break;
					   case 6:
					   {
						   System.out.println("enter the moviename");
						   s.nextLine();
						   String mname=s.nextLine();
						   n.movieDetails(mname);
					   }
					   break;
					   case 7:
						{
							System.out.println("Enter the movie name");
							s.nextLine();
							String mname1=s.nextLine();
							n.removeMovie(mname1);
						}
					    break;
					   case 8:
						{
							System.out.println("enter the movie name");
							s.nextLine();
							String mname=s.nextLine();
							System.out.println("enter the  rating");
							int rating=s.nextInt();
							n.changeRating(mname, rating);
						}
						break;
					   case 9:
						{
							System.out.println("Enter the old uname");
							s.nextLine();
							String ouname=s.nextLine();
							System.out.println("Enter the new name");
							String nuname=s.nextLine();
							n.changeUname(ouname, nuname);
							
						}
						break;
						case 10:
						{
							System.out.println("Enter the old phone number");
							long ophno=s.nextInt();
							System.out.println("Enter the new phone number");
							long nphno=s.nextLong();
							n.changePhno(ophno, nphno);
						}
						break;
						case 11:
						{
							n.userList();
						}
						break;
						case 12:
						{
							n.logout();
						}
						break;
						case 13:
						{
							System.out.println("thank you");
							b=false;
						}
				}
		}
		while(b);
}
}
