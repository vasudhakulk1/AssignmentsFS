package fs.MultithreadingEx;

class MyThread1 extends Thread{
	public void run() {
		for (int i=0; i<5;i++) {
			System.out.println("thread 1 is running");
		}
	}
}
class MyThread2 extends Thread{
	public void run() {
		for (int i=0; i<5;i++) {
			System.out.println("thread 2 is running");
		}
	}
}
public class MultipleThread{
	
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.setName("Thread 1");
		
		MyThread2 t2 = new MyThread2();
		t1.setName("Thread ");
		
		t1.run();
		t2.run();
		
	}

}
