import java.io.*;
import java.util.Scanner;

class week2_3_1
{
    public static void main(String[] args) 
	{
		int i=0,count=0,opt=0,j=0;
		Scanner sc = new Scanner(System.in);
		double [][] r = new double[1][1];
		double id = 0.0,an = 0.0;
		int c=0;
		Circle c1 = new Circle();
		while(true)
		{
			System.out.println("Option: 1)Input.2)Search.3)Quit\n");
			opt = sc.nextInt();
			switch(opt)
			{
				case 1 :
					System.out.println("Input how much : \n");
					c = sc.nextInt();
					r = new double[c][2];
					System.out.println("Input number and radius\n");
					for(i=0;i<c;i++)
					{
						for(j=0;j<2;j++)
						{
							r[i][j] = sc.nextDouble();
						}
					}
					break;
				case 2 : 
					System.out.println("Input number and angle\n");
					id = sc.nextDouble();
					an = sc.nextDouble();
					for(i=0;i<c;i++)
					{
						if(id == r[i][0])
						{
							c1.rad = r[i][1];
							c1.ang = an;
							System.out.println("½s¸¹\t¥b®|\t©·ªø\t­±¿n\n");
							System.out.println(r[i][0]+"\t"+r[i][1]+"\t"+c1.Arc()+"\t"+c1.Pie()+"\n");
							break;
						}
					}
					if(i == c)
						System.out.println("NO DATA\n");
					break;
				case 3 :
					return;
			}
		}
	}
}

class Circle
{
	double rad = 0.0,ang = 0.0;
	double Arc()
	{
		return 2*3.14*rad*(ang/360);
	}
	double Pie()
	{
		return 3.14*rad*rad;
	}
}