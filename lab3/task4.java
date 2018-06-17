import  java.util.Scanner;
public class  task4{
	public  static void  main  (String  args []){
		Scanner input =new  Scanner(System.in);
		System.out.println("Enter  min Boundary : ");
		int min =input.nextInt ();
		System.out.println("Enter  max Boundary : ");
		int max =input.nextInt();
		prime p=new  prime();
		try  {
			System.out.println("Prime  number count  = " +p.printPrimes(min,max));
		}
		catch (Exception e){
			System.out.println(e);
		}
	} 
}