public class Finally{
public static void main(String args[]){
	
	
	try{
		System.out.println("Abhishek opening Database connection");
		 int data=100/5;
		
			System.out.println("Data calculated:"+ data);
		}
	catch(ArithmeticException e){
		System.out.println("ArithmeticEror occured:");
		}
		
	finally{
			System.out.println("Finally Block: Closing Abhishek database connection guarented:");
		}
	}
}	
	