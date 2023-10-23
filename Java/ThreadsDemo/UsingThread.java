package ThreadsDemo;

public class UsingThread extends Thread{

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup());
		// TODO Auto-generated method stub
		abc ut = new abc();
		abc ut1 = new abc();
		ut.setName("a");
		ut1.setName("b");
		System.out.println("inside thread");
		System.out.println("default priority " + ut.getPriority());
		ut.setPriority(MAX_PRIORITY);
		ut1.setPriority(MIN_PRIORITY);
		System.out.println("after changing priority " + ut.getPriority());
		ut1.start();
		ut.start();
		
	}
	
}
class abc extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getThreadGroup());
		for(int i=0;i<3;i++) {
			System.out.println("outside thread " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
