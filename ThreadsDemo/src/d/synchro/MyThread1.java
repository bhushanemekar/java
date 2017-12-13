package d.synchro;

public class MyThread1 extends Thread{
	PrintTable pt;
	MyThread1(PrintTable pt){
		this.pt = pt;
	}
	public void run(){
		PrintTable pt = new PrintTable();
		pt.printTable(100);
	}
}
