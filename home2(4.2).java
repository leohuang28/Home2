import java.io.*;
import java.util.Scanner;

class week2_4_2
{
    public static void main(String[] args) 
	{
		int i=0,count=0,opt=0,j=0;
		double a = 0, b = 0;
		Shape shapes[];
		ArrayList<Shape> shapearray = new ArrayList<Shape>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1)��� 2)��� 3)�x�� 4)�T�� 5)Quit\n ");
			option = sc.nextInt();
			switch(option) {
				case 1 :
					System.out.print("�п�J�b�|: ");
					a = sc.nextDouble();
					Circle c = new Circle(a);
					shapearray.add(c);
					break;
				case 2 :
					System.out.print("�п�J���b�P�u�b: ");
					a = sc.nextDouble();
					b = sc.nextDouble();
					Oval o = new Oval(a, b);
					shapearray.add(o);
					break;
				case 3 :
					System.out.print("�п�J���P�e: ");
					a = sc.nextDouble();
					b = sc.nextDouble();
					Rectangle r = new Rectangle (a, b);
					shapearray.add(r);
					break;
				case 4 :
					System.out.print("�п�J���P��: ");
					a = sc.nextDouble();
					b = sc.nextDouble();
					Triangle t = new Triangle(a, b);
					shapearray.add(t);
					break;
				case 5 :
					for(int i=0;i<shapearray.size();i++)
					{
						shapearray.get(i).print();
					}
					return;
			}
		}
	}
}
abstract class Shape {
	abstract void print();
}

class Circle extends Shape {
	double r = 0.0;
	public Circle(double r) { 
		this.r = r; 
	}
	public void print() {
		System.out.println("��έ��n: " + 3.14 * r * r);
	}  
}

class Oval extends Shape {
	double a = 0.0, b = 0.0;
	public Oval (double a, double b) {
		this.a = a;
		this.b = b;
	}
	public void print() {
		System.out.println("���έ��n: " + 3.14 * a * b);
	} 
}

class Rectangle extends Shape {
	double width = 0.0, height = 0.0;
	public Rectangle(double w, double h) { 
		this.width = w; 
		this.height = h;
	}
	public void print() {
		System.out.println("�x�έ��n: " + width * height);
	}  
}

class Triangle extends Shape {
	double bottom = 0.0, height = 0.0;
	public Triangle (double bottom, double height){
		this.bottom = bottom;
		this.height = height;
	}
	public void print() {
		System.out.println("�T���έ��n: " + bottom * height / 2);
	} 

}