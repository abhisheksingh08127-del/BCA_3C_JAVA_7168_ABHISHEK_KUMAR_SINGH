import java.lang.*;
class a implements Runnable
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

class b implements Runnable
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


class c implements Runnable 
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

class ex26
{
		public static void main(String srgs[])
		{
			a ra=new a();
			b rb=new b();
		    c rc=new c();
			
			Thread ta =new Thread(ta);
			System.out.println(" thread A started");
			ta.start();
			
			Thread tb =new Thread(tb);
			System.out.println(" thread b started");
			tb.start();
			
			Thread tc =new Thread(tc);
			System.out.println(" thread c started");
			tc.start();
			
			
			
		}
}		
			
		