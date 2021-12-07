// 实验步骤： 
// 1.编写图形界面的Java程序响应鼠标单击和键盘事件，从鼠标单击的位置开始横向显示用户键入的字符，若鼠标双击则清空屏幕。
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


public class test_21{
    public static void main(String[] args){new AppFrame();}
}

class AppFrame extends JFrame{
    static class panel extends JPanel{
		static int mark=0;
		static Point p=new Point();
        public panel(){
            this.setFocusable(true);
            this.addMouseListener(new mm());
            this.addKeyListener(new kb());
        }
        public class mm extends MouseAdapter{
            public void mouseClicked(MouseEvent a) {
				p.x=a.getX();
				p.y=a.getY();
				mark=p.x;
				if(a.getClickCount()==2){
					Graphics g=getGraphics();
					g.clearRect(0,0,600,500);
				}
			}
		}
		public class kb extends KeyAdapter{
			public void keyPressed(KeyEvent a) {
				char c=a.getKeyChar();
				Graphics g=getGraphics();
				g.drawString(String.valueOf(c),p.x+mark-200,p.y+20);
				mark+=8;
			}
		}
	}
    JPanel panel1=new panel();
    public AppFrame(){
        this.add(panel1);
        panel1.setBounds(0,0,600,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(600,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}