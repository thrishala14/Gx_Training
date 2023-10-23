package ThreadsDemo;

public class JoinDemo extends Thread{
	public void run() {
		for(int i =0; i< 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JoinDemo t1 = new JoinDemo();
		t1.setName("t1");
		JoinDemo t2 = new JoinDemo();
		t2.setName("t2");
		JoinDemo t3 = new JoinDemo();
		t3.setName("t3");
		t1.start();
		t1.join(1000);
		t2.start();
		t2.join();
		t3.start();
	}

}
