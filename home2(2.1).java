import java.io.*;
import java.util.Scanner;

class week2_2_1
{
    public static void main(String[] args) 
	{
	    String name;
        int [] year = {0,0,0};
		int i=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入姓名 : \n");
		name = scanner.nextLine();
		System.out.println("輸入生日\n西元幾年幾月幾日 : ");
		for(i=0;i<3;i++)
		{
			year[i] = scanner.nextInt();
		}
		year[0] = year[0] - 1911;
		System.out.println("姓名:"+name);
		System.out.println("您的生日是 : 民國"+year[0]+"年"+year[1]+"月"+year[2]+"日");
	}
}