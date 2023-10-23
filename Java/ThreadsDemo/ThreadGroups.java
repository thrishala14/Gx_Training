package ThreadsDemo;

class ExampleThreads extends Thread{
	private ThreadGroup group;
	
	public ExampleThreads(ThreadGroup group) {
		this.group = group;
	}
	public void run() {

		System.out.println(Thread.currentThread().getThreadGroup().activeCount());
		for(int i =0; i<5;i++) {
		System.out.println("inside group " +group.getName());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
class ThreadGroups{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup());
	
		ThreadGroup group1 = new ThreadGroup("Thrishala");
		ExampleThreads t1 = new ExampleThreads(group1);
		t1.start();

		ExampleThreads t2 = new ExampleThreads(group1);
		t2.start();
		
		ThreadGroup group2 = new ThreadGroup("galaxe");
		ExampleThreads t3 = new ExampleThreads(group2);
		t3.start();
		ExampleThreads t4 = new ExampleThreads(group2);
		t4.start();

		
		
	}

}
