package a.basic1;

public class ThreadAnonymous {
	public static void main(String[] args) {
		
	
	Thread t1 = new Thread(){
		public void run(){
			System.out.println("Anonymous 1 ");
		}
	};
	
	t1.start();
	
	
	Runnable r1 = new Runnable() {
		
		public void run() {
			System.out.println("Anonymous runnable");
		}
	};
	
	Thread t2 = new Thread(r1);
	t2.start();
	
	
	}
}
