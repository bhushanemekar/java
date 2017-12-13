package d.synchro.anonymous;

public class PrintTable {
	
	public synchronized void  printTable(int n ){
		for (int j = 0; j < 10; j++) {
			System.out.println(Thread.currentThread().getName()+" "+n*j);
		}
		
	}
}
