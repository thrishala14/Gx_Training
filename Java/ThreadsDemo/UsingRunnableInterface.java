package ThreadsDemo;

public class UsingRunnableInterface implements Runnable{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			UsingRunnableInterface ur = new UsingRunnableInterface();
			Thread thread = new Thread(ur);
			thread.start();
			System.out.println("inside thread");
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("outside main thread");
		}

}

