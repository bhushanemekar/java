package c.ThreadActivities;

public class TestShutDownHook {
 
	public static void main(String[] args)throws Exception {  
	  
	//1. extends thread class
	/*	Runtime r=Runtime.getRuntime();  
	r.addShutdownHook(new ShutDownHook());*/
	
	//2. Runnable shutdownhook
		ShutDownHookRunnable sHookR = new ShutDownHookRunnable();
		Runtime rt1 = Runtime.getRuntime();
		Thread shr = new Thread(sHookR);
		//shr.start();
		rt1.addShutdownHook(shr);
	      
	System.out.println("Now main sleeping... press ctrl+c to exit");  
	try{
		Thread.sleep(3000);
	}catch (Exception e) {
		e.printStackTrace();
	}  
	
	}  
} 

