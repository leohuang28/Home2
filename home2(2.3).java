import java.io.*;
import java.util.Scanner;

class week2_2_3
{
    public static void main(String[] args) 
	{
		int i=0,year = 0,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J�@�Ӧ褸���~��\n");
		year = sc.nextInt();
		System.out.println("�Ӧ~���褸�~�� : \n");
		for(i=year;i>0;i--)
		{
			if(i%400 == 0 || (i%4==0&&i%100!=0))
			{
				System.out.println("�褸"+i+"�~\t");
				if(count%10 == 0)
					System.out.println("\n");
				count++;
			}
		}
	}
}