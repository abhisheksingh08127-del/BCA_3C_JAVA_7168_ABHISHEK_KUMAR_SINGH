class MyThread extends Thread{
	
	public void run(){
	System.out.println("Thread is running with Name:"+Thread.currentThread().getPriority());
	System.out.println("Thread priority:"+Thread.currentThread().getPriority());
	}
}
public class SetGetThread{
	public static void main(String[] args){
		Thread myThread=new Thread(new MyThread());
		
		myThread.setName("MythreadNm");
		myThread.setPriority(Thread.MAX_PRIORITY);
		myThread.start();
		
		//mian Thread
			System.out.println("MAIn thread name :"+Thread.currentThread().getPriority());
			System.out.println("MAIn thread Priority:"+Thread.currentThread().getPriority());
	}
}
            
	
	