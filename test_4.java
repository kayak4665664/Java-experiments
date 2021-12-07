// 实验步骤：
// 1．	编写一个Applet程序，从键盘输入一个整数，求出其阶乘值
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class test_4 extends JApplet{
	JTextField in=new JTextField(5);
	JButton btn=new JButton("阶乘");
	JLabel out=new JLabel();
	public void init(){
		setLayout(new FlowLayout());
		add(in);
		add(btn);
		add(out);
		btn.addActionListener(e->{
			String s=in.getText();
			int n=Integer.parseInt(s),sum=1;
			for(int i=1;i<=n;++i) sum*=i;
			out.setText(n+"的阶乘是："+sum);
		});
	}
}