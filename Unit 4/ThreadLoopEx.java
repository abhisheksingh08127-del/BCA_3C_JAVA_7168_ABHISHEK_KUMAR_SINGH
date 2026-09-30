class LoopThread extends Thread{
	private int iterations;
	public LoopThread(int iterations){
		this.iterations=iterations;
	}
	
	public void run(){
		for(int i=0;i<iterations;i++){
			try{
				Thread.sleep(500); 
				System.out.println("Currrent Thread:" + Thread.currentThread().getName());
			}catch(InterruptedException ex){
				System.out.println("Exception has been caugtht:" +ex);
			}
		
		System.out.println(i);
		}
	}
}
public class ThreadLoopEx{
	public static void main(String[] args)
	{
		LoopThread t1= new LoopThread(5);
		LoopThread t2= new LoopThread(5);
		
		t1.start();
		
		try{
			System.out.println("Currrent Thread:" + Thread.currentThread().getName());
			t1.join();
		}catch(InterruptedException ex){
				System.out.println("Exception has been caugtht:" +ex);
		}
			
		t2.start();
		
		try{
			System.out.println("Currrent Thread:" + Thread.currentThread().getName());
			t2.join();
		}catch(InterruptedException ex){
				System.out.println("Exception has been caugtht:" +ex);
		}
		
	}
}
		
		
			
				
		