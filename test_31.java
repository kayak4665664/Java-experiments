// 实验步骤：
//    (1)利用流式Socket通信机制模拟手机的短信息服务，编程时可以利用实验10中已经实现的手机界面。修改这个界面，增加一个“短信”按扭。设服务器中已事先保存了10条短信息，编号为0～9。当手机用户按“短信”按扭时，程序将是手机连接到服务器。服务器向手机用户提示，要求输入短信息的序号；手机用户按下0～9中的某个按扭后，服务器将相应的短信息传送给手机用户，在手机的显示区上显示。
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;


public class test_31{
    public static void main(String[] args) throws IOException{new AppFrame();}
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
    JButton[] b=new JButton[14];
    String[] str={"1","2","3","4","5","6","7","8","9","发送","0","清除","关机","短信"};
	public boolean mes=false;
    public AppFrame() throws IOException {
        setLayout(new GridLayout(6,3));
        for(int i=0;i<14;++i){
            b[i]=new JButton(str[i]);
        }
        getContentPane().add(l1);
        getContentPane().add(l2);
        getContentPane().add(l);
        for(int i=0;i<14;++i) getContentPane().add(b[i]);
        Phone p=new Phone();
        b[0].addActionListener(e->{
			if(mes==true){
				try{
					Socket s1=new Socket("127.0.0.1", 8888);
					InputStream is=s1.getInputStream();
					DataInputStream dis=new DataInputStream(is);
					l.setText(dis.readUTF());
					dis.close();
					s1.close();
				}catch(IOException a){}
			}else{
				p.number(1);
				l.setText(p.get());
			}
        });
        b[1].addActionListener(e->{
			if(mes==true){
				try{
					Socket s1=new Socket("127.0.0.1", 8888);
					InputStream is=s1.getInputStream();
					DataInputStream dis=new DataInputStream(is);
					l.setText(dis.readUTF());
					dis.close();
					s1.close();
				}catch(IOException a){}
			}else{
				p.number(2);
				l.setText(p.get());
			}
        });
        b[2].addActionListener(e->{
			if(mes==true){
				try{
					Socket s1=new Socket("127.0.0.1", 8888);
					InputStream is=s1.getInputStream();
					DataInputStream dis=new DataInputStream(is);
					l.setText(dis.readUTF());
					dis.close();
					s1.close();
				}catch(IOException a){}
			}else{
				p.number(3);
				l.setText(p.get());
			}
        });
        b[3].addActionListener(e->{
			if(mes==true){
				try{
					Socket s1=new Socket("127.0.0.1", 8888);
					InputStream is=s1.getInputStream();
					DataInputStream dis=new DataInputStream(is);
					l.setText(dis.readUTF());
					dis.close();
					s1.close();
				}catch(IOException a){}
			}else{
				p.number(4);
				l.setText(p.get());
			}
        });
        b[4].addActionListener(e->{
			if(mes==true){
				try{
					Socket s1=new Socket("127.0.0.1", 8888);
					InputStream is=s1.getInputStream();
					DataInputStream dis=new DataInputStream(is);
					l.setText(dis.readUTF());
					dis.close();
					s1.close();
				}catch(IOException a){}
			}else{
				p.number(5);
				l.setText(p.get());
			}
        });
        b[5].addActionListener(e->{
			if(mes==true){
				try{
					Socket s1=new Socket("127.0.0.1", 8888);
					InputStream is=s1.getInputStream();
					DataInputStream dis=new DataInputStream(is);
					l.setText(dis.readUTF());
					dis.close();
					s1.close();
				}catch(IOException a){}
			}else{
				p.number(6);
				l.setText(p.get());
			}
        });
        b[6].addActionListener(e->{
			if(mes==true){
				try{
					Socket s1=new Socket("127.0.0.1", 8888);
					InputStream is=s1.getInputStream();
					DataInputStream dis=new DataInputStream(is);
					l.setText(dis.readUTF());
					dis.close();
					s1.close();
				}catch(IOException a){}
			}else{
				p.number(7);
				l.setText(p.get());
			}
        });
        b[7].addActionListener(e->{
			if(mes==true){
				try{
					Socket s1=new Socket("127.0.0.1", 8888);
					InputStream is=s1.getInputStream();
					DataInputStream dis=new DataInputStream(is);
					l.setText(dis.readUTF());
					dis.close();
					s1.close();
				}catch(IOException a){}
			}else{
				p.number(8);
				l.setText(p.get());
			}
        });
        b[8].addActionListener(e->{
			if(mes==true){
				try{
					Socket s1=new Socket("127.0.0.1", 8888);
					InputStream is=s1.getInputStream();
					DataInputStream dis=new DataInputStream(is);
					l.setText(dis.readUTF());
					dis.close();
					s1.close();
				}catch(IOException a){}
			}else{
				p.number(9);
				l.setText(p.get());
			}
        });
        b[10].addActionListener(e->{
			if(mes==true){
				try{
					Socket s1=new Socket("127.0.0.1", 8888);
					InputStream is=s1.getInputStream();
					DataInputStream dis=new DataInputStream(is);
					l.setText(dis.readUTF());
					dis.close();
					s1.close();
				}catch(IOException a){}
			}else{
				p.number(0);
				l.setText(p.get());
			}
        });
        b[9].addActionListener(e->{
			if(mes==true);
            else{
				p.send();
				l.setText(p.get());
			}
        });
        b[11].addActionListener(e->{
            p.clean();
            l.setText(p.get());
        });
        b[12].addActionListener(e->{System.exit(0);});
        b[13].addActionListener(e->{
			mes=!mes;
			if(mes==true){
				try{
					Socket s1=new Socket("127.0.0.1", 8888);
					InputStream is=s1.getInputStream();
					DataInputStream dis=new DataInputStream(is);
					l.setText(dis.readUTF());
					dis.close();
					s1.close();
				}catch(IOException a){}
			}
        });
        setSize(600,600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}