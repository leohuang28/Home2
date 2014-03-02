import java.io.*;
import java.util.Scanner;

class week2_2_2
{
    public static void main(String[] args) 
	{
	    double f1 = 0.0,f2 = 0.0;
		float sum = 0.0f;
		int i=0,opt=0;
		Scanner scanner = new Scanner(System.in);
		try
		{
			System.out.println("輸入兩個浮點數 : \n");
			f1 = scanner.nextFloat();
			f2 = scanner.nextFloat();
			System.out.println("已輸入"+f1+"以及"+f2);
		}catch(Exception e){
			System.out.println("Error:"+e);
		}
		while(true)
		{
			System.out.println("Option : 1)+.2)-.3)*.4)/.5)Quit\n");
			opt = scanner.nextInt();
			sum = 0.0f;
			switch(opt)
			{
				case 1 :
					sum = (float)(f1+f2);
					break;
				case 2 :
					sum = (float)(f1-f2);
					break;
				case 3 :
					if(f1==0||f2==0)
					{
						System.out.println("Sum = 0\n");
						break;
					}
					else
					{
						sum = (float)(f1*f2);
						break;
					}
				case 4 :
					if(f2 == 0)
					{
						System.out.println("分母不為0\n");
						break;
					}
					else
					{
						sum = (float)(f1/f2);
						break;
					}
					case 5 :
						return;
					default : 
						System.out.println("Error!!!!\n");
						continue;
			}
			if(sum != 0)
				System.out.println("Sum = "+sum+"\n");
		}
	}
}