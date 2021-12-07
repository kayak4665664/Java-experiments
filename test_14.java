// 实验步骤：
// 1.编写Java Application，将用户输入的命令行参数一个一行打印出来。
import java.io.*;

public class test_14{
	public static void main(String[] args) throws IOException{
		String st;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		st=br.readLine();
		System.out.println(st);
	}
}