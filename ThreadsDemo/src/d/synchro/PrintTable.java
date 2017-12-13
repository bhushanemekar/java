package d.synchro;

public class PrintTable {
	
	public void printTable(int n ){
		for (int j = 0; j < 10; j++) {
			System.out.println(Thread.currentThread().getName()+" "+n*j);
		}
		
	}
}
