package b.ThreadPool1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPoolExecutor {
	
	public static void main(String[] args) {
		//pool of 5 threads
		ExecutorService tpe = Executors.newFixedThreadPool(5);
		
		//assign it to 10 tasks with internal delay to perform each task.
		for(int i=0; i<10; i++){
			ThreadWorker1 tw1 = new ThreadWorker1();
			tpe.execute(tw1);
			
			/*
			 * using regular threads
			 */
			/*Thread t1 = new Thread(tw1);
			t1.start();*/
		}
		
		if(!tpe.isTerminated())
			tpe.shutdown();
	}

}
