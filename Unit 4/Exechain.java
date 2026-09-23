class MyException extends Exception
{
	public MyException(String message)
	{
		super(message);
	}
}
class Exceptionchanging{
	void method1() throws MyException
	{
	 throw new MyException("Exception from method1");
	}
	
	void method2() throws MyException{
	try{
		method1();
	   }
		catch(MyException e)
		{
		throw new MyException("Exception from method2");
		
		}
	}	
		
		
	void method3(){
	try{
		method2();
	   }
	   
	catch(MyException e)
	   {
		System.out.println("caugth exception in method3:"+e.getMessage());
		
		if(e.getCause()!=null)
		{
		System.out.println("chained  exception:"+e.getCause().getMessage());
		
		}
	  }
    }	
}

public class Exechain
{
	public static void main(String[] args)
	{
		Exceptionchanging ec =new Exceptionchanging();
		ec.method3();
	}
}	

	