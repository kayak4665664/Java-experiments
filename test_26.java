// 实验步骤：
//    (1)编写图形界面接受用户输入的10个整数并一二进制方式保存在指定的文件中。用DOS的type命令打开这个文件观察，是否能看到所输入的数字？为什么？编程打开文件，以二进值读取数据并显示在屏幕上，它们是否与输入的数字相符？为什么？ 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class test_26{
    public static void main(String[] args){new AppFrame();}
}

class AppFrame extends JFrame{
    JTextField t=new JTextField();
    public AppFrame(){
        this.add(t);
		this.setSize(400,100);
        t.setBounds(30,30,300,20);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		t.addActionListener(e->{
			int cnt=0;
            for(int i=0;i<t.getText().length();++i){
				if(t.getText().charAt(i)==' ') ++cnt;
			}
            if(cnt!=9) JOptionPane.showMessageDialog(null,"10 number");
            try{
                FileOutputStream fo=new FileOutputStream("C:\\Users\\kayak4665664\\Desktop\\4444.txt");
				for(int i=0;i<t.getText().length();++i) fo.write(t.getText().charAt(i));
                fo.close();
                FileInputStream fi=new FileInputStream("C:\\Users\\kayak4665664\\Desktop\\4444.txt");
                int b;
                while(fi.available()>0){
                    b=fi.read();
                    System.out.print(b);
                }
                fi.close();
            }catch(FileNotFoundException a) {
                JOptionPane.showMessageDialog(null,"no file");
            }catch(IOException e1) {
                e1.printStackTrace();
            }
		});
    }
}