public  class  armstrongimp extends  armstrong
{
	public void   armstrongNumbers() {
		for   (int  i=0; i<=1000;i++){
		int sum=0,j,p=0;
		
		for  (j=i;j!=0;j/=10){
			p++;
		}
		for  (j=i;j!=0;j/=10){
			sum+=Math.pow(j%10,p);
		}
		if  ( sum==i)
			System.out.print(i+" ");
	}
}
}
