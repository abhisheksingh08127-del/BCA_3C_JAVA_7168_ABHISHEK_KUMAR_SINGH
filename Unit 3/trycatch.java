public class trycatch{
public static void main(String args[]){
	String Studentname ="Abhishek";
	System.out.println(Studentname +"Started math calculation");
	
	try{
		int totalmarks=100;
		int Subjects=0;
		int result=totalmarks/Subjects; // risky divided by zero
		
		System.out.println("result:"+result); // throws ArithmeticException
		}
	catch(ArithmeticException e){
		System.out.println("Exeption caugth:Division by zero not allowed for"+Studentname);
		
		System.out.println("System eror deatails:"+e.getMessage());
		}
		
	System.out.println(Studentname +"'program continues execution smmothly!");
	}
}	
	