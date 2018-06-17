import  java.util.Scanner;

public  class  task3{
	public static class  Student {
			String  name  ;
			int  rollno  ;
			static  String  uniName;  
	
		public Student(){
			name="Azam";
			rollno=17;
		}
		public  Student (String  n,  int  no ){
			name=n;
			rollno=no;
		}
		static public void   changeUniName(){
			uniName="PUCIT";
		}
	}
	public  static  void  main (String args [])  
	{
		Scanner input  =new  Scanner(System.in);
		System.out.print("Enter  name  of  Student : ");
		String  stdName=input.nextLine();
		System.out.print("Enter  RollNo  of  Student : ");
		int  rollno=input.nextInt();
		
		Student std=new  Student(stdName,rollno);
		std.changeUniName();
		System.out.println("OUTPUT:\nName  "+ std.name +"\nRoll No  "+std.rollno + "\nUniversty Name  "+std.uniName);
	}
}