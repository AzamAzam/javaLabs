import java.util.Scanner;
import java.io.FileWriter;

public  class  task1{
	
	public  static  void  main  (String args[]){
	Scanner  input =new  Scanner  (System.in);	
	
	System.out.print("Input a string : ");	
	String  s1=input.nextLine();	
//		System.out.println(s1);
	
		//writing file  
	try {
		FileWriter fw = new FileWriter("testout.txt");
		fw.write(s1);
		fw.close();
	} catch (Exception e) {
		System.out.println(e);
	}

	String  s2[]=s1.split(" ");
	for (int i=0;i<s2.length;i++){
		if (ispalindrom(s2[i]))
			System.out.println(s2[i]);
	}
}	

	static boolean ispalindrom(String s){
		int  len=s.length();
		int  j=len-1;
	
		for  (int  i=0;i<len;i++,j--){
			if  (s.charAt(i)!=s.charAt(j))
			return  false ;
		}
		return  true;  
	}	
}



		
