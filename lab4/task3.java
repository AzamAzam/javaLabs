public  class  task3{
public static void main(String args[]) {
	Thread t1 = new Myeventhread();
	Thread t2 = new Myoddthread();
		t1.start();
		t2.start();
		
	}

}

