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
		System.out.println("�п�J�m�W : \n");
		name = scanner.nextLine();
		System.out.println("��J�ͤ�\n�褸�X�~�X��X�� : ");
		for(i=0;i<3;i++)
		{
			year[i] = scanner.nextInt();
		}
		year[0] = year[0] - 1911;
		System.out.println("�m�W:"+name);
		System.out.println("�z���ͤ�O : ����"+year[0]+"�~"+year[1]+"��"+year[2]+"��");
	}
}