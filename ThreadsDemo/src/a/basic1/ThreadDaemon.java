package a.basic1;

public class ThreadDaemon extends Thread{  
		 public void run(){  
		  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
		   System.out.println("daemon thread work");  
		  }  
		  else{  
		  System.out.println("user thread work");  
		 }  
		 }  
		 public static void main(String[] args){  
		  ThreadDaemon t1=new ThreadDaemon();//creating thread  
		  ThreadDaemon t2=new ThreadDaemon();  
		  ThreadDaemon t3=new ThreadDaemon();  
		  
		  /**
		   * Must make a thread daemon before start()
		   */
		  t1.setDaemon(true);//now t1 is daemon thread  
		    
		  t1.start();//starting threads  
		  t2.start();  
		  t3.start();  
		 }  
		
}
