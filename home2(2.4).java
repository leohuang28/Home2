import java.io.*;
import java.util.Scanner;

class week2_2_4
{
    public static void main(String[] args) 
	{
		int i=0,count=0,opt=0,j=0;
		String [][] stuname = new String[10][3];
		String [] s1 = new String[3];
		String id = "0";
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Option: 1)Input.2)Search.3)Quit\n");
			opt = sc.nextInt();
			switch(opt)
			{
				case 1 :
					while(true)
					{
						System.out.println("Input student name : (input:-1,-1,-1 then quit)\n");
						for(i=0;i<3;i++)
						{
							s1[i] = sc.nextLine();
						}
						if(s1[0].equals("-1")==true && s1[1].equals("-1")==true && s1[2].equals("-1")==true)
							break;
						else
						{
							for(i=0;i<3;i++)
							{
								stuname[count][i] = s1[i];
							}
							count++;
						}
					}
					break;
				case 2 : 
					System.out.println("Input search id : \n");
					id = sc.next();
					for(i=0;i<count;i++)
					{
						if(stuname[i][0].equals(id)==true)
						{
							System.out.println("½s¸¹\t©m¦W\t¦¨ÁZ\n");
							System.out.println(stuname[i][0]+"\t"+stuname[i][1]+"\t"+stuname[i][2]+"\n");
							break;
						}
					}
					if(i==count)
						System.out.println("NO DATA\n");
					break;
				case 3 : 
					return;
				default :
					continue;
			}
		}
	}
}