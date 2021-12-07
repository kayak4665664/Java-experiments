// 实验步骤：
//    (1)编写接收用户输入的一个主机名，通过网络找的其IP地址打印到屏幕上。 
import java.io.*;
import java.util.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class test_29{
    public static void main(String[] args){
        InetAddress address=null;
        try {
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
            address = InetAddress.getByName(str);
        }catch(UnknownHostException e){System.exit(2);}
        System.out.println(address.getHostAddress());
    }
}
