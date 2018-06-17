public  class  calculate  {
	public  double   CalculateQuotient(double  x,int y) throws  ArithmeticException
	{
		if (y==0)
			throw new ArithmeticException("divisor is zero");
		else {
			return x/y;
		}
	}
}