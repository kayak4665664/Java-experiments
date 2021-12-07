// 实验步骤： 
// 1.在图形界面中绘制二维的坐标系统，其中x轴位于绘图区正中，y轴位于绘图区的最左边。
// 2.根据下面试验数据，在1）题的坐标系统中绘制数据点，每个数据点用一个小叉号表示，并在叉号边以（x，y）的格式标示出数据点的坐标数值，最后用折线连接相邻的数据点。
// 数据点序号            x坐标              y坐标
// 4	               0                  20
// 5	               50                 -30
// 3                   100                16
// 6	               150                126
// 5	               200                164
// 3.在2）题的基础上设计界面接收用户输入的实验数据，绘制数据点和实验曲线。
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


public class test_19{
    public static void main(String[] args){new AppFrame();}
}

class AppFrame extends JFrame{
	static class panel extends JPanel{
		static JLabel x=new JLabel("x:"),y=new JLabel("y:");
		static JTextField x_t=new JTextField(),y_t=new JTextField();
		static JButton btn=new JButton("draw");
		static Vector points=new Vector();
		static int cnt=0;
		public panel(){
			this.setLayout(null);
			x.setBounds(40,480,20,20);
			x_t.setBounds(60,480,80,20);
			y.setBounds(160,480,20,20);
			y_t.setBounds(180,480,80,20);
			btn.setBounds(300,480,80,20);
			this.add(x);this.add(y);this.add(x_t);
			this.add(y_t);this.add(btn);
			btn.addActionListener(e->{
				Point p=new Point();
				p.x=Integer.parseInt(x_t.getText());
				p.y=Integer.parseInt(y_t.getText());
				points.add(p);
				repaint();
			});
		}
		public void drawPoint(Graphics g){
			Point p=(Point)points.get(cnt);
			g.drawLine(p.x-7,p.y-7,p.x+7,p.y+7);
			g.drawLine(p.x+7,p.y-7,p.x-7,p.y+7);
			g.drawString("("+p.x+","+p.y+")",p.x+9,p.y+7);
			++cnt;
			if(cnt>=2){
				Point p1=(Point)points.get(cnt-2);
				g.drawLine(p1.x,p1.y,p.x,p.y);
			}
		}
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			g.translate(0,240);
			drawPoint(g); 
		} 
	}
    JPanel panel1=new panel();
    public AppFrame(){
		this.add(panel1);
		panel1.setBounds(0,0,640,550);
        this.setLayout(null);
		this.setVisible(true);
		this.setSize(640,550);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}