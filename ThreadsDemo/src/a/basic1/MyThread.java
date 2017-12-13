package a.basic1;

public class MyThread implements Runnable {
	
	int arr[] ={4,5,6,89,324,453,234};
	
	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		Thread t1 = new Thread(mt1, "one");
		Thread t2 = new Thread(mt2, "two");
		t1.start();
		t2.start();
	}
	
	@Override
	public void run() {
	
		for (int i = 0; i < arr.length; i++) {
			
			if(Thread.currentThread().getName().equals("one")
					&& arr[i]%2 == 0){
				System.out.println(" even "+arr[i]+ " by "+ Thread.currentThread().getName());
			}else if(Thread.currentThread().getName().equals("two") && arr[i]%2 != 0){
				System.out.println(" odd "+arr[i] +" by "+ Thread.currentThread().getName());
			}
		}
	}
	
	
}
