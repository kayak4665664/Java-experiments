// 实验步骤：
//    (1)编写Applet接收用户输入一个网页名，通过阅读该网页并寻找网页中所以的电子邮件地址，返回给用户，并显示在屏幕上。 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test_30 extends JApplet{
    public static void main(String args[] ){
        JFrame frame = new JFrame();
        applet_java app = new applet_java();
        app.init();
        frame.getContentPane().add( app );
        frame.setSize( 400,100 );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    JTextField in=new JTextField(20);
    JButton btn=new JButton("search");
    String str;
    public void init(){
        setLayout(new FlowLayout());
        add(in);
        add(btn);
        btn.addActionListener(e->{
            str=in.getText();
            try {
                Search(str);
            }catch(IOException ioException) {
                ioException.printStackTrace();
            }
        });
    }
    public static void Search(String str) throws IOException{
        URL url =new URL(str);
        BufferedReader buf=new BufferedReader(new InputStreamReader(url.openStream()));
        String main_regex="\\w+@\\w+(\\.\\w+)+";
        Pattern p=Pattern.compile(main_regex);
        String line=null;
        while((line=buf.readLine())!=null){
            Matcher m=p.matcher(line);
            while(m.find()){System.out.println(m.group());}
        }
    }
}
