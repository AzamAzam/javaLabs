public  class  lab7T2{
	public static  void  main  (String  args[]){
		int a[]={1,2,3};
	
		System.out.println("Length  of  Array  is  "+	lengthT(a));
		
	}
static	int  lengthT(int  a[]){
			int  i=0;
	try{
		while (true){
			int b=a[i++];
		}
	}
	catch (ArrayIndexOutOfBoundsException e){
		return i-1;
	}
	}
}