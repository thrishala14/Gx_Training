package ThreadsDemo;

public class OverrideRun extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideRun thread = new OverrideRun();
		OverrideRun thread1 = new OverrideRun();
		thread.start();
		thread1.run(10);
		System.out.println("this code is outside thread");
	}
	public void run() {
		for(int i=0; i<3;i++)
		System.out.println("using start() method");
	}
	
	public void run(int j) {
		for(int i=0; i<3;i++)
		System.out.println("overriding the run method " +j);
	}
}
