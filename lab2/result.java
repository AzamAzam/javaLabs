import  java.util.Scanner;

public  class  result  {
	int  totalmarks,marksbtained ;
	result(){
		totalmarks=100;
		marksbtained=90;
	}
	public  static  void  main (String args [])  
	{	Scanner input  =new  Scanner(System.in);
		while  (true){
			
			System.out.println("Enter Choice  \n 1  for  Total  Marks  \n 2  for  Marks  Obtained \n 3  for  change Marks  Obtained \n 4  for  exit  ");
			int n=input.nextInt ();
			result re=new result ();
			switch  (n){
				case 1 : 
					System.out.println("Total  Marks = "+re.totalmarks);
					break;
				case  2: 
					System.out.println("Marks Obtained = "+re.marksbtained);
					break;
				case 3 : 
					System.out.println("You can't change  ILLEGAL access ");
					break;
				case 4 : 
					System.exit (0);
		}
		
		}
	}
}