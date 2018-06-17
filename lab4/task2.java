import  java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;

public  class  task2
{
	public  static  void  main  (String  args[])
	{	
		int ar[]={5,9,8,6,7,5,2,7,45,8,99,36,22,21,27,23};
		Scanner input  =new  Scanner(System.in);
		System.out.print("Enter  file Name : ");
		String  filename=input.next();
		FileWriter writefile;
		FileReader readfile; 	
		//readfile=new FileReader(filename);
		try {
			readfile=new FileReader(filename);
				System.out.println("File exists ");
			if (readfile.read()==-1)
			throw new Exception("File is  empty");
		}catch (Exception e){
			System.out.println(e);
			try{
				writefile=new FileWriter(filename); 
				System.out.println("Created File Name of \" "+filename+" \" ");
			}catch(Exception ex){
				System.out.println(ex);		
			}
		}
		finally{
			try {
			FileReader file=new FileReader("File.txt");
			FileWriter wfile=new FileWriter(filename,true); 
			
			int i;
			System.out.println();
			while  ((i=file.read())!=-1){
				System.out.print((char)i);
				wfile.write(i);			
				}
			file.close();
			System.out.println();
			System.out.print("Enter  choice  : ");
			int  ch=input.nextInt();
			switch(ch){
				case 1:
					int  f=1;
					System.out.print("Enter  number for  factorial : ");
					int  in=input.nextInt();
					for (int k=1;k<=in;k++) f*=k;
					System.out.println("factorial  of  "+in +" = "+f);
					wfile.write("factorial  of  "+in +" = "+f);				
					break; 
				case 2:
					prime p=new prime();
					System.out.println("primes in array are "+p.printPrimes(ar));
					wfile.write("primes in array are "+p.printPrimes(ar));
					break;		
				case 3:
					System.out.println(countOddEven(ar));
					wfile.write(countOddEven(ar));	
					break;
				case 4:
					System.out.println("Exit");
					System.exit(0);					
				}
				System.out.println("\' "+filename+" \' written");
				wfile.close();
			}catch(Exception e)
			{
			System.out.println(e);
			}
		}
	}
 	static String  countOddEven(int arr[]){
		int odd=0,even=0;
		for (int i=0;i<arr.length;i++)	{
			if (arr[i]%2==0)
			even++;
			else  odd++;
		}
		return "Even numbers  in array are "+even+"\nOdd Numbers in array  are "+odd;
	} 
}

