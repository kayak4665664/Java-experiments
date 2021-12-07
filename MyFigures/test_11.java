// 实验步骤：
// 1）	为上一实验中的矩形类派生一个子类：正方形类。若正方形类的操作同样是求周长和面积，则这个字类除了从父类继承来的方法之外，还需要定义哪些方法。列出正方形类的所有域和方法。编程检查、运行所编写的正方形类。
// 2）	定义接口Printable, 其中包括一个方法printItMyWay(),这个方法没有形参，返回值为空。
// 3）	改写矩形类，使之实现Printable接口，用printItMyWay()方法将矩形的相关信息（长，宽，周长，面积）打印在屏幕上。
// 4）	改写正方形类，重载printItMyWay()方法，将正方形的边长、周长，面积打印在屏幕上。
// 5）	在Printable接口中增加一个新的printItMyWay(char)方法，这个方法有一个字符类型的形参，返回值为空。其功能是利用给出的字符打印，例如若给定的字符为#，一个长为5，宽为3的矩形的屏幕打印结果为：
// #####
// #####
// #####
// 在矩形类和正方形类中实现该方法.
// 6）将矩形和正方形组成一个包MyFigures.
import java.util.Scanner;
import MyFigures.*;

public class test_11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入边长：");
		int a=sc.nextInt(),b;
		Square S=new Square(a);
		S.printItMyWay();
		S.printItMyWay('#');
		System.out.println("请输入长和宽：");
		a=sc.nextInt();
		b=sc.nextInt();
		Rectangle R=new Rectangle(a,b);
		R.printItMyWay();
		R.printItMyWay('#');
	}
}