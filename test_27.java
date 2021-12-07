// 实验步骤：
//    (1)编程接受两个命令行参数，第一个是一个文件名，第二个是一个字符串。程序的功能是把第二个命令行参数以文本方式保存到第一个文件中。运行该程序，再使用DOS的type命令打开文件，观察文件所写人的信息是否与命令行的参数相符，解释这个结果。 
import java.io.*;

public class test_27{
	public static void main(String[] args){
		try{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			String n1=in.readLine();
			File f1=new File(n1);
			String str=in.readLine();
			BufferedWriter fo=new BufferedWriter(new FileWriter(f1));
			fo.write(str);
			fo.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}