// 实验步骤：
//    (1)编写将两个文件（文件1、文件2）中的内容合并成一个新文件（文件3）。合并方法是：从文件一读取一个字节放入文件3，在从文件2读取一个字节放入文件3，如此轮流直至某一个文件读完，再将较长文件中的剩余部分读取放入至文件3。可以使用图形界面或命令行参数输入三个文件名。
import java.io.*;

public class test_28{
    public static void main(String[] args){
        try{
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            String n1=in.readLine();
            String n2=in.readLine();
            String n3=in.readLine();
            FileWriter fo1=new FileWriter(n1);
            BufferedReader fi2=new BufferedReader(new FileReader(n2));
            BufferedReader fi3=new BufferedReader(new FileReader(n3));
            String str2,str3;
            while(true){
				str2=fi2.readLine();
				str3=fi3.readLine();
				if(str2==null&&str3==null) break;
                if(str2!=null){
					System.out.println(str2);
					fo1.write(str2);
				}
                if(str3!=null){
					System.out.println(str3);
					fo1.write(str3);
				}
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}