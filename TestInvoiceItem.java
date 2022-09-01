package question;

public class TestInvoiceItem {

		  public static void main(String[] args) {
		      // Test constructor and toString()
		  
		      InvoiceItem i1=new InvoiceItem("123ABC","Pen Drive_128gb",5,1200);
		      
		      System.out.println("ID : " + i1.getId());
		      System.out.println("Description : " + i1.getDesc());
		      System.out.println("Quantity : " + i1.getQty());
		      System.out.println("Unit Price : " + i1.getUnitPrice());
		      System.out.println("Total : " + i1.getTotal());
		      System.out.println("**************" );
		      i1.setUnitPrice(2000);
		      System.out.println("Total : " + i1.getTotal());
		      System.out.println("**************" );
		      System.out.println(i1);
		      
		      
		      
		   }

	}

