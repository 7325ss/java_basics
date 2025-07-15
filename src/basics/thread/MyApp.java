package basics.thread;

class NumberThread extends Thread{
	private class test{
		
	}
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("NumberThread: "+i);
			//Thread.yield();
		}
	}
}

public class MyApp {
	public static void main(String[] args) {
		
		NumberThread thread = new NumberThread();
//		thread.run();

		thread.start();
		
//		NumberThread thread1 = new NumberThread();
//		thread1.start();
		for(int i=0; i<5; i++) {
			System.out.println("MainThread: "+i);
			//Thread.yield();
		}
	}
}
