public class Task1 {

    public static void main(String args[]) {
        Task1 t =new Task1();
        Thread t1 = new ThreadDemo(1,t);
        Thread t2 = new ThreadDemo(2,t);
        t1.start();
        t2.start();

    }

    void output(ThreadDemo t) {

        synchronized (this){

        for (int i = 5; i > 0; i--) {
            System.out.println("counter -- :" + i);
        }
            System.out.println("Exiting thread - "+t.a);
    }}
}
