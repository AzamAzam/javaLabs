public class  MyThread implements Runnable{
	String t_name;
	Thread t;
	public MyThread (String name){
		t_name=name;
		t=new Thread(this, t_name);
		System.out.println("My Thread: " + t);
		t.start();
	}
	public void run (){
		try {
			for (int  i=0;i<=5;i++){
				System.out.println("thread " +t_name+ " : " + i);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			System.out.println(t_name + "Interrupted");
		}
		System.out.println(t_name + " exiting.");
	}	
}