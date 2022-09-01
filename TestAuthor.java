package question;

public class TestAuthor {
	public static void main(String[] args) {
	      // Test constructor and toString()
	     
		Author a1 = new Author( "Priyadarshani ", "kumari");
	      System.out.println(a1.firstName + " "+ a1.lastName); 

	      Author a2 = new Author (" Priyadarshani","kumari"," Learncorejava");
	      System.out.println(a2.firstName + " " + a2.lastName+""+ a2.bookName);
	}
}
