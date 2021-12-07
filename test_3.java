// 实验步骤：
// 1．	编写字符界面的java application，将用户输入的小写字符转化成大写字符打印在屏幕上(每次输入一个字符,不要输入一行字符)，若用户输入的不是小写字符则打印信息说明无法完成的操作,输入@程序终止。
import java.util.Scanner;

public class test_3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			char c=sc.next().charAt(0);
			if(c=='@') break;
			else if(Character.isLowerCase(c)){
				System.out.printf("%c\n",Character.toUpperCase(c));
			}
			else System.out.printf("无法完成的操作\n");
		}
	}
}