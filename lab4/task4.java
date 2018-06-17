public class  task4{
	public static  void  main  (String args  []){
		MyThread t1=new  MyThread("One");
		MyThread t2=new  MyThread("Two");
		MyThread t3=new  MyThread("Three");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}		
}