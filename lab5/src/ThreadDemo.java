public class ThreadDemo extends Thread{
    int  a;
    Task1 printDemo;
    public ThreadDemo(){}
    public ThreadDemo(int n,Task1 t){
        a=n;
        printDemo=t;
    }
    public void run () {

        System.out.println("Starting  Thread - " + a);

           printDemo.output(this );



    }
}
