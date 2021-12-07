// 实验步骤：
// (1)使用JApplet实现某一门课程的分数录入系统，界面包括学号、姓名、班级、班号、成绩的输入域和一个录入按扭。当用户单击录入按扭时，程序检查各输入域中是否有非空的数据，若有空域则抛出一个Exception对象；同时程序检查成绩输入域，如果不是数值信息，或是负的数值信息，也抛出相应的异常。在抛出异常之前应提供详细的信息说明，从而使使用该程序的用户了解所出现的问题，同时考虑上述异常出现时程序应该如何处理。 
// (2)在上题的基础上，编写一个Thread类的子类，在该类内部保存若干条喜欢的习语、警句。它的功能是：每隔固定的时间，例如3秒钟，就随机选择一条格言显示在JApplet录入界面的状态条里。运行程序并观察执行结果。
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class test_24 extends JApplet implements ActionListener{
    public static void main( String args[] ){
        JFrame frame = new JFrame();
        applet_java app = new applet_java();
        app.init();
        frame.getContentPane().add( app );
        frame.setSize( 400,100 );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    private JLabel l1=new JLabel("number"),l2=new JLabel("name"),l3=new JLabel("class"),l4=new JLabel("classnum"),l5=new JLabel("score");
    private JTextField[] t=new JTextField[5];
    private JButton btn=new JButton("input");
    public void init() {
        setLayout(new GridLayout(6,2));
		for(int i=0;i<5;++i) t[i]=new JTextField("");
        add(l1);add(t[0]);add(l2);add(t[1]);add(l3);add(t[2]);add(l4);add(t[3]);add(l5);add(t[4]);
        add(btn);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        try{
            for(int i=0;i<5;++i){
                if(t[i].getText().length()==0) throw new NullPointerException();
            }
            if(Integer.parseInt(t[4].getText())<0) throw new IllegalArgumentException();
            for(int i=0;i<t[4].getText().length();++i){
                if((int)t[4].getText().charAt(i)<49||(int)t[4].getText().charAt(i)>57) throw new NumberFormatException();
            }
        }catch(NullPointerException ex){JOptionPane.showMessageDialog(null,"empty"); }
        catch(NumberFormatException ex){JOptionPane.showMessageDialog(null,"not a num"); }
        catch(IllegalArgumentException ex){JOptionPane.showMessageDialog(null,"score<0");}
    }
}