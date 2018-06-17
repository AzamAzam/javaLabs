import  java.util.Scanner;
public  class  binary
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Doyou want  to  start ? \n(press any key  to continue and  N for  exit ) ");
		char ch = input.next().charAt(0);
		
		while(ch!='N')
		{
			System.out.print("Enter the number  : ");
			int num = input.nextInt();
			long  binary=0;
			int  m=1,r;
			while (num>0)
			{
				r= num%2;
				binary=binary+m*r;

				m*=10;
				num=num/2;
			}
			System.out.println("binary  is    : "+binary);
			
			System.out.println("Doyou want  to  continue ? \n(press any key  to continue and  N for  exit ) ");
			ch = input.next().charAt(0);
		};
	}
}