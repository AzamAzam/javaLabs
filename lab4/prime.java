public  class  prime{
	public boolean isPrime  (int  x){
		if  (x<=1)
			return false;
		for  (int i=2;i*i<=x;i++)
			if  ((x%i)==0)
				return false  ;
		return true;		
	}
	public int   printPrimes (int arr[] ) 
	{
	int  len=arr.length;		
					
				
			int count  =0;
			for  (int i=0;i<len;i++){
				if (isPrime(arr[i])){
					//System.out.print(i+" ");
					count++;
				}
			}
			return  count ;
		
	}
}
