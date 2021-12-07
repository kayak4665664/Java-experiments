// 实验步骤：
//    (1)编程接受用户输入的一个文件名（可以包括路径名），检查这个文件是否存在、是否可读、是否可写，并将结果在屏幕上输出。 
import java.io.*;

public class test_25{
	public static void main(String[] args){
		try{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			String n1=in.readLine();
			File f1=new File(n1);
			if(f1.exists()){
				System.out.println("exist");    
				if(f1.canRead()){
					System.out.println("read");
					if(f1.canWrite()) System.out.println("write");
					else System.out.println("no write");
				}else System.out.println("no read");
			}else System.out.println("no exist");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}