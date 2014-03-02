import java.io.*;
import java.util.Scanner;

class week2_4_1
{
    public static void main(String[] args) 
	{
		int i=0,count=0,opt=0,j=0;
		double id = 0.0, ang = 0.0;
		Scanner sc = new Scanner(System.in);
			int n = 0;
			double r[][] = new double[1][1];
			while(true) {
				System.out.println("Option: 1)Input.2)Search.3)Quit\n");
				option = sc.nextInt();
				switch(option) {
					case 1 :
						System.out.println("Input how much : \n");
						n = sc.nextInt();
						r = new double[n][3];			
						System.out.println("Input編號、長軸與短軸： ");
						for(i = 0; i < n; i++) {
							for(j = 0; j < 3; j++) {
								r[i][j] = sc.nextDouble();
							}
						}
						break;
					case 2 :
						Oval c = new Oval();
						System.out.println("Input number： ");
						id = sc.nextDouble();
						for(i=0; i<n; i++) {
							if(id == r[i][0]) {
								c.radius = r[i][1];
								c.b = r[i][2];
								System.out.println("\n編號\t長軸\t短軸\t面積 ");
								System.out.println(r[i][0]+"\t"+r[i][1]+"\t"+r[i][2]+"\t"+c.Pie()+"\n");
								break;
							}
						}
						if(i == n)
							System.out.println("NO DATA\n");
						break;
					case 3 :
						return;
				}
			}
	}
}
class Circle {
	double radius = 0.0, angle = 0.0;
	double Arc() 
	{ 
		return 2 * 3.14 * radius * angle / 360;
	}
	double Pie() 
	{ 
		return 3.14 * radius * radius;
	}
}
class Oval extends Circle{
	double b = 0.0;
	double Pie() 
	{ 
		return 3.14 * super.radius * b;
	}
}