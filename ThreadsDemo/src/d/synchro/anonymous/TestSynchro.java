package d.synchro.anonymous;

public class TestSynchro {

	public static void main(String[] args) {
		
		PrintTable pt1 = new PrintTable();
		
		Thread t1 = new Thread(){ 
			public void run(){
				pt1.printTable(5);
			}
		};
		t1.start();
		Thread t2 =  new Thread(){ 
			public void run(){
				pt1.printTable(100);
			}
		};
		t2.start();
	}

}
