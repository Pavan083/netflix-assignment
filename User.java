package netflix;

import java.util.Objects;

public class User  {
	private String uname;
	private String email_id;
	private long phno;
	//constructors
	User()
	{
		System.out.println("user added sucessfully");
	}
	User(String uname ,String email_id , long phno)
	{
		this();
		this.uname=uname;
		this.email_id=email_id;
		this.phno=phno;
	}
	//getters
	public String getUname()
	{
		return uname;
	}
	public String getEmail_id()
	{
		return email_id;
	}
	public long getPhone()
	{
		return phno;
	}
	//setters
	public void setUname(String ouname,String nuname)
	{
		if(this.uname==ouname)
		{
			this.uname=nuname;
			System.out.println("uname updated to:"+uname);
		}
		else
		{
			System.out.println("enter the correct old uname");
		}
	}

	public void setPhno(long ophno,long nphno)
	{
		if(this.phno==ophno)
		{
			this.phno=nphno;
			System.out.println("phno updated to:"+phno);
		}
		else
		{
			System.out.println("enter the correct old phno");
		}
	}
    @Override
    public String toString() {
    	return "username:" +uname+"\temailid:"+email_id+"\tphoneno:"+phno;
    }
    @Override
    public int hashCode() {
    	
    	return Objects.hash(uname , email_id , phno);
    }
    @Override
    public boolean equals(Object o)
    {
    	User u=(User)o;
    	if(this.uname.equals(u.uname)&&this.email_id.equals(u.email_id)&&this.phno==u.phno)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
}
