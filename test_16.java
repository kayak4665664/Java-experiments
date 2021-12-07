// 实验步骤：
// 1.编程实现一个模拟手机的图形用户界面，包括一个显示区和一个键盘区，显示区用来显示数字和信息，键盘区包括0~9 10个数字键和“发送”“清除”“关机”三个命令键。考虑应该使用什么样的图形用户界面布局策略。
// 2.为上题所编写的界面增加事件响应功能：当用户按数字键时，相应的数字回显在显示区上，当用户按清除键时，显示区的数字清空，当用户按发送键时，显示区出现当前的号码和“拨号中。。。。。”的信息，当用户按关机键时结束程序。
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class test_16{
	public static void main(String[] args){new AppFrame();}
}

class Phone{
	private String num;
	Phone(){num="";}
	public void number(int n){num+=n;};
	public void send(){num+="拨号中...";}
	public void clean(){num="";}
	public String get(){return num;}
}

class AppFrame extends JFrame{
	JLabel l=new JLabel(""),l1=new JLabel(""),l2=new JLabel("");
	JButton[] b=new JButton[13];
	String[] str={"1","2","3","4","5","6","7","8","9","发送","0","清除","关机"};
	public AppFrame(){
		setLayout(new GridLayout(6,3));
		for(int i=0;i<13;++i){
			b[i]=new JButton(str[i]);
		}
		getContentPane().add(l1);
		getContentPane().add(l2);
		getContentPane().add(l);
		for(int i=0;i<13;++i) getContentPane().add(b[i]);
		Phone p=new Phone();
		b[0].addActionListener(e->{
			p.number(1);
			l.setText(p.get());
		});
		b[1].addActionListener(e->{
			p.number(2);
			l.setText(p.get());
		});
		b[2].addActionListener(e->{
			p.number(3);
			l.setText(p.get());
		});
		b[3].addActionListener(e->{
			p.number(4);
			l.setText(p.get());
		});
		b[4].addActionListener(e->{
			p.number(5);
			l.setText(p.get());
		});
		b[5].addActionListener(e->{
			p.number(6);
			l.setText(p.get());
		});
		b[6].addActionListener(e->{
			p.number(7);
			l.setText(p.get());
		});
		b[7].addActionListener(e->{
			p.number(8);
			l.setText(p.get());
		});
		b[8].addActionListener(e->{
			p.number(9);
			l.setText(p.get());
		});
		b[10].addActionListener(e->{
			p.number(0);
			l.setText(p.get());
		});
		b[9].addActionListener(e->{
			p.send();
			l.setText(p.get());
		});
		b[11].addActionListener(e->{
			p.clean();
			l.setText(p.get());
		});
		b[12].addActionListener(e->{System.exit(0);});
		setSize(600,600);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
