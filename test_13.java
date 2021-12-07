// 实验步骤：
// 1.编写图形界面的程序，接收用户输入的一个字符串和一个字符，将字符串中的所有该字符删除，打印输出新生成的结果字符串。
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class test_13{
	public static void main(String[] args){new AppFrame();}
}

class AppFrame extends JFrame{
	JLabel l1=new JLabel("输入一个字符串："),l2=new JLabel("输入一个字符："),l3=new JLabel("");
	JTextField i1=new JTextField(20),i2=new JTextField(2);
	JButton b=new JButton("打印字符串");
	public AppFrame(){
		setLayout(new FlowLayout());
		getContentPane().add(l1);
		getContentPane().add(i1);
		getContentPane().add(l2);
		getContentPane().add(i2);
		getContentPane().add(b);
		getContentPane().add(l3);
		b.addActionListener(e->{
			String ans="",s=i1.getText();
			char[] str=s.toCharArray();
			char c=i2.getText().charAt(0);
			for(int i=0;i<s.length();++i){
				if(str[i]!=c) ans+=str[i];
			}
			l3.setText(ans);
		});
		setSize(400,100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}