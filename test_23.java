// 实验步骤：
// (1)使用Swing图形用户界面实现计数器。界面包括计算器数值的显示区，计算器加一按扭、计数器减一按扭、计数器清零按扭。运行程序并观察执行结果。 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class test_23{
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