public  class  jaggedarray{
	public   static  void  main  (String  args[]){
		int  arr [][]=new int  [4][];
		int  k=0;
		for (int i=0  ; i<4 ;i++){
			k=i;
			arr[i]=new  int  [k+1];
			
			for  (int j=0;j<=i;j++)
			{
				arr[i][j]=k;
				System.out.print(arr[i][j]);
				k++;
			}	
			System.out.println();
			
		}
		
	} 
}