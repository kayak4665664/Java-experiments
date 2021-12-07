// 实验步骤：
// 1.编程实现矩形类，其中包括计算矩形周长和面积的方法。
// 2．使用矩形类，编程统计若干块土地的相关信息，由用户输入每块土地的长与宽，程序将计算其面积并显示出来。
import java.util.Scanner;

class Rectangle{
	private int a,b;
	Rectangle(int a,int b){
		this.a=a;
		this.b=b;
	}
	public int C(){return 2*(a+b);}
	public int V(){return a*b;}
}

public class test_7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入长和宽：");
		int a=sc.nextInt(),b=sc.nextInt();
		Rectangle R=new Rectangle(a,b);
		System.out.println(R.V());
	}
}