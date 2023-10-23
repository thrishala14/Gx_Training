package ThreadsDemo;

public class YieldMethod extends Thread{

	public void run()  
    {  
        for (int i=0; i<3 ; i++)  
            System.out.println(Thread.currentThread().getName());  
    }  
    public static void main(String[] args)  
    {  
    	YieldMethod t1 = new YieldMethod();  
    	YieldMethod t2 = new YieldMethod();  
    	YieldMethod t3 = new YieldMethod();
        
    	t1.setName("t1");
    	t2.setName("t2");
    	t3.setName("t3");
    	
        t1.start();  
        t2.start();  
        t3.start();
        for (int i=0; i<3; i++)  
        {  
            t2.yield();  
            System.out.println(Thread.currentThread().getName());  
        }  
    }  
}
