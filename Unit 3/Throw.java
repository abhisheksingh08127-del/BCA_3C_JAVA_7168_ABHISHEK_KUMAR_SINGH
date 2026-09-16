public class Throw{
	static void checkvotingeligibility(int age, String studentname){
		if(age <18){
			throw new ArithmeticException(studentname+" is not eligible to vote(age must be 18+.");
		}else{
			System.out.println(studentname+" is eligible to vote!");
		}
	}
	public static void main(String args[]){
		try{
			System.out.println("checking registration for vishal..");
			checkvotingeligibility(16,"Abhishek");
		}catch(ArithmeticException e){
			System.out.println("caught Explicit Exception:"+e.getMessage());
		}
	}
}