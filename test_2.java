// 实验步骤：
// 1. 下载安装JDK
// 2. 用记事本编写程序,求1+2*2+3*3 +...+n*n的值。n的值从键盘输入，参考教材例2-8.
// 3. 下载安装Eclispe，用Eclipse完成2.
import java.util.Scanner;

public class test_2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),sum=1;
		for(int i=2;i<=n;++i) sum+=i*i;
		System.out.printf("%d\n",sum);
	}
}