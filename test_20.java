// 实验步骤： 
// 1.编写程序跟踪用户的鼠标，并时刻把鼠标的位置显示出来。
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


public class test_20{
    public static void main(String[] args){new AppFrame();}
}

class AppFrame extends JFrame{
    static class panel extends JPanel{
        public panel(){
            this.addMouseMotionListener(new mm());
        }
        public class mm extends MouseMotionAdapter{
            public void mouseMoved(MouseEvent a) {
                Graphics g=getGraphics();
                g.clearRect(0,0,600,500);
				int x=a.getX(),y=a.getY();
                g.drawString("("+x+","+y+")",x+10,y+10);
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