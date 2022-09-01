package question;

public class Employee {

		
		private int id;
		private String firstName;
		private String lastName;
		private  int salary;
		
		Employee(){
			//Default constructor
		}
		
		Employee(int id,String firstName, String lastName,int salary)
		{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
		
		}
		
		public int getId(){
			return id;
		}
		
		public String getFirstName()
		{
			return firstName;
		}
		
		public String getLastName()
		{
			return lastName;
		}
		
		public String getName()
		{
			return firstName+lastName;
		}
		
		public int getSalary()
		{
			return salary;
		}
		
		public void setSalary(int salary)
		{
			this.salary =salary;
		} 
		
		public int getAnnualSalary()
		{
			return salary*12;
		}
		
		public float getraiseSalary(int percent)
		{
			return salary*12+(salary*12*(percent/100F));
		}
		
		@Override
		public String toString(){
			return ""+"Employee id:"+id+" Name:"+firstName+" "+lastName+"Salary :"+salary;
		}
}