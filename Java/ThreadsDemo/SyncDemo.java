package ThreadsDemo;

class Demo{  
	 synchronized void prints(String s){
	   for(int i=0; i<3;i++){  
	     System.out.println(s);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	}  
}  
	  
public class SyncDemo{  
	public static void main(String args[]){  
		Demo d = new Demo();
		  
		Thread t1=new Thread(){  
			public void run(){  
			d.prints("Thread 1");  
			}  
		};  
		Thread t2=new Thread(){  
			public void run(){  
			d.prints("Thread 2");  
			}  
		};  
		  
		t1.start();  
		t2.start();  
	}  
}  
