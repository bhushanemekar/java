package a.basic1;

public class ThreadSleep extends Thread
{
	public void run(){
		
		for(int i=1; i<6 ; i++)
		{	try{
			System.out.println(Thread.currentThread().getName()+" "+i);
			
			Thread.sleep(500);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
			}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadSleep t1 = new ThreadSleep();
		ThreadSleep t2 = new ThreadSleep();
		
		t1.start();
		t1.join();
		t2.start();
	}
}
