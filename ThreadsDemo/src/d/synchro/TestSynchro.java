package d.synchro;

public class TestSynchro {

	public static void main(String[] args) {
		
		PrintTable pt1 = new PrintTable();
		
		MyThread1 mt1 = new MyThread1(pt1);
		mt1.start();
		MyThread2 mt2 = new MyThread2(pt1);
		mt2.start();

	}

}
