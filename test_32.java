// 实验步骤：
//    (1)利用流式Socket通信机制模拟手机的短信息服务，编程时可以利用实验10中已经实现的手机界面。修改这个界面，增加一个“短信”按扭。设服务器中已事先保存了10条短信息，编号为0～9。当手机用户按“短信”按扭时，程序将是手机连接到服务器。服务器向手机用户提示，要求输入短信息的序号；手机用户按下0～9中的某个按扭后，服务器将相应的短信息传送给手机用户，在手机的显示区上显示。
import java.net.*;
import java.io.*;

public class test_32{
	public static void main(String args[]) {
		ServerSocket s = null;
		try {
			s = new ServerSocket(8888);
		} catch (IOException e) {}
		while (true) {
			try {
				Socket s1 = s.accept();
				OutputStream os = s1.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				dos.writeUTF("New Message!");
				dos.close();
				s1.close();
			} catch (IOException e) {}
		}
	}
}
