import java.io.*;
import java.util.Scanner;

class week2_2_3
{
    public static void main(String[] args) 
	{
		int i=0,year = 0,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個西元的年份\n");
		year = sc.nextInt();
		System.out.println("閨年的西元年份 : \n");
		for(i=year;i>0;i--)
		{
			if(i%400 == 0 || (i%4==0&&i%100!=0))
			{
				System.out.println("西元"+i+"年\t");
				if(count%10 == 0)
					System.out.println("\n");
				count++;
			}
		}
	}
}