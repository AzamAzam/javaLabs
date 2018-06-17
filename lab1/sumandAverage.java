import  java.util.Scanner;
public  class  sumandaverage{
	 public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the upper bound: ");
		int num = input.nextInt();
		int  sum=(num*(num+1))/2;
		int avg  =  sum/num;
		System.out.println("Sum of first "+num +" numbers is  "+ sum);
		System.out.println("average  of first "+num +" numbers is  "+ avg);
	}
}