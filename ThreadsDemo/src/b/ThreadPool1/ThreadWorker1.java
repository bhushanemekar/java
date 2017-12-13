package b.ThreadPool1;

public class ThreadWorker1 implements Runnable{

	public void run(){
		
		processMessage();
		
	}
	
	public void processMessage(){
		System.out.println(Thread.currentThread().getName()+" start");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" end");
	}
}
