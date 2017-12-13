package d.synchro;

public class MyThread2 extends Thread{

	PrintTable pt;
	MyThread2(PrintTable pt){
		this.pt = pt;
	}
	
	public void run(){
		PrintTable pt = new PrintTable();
		pt.printTable(2);
	}
}
