// 实验步骤：
// 1.为第2次实验中编写的计数器类Counter编写图形界面，其中包括三个按钮、一个标签。按钮分别是计数器加一、计数器减一和计数器清零，标签显示当前的计数器数值。
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class test_15{
	public static void main(String[] args){new AppFrame();}
}

class Counter{
	private int counterValue;
Counter(){counterValue=0;}
	public void increment(){++counterValue;}
	public void decrement(){--counterValue;}
	public void reset(){counterValue=0;}
	public int get(){return counterValue;}
}

class AppFrame extends JFrame{
	JLabel l=new JLabel("计数器：0");
	JButton b=new JButton("加一"),b1=new JButton("减一"),b2=new JButton("清零");
	public AppFrame(){
		setLayout(new FlowLayout());
		getContentPane().add(l);
		getContentPane().add(b);
		getContentPane().add(b1);
		getContentPane().add(b2);
		Counter c=new Counter();
		b.addActionListener(e->{
			c.increment();
			l.setText("计数器："+c.get());
		});
		b1.addActionListener(e->{
			c.decrement();
			l.setText("计数器："+c.get());
		});
		b2.addActionListener(e->{
			c.reset();
			l.setText("计数器："+c.get());
		});
		setSize(400,100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}