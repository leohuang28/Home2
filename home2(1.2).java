class week2_1_2
{
   public static void main(String args[])
   {
      int count = 0;
	  double sum = 0.0,average = 0.0;
	  double [] a = {10.2,15.4,2.5,46.7,35.1,22.4,11.5};
	  for(double x:a)
	  {
	      sum += x;
		  count++;
	  }
	  average = sum/count;
	  System.out.println("sum="+sum);
	  System.out.println("average"+average);
   }
}