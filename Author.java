package question;

public class Author {
	 public String firstName;
	public  String lastName;
	 public String bookName;
	
	   
		   
	   
	   public Author(String firstName, String lastName){
		   this.firstName=firstName;
			this.lastName=lastName;
	   }
	   public Author(String firstName, String lastName, String bookName)
	   {
		   this.firstName=firstName;
			this.lastName=lastName;
			this.bookName=bookName;
	   }
		
	  
		
		public void  setFirstName(String firstname)
		{
			this.firstName = firstname;
			return;
		}
		public void  setLasttName(String lastname)
		{
			this.lastName = lastname;
			return;
		}
		public void setbookname(String bookname) {
			this.bookName = bookname;
			return;
		}
		public String getfirstname()
		{
			return this.firstName;
		}
		public String getlastname()
		{
			return this.lastName;
		}
		
		public String getbookname()
		{
	      return this.bookName;
		}
		public String toString()
		{
			String abc =(this.firstName + " " + this.lastName + " " + this.bookName);
					return abc;
		}
		
			
		
		
		

}
