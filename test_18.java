// 实验步骤：
// 1.编写一个图形界面的Java Application¸为用户提供三种关闭窗口的方法：使用按钮，适用菜单项，使用窗口关闭图标。
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


public class test_18{
    public static void main(String[] args){new AppFrame();}
}

class AppFrame extends JFrame{
    JMenuBar bar=new JMenuBar();
    JMenu menu=new JMenu("menu");
    JMenuItem item=new JMenuItem("exit");
    JButton btn=new JButton("exit");
    public AppFrame(){
		item.addActionListener(e->{
			System.exit(0);
		});
		menu.add(item);
		bar.add(menu);
		this.setJMenuBar(bar);
		btn.setBounds(40, 40, 100, 20);
		btn.addActionListener(e->{
			System.exit(0);
		});
		this.add(btn);
        this.setLayout(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
	}
}