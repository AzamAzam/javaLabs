public  class  prime{
	public boolean isPrime  (int  x){
		if  (x<=1)
			return false;
		for  (int i=2;i*i<=x;i++)
			if  ((x%i)==0)
				return false  ;
		return true;		
	}
	public int   printPrimes (int min, int max )throws Exception 
	{
		if (max<=min) throw new  Exception(min+" is greater than or equal to "+max);
		else if  (min<0 ||max<0) throw new  Exception(max+" or "+min +" is  less  than  zero ");
			
		else  {
			int count  =0;
			for  (int i=min;i<=max;i++){
				if (isPrime(i)){
					//System.out.print(i+" ");
					count++;
				}
			}
			return  count ;
		}
	}
}