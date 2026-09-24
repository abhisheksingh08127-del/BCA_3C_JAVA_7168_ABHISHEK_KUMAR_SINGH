import java.lang.*;
class a extends Thread 
{
	public void run()
	{	
		for(int i=1;i<=5;i++)
		{
			System.out.println("from thread A:i="+i);
		}
		System.out.println("Exit from a");
	}
}

class b extends Thread 
{
		public void run()
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println("from thread B:j="+j);
			}	
			System.out.println("Exit from B");
		}
}	


class c extends Thread 
{
	public void run()
	{	
		for(int k=1;k<=5;k++)
		{
			System.out.println("from thread c:k="+k);
		}
		System.out.println("Exit from c");
	}
}

class ex163
{
		public static void main(String srgs[])
		{
			a a1=new a();
			a1.start();
			
			b b1=new b();
			b1.start();
			
			c c1=new c();
			c1.start();
			
		}
}		
			
		