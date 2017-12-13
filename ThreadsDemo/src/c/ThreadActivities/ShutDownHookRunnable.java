package c.ThreadActivities;

public class ShutDownHookRunnable implements Runnable{
	
	
	@Override
	public void run(){
		System.out.println(" Runnable shutdown hook");
	}
}
