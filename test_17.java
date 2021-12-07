// 实验步骤：
// 1.编程实现一个学生信息管理系统的图形界面。需要录入的信息包括学生学号、姓名、性别、出生年、月、日、年级以及是否联合培养。根据这些信息的性质选择使用不同的图形组件来设计界面。
// 2.为1所编写的图形界面增加事件响应功能。当用户选定了一个出生月份，例如3月份时，系统自动把日期的选择范围限制在1~31之间，当用户单击“录入”按钮“时，系统把所有的学生信息打印在屏幕上。
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


public class test_17{
    public static void main(String[] args){new AppFrame();}
}

class AppFrame extends JFrame{
    JLabel num=new JLabel("number:"),name=new JLabel("name:"),sex=new JLabel("sex:"),year=new JLabel("year:"),month=new JLabel("month:"),day=new JLabel("day:"),grade=new JLabel("grade:"),train=new JLabel("train:");
    JTextField num_t=new JTextField(),name_t=new JTextField();
    JComboBox sex_b,year_b,month_b,day_b,grade_b,train_b;
    JButton btn=new JButton("input");
    public AppFrame(){
        num.setBounds(30,30,100,20);
        num_t.setBounds(30,70,100,20);
        name.setBounds(30,110,100,20);
        name_t.setBounds(30,150,100, 20);
        sex.setBounds(30,190,100,20);
        String[] sexs={"Male","Female"};
        sex_b=new JComboBox(sexs);
        sex_b.setBounds(30,230,100,20);
        year.setBounds(30,270,100,20);
        Integer[] years={1997,1998,1999,2000,2001,2002};
        year_b=new JComboBox(years);
        year_b.setBounds(30,310,100,20);
        month.setBounds(30,350,100,20);
        Integer[] months={1,2,3,4,5,6,7,8,9,10,11,12};
        month_b=new JComboBox(months);
        month_b.setBounds(30,390,100,20);
        day.setBounds(30,430,100,20);
        Calendar calendar=Calendar.getInstance();
        int y=((Integer)year_b.getSelectedItem()).intValue();
        int m=((Integer)month_b.getSelectedItem()).intValue();
        calendar.set(Calendar.YEAR,y);
        calendar.set(Calendar.MONTH,m-1);
        Vector days=new Vector();
        for(int i=0;i<calendar.getActualMaximum(Calendar.DAY_OF_MONTH);++i) days.add(i+1);
        day_b=new JComboBox(days);
        day_b.setBounds(30,470,100,20);
        grade.setBounds(30,510,100,20);
        String[] grades={"1","2","3","4","5"};
        grade_b=new JComboBox(grades);
        grade_b.setBounds(30,550,100,20);
        train.setBounds(30,590,100,20);
        String[] trains={"1","0"};
        train_b=new JComboBox(trains);
        train_b.setBounds(30,630,100,20);
        btn.setBounds(30,670,100,20);
        btn.setMargin(new Insets(0,0,0,0));
        this.add(num);this.add(num_t);this.add(name);
        this.add(name_t);this.add(sex);this.add(sex_b);
        this.add(year);this.add(year_b);this.add(month);
        this.add(month_b);this.add(day);this.add(day_b);
        this.add(grade);this.add(grade_b);this.add(train);
        this.add(train_b);this.add(btn);this.setLayout(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
		year_b.addItemListener(e->{
			if(e.getStateChange()==ItemEvent.SELECTED){
				days.removeAllElements();
				day_b.removeItem(days);
				Calendar calendar1=Calendar.getInstance();
				int yy=((Integer)year_b.getSelectedItem()).intValue();
				int mm=((Integer)month_b.getSelectedItem()).intValue();
				calendar1.set(Calendar.YEAR,yy);
				calendar1.set(Calendar.MONTH,mm-1);
				for(int i=0;i<calendar1.getActualMaximum(Calendar.DAY_OF_MONTH);++i) days.add(i+1);
				day_b.addItem(days);   
				day_b.removeItemAt(calendar1.getActualMaximum(Calendar.DAY_OF_MONTH));
				day_b.setSelectedIndex(0);
			}
		});
		month_b.addItemListener(e->{
			if(e.getStateChange()==ItemEvent.SELECTED){
				days.removeAllElements();
				day_b.removeItem(days);
				Calendar calendar1=Calendar.getInstance();
				int yy=((Integer)year_b.getSelectedItem()).intValue();
				int mm=((Integer)month_b.getSelectedItem()).intValue();
				calendar1.set(Calendar.YEAR,yy);
				calendar1.set(Calendar.MONTH,mm-1);
				for(int i=0;i<calendar1.getActualMaximum(Calendar.DAY_OF_MONTH);++i) days.add(i+1);
				day_b.addItem(days);   
				day_b.removeItemAt(calendar1.getActualMaximum(Calendar.DAY_OF_MONTH));
				day_b.setSelectedIndex(0);
			}
		});
        btn.addActionListener(e->{
            JLabel Num=new JLabel();
            JLabel Name=new JLabel();
            JLabel Sex=new JLabel();
            JLabel Date=new JLabel();
            JLabel Grade=new JLabel();
            JLabel Train=new JLabel();
            JFrame show=new JFrame();
            num.setBounds(30,30,100,20);
            Num.setText(num_t.getText());
            Num.setBounds(30,70,100,20);
            name.setBounds(30,110,100,20);
            Name.setText(name_t.getText());
            Name.setBounds(30,150,80,20);
            sex.setBounds(30,190,100,20);
            Sex.setText((String)sex_b.getSelectedItem());
            Sex.setBounds(30,230,100,20);
            String str_date = String.valueOf(year_b.getSelectedItem()) + "." + String.valueOf(month_b.getSelectedItem()) + "." + String.valueOf(day_b.getSelectedItem());
            Date.setText("date:"+str_date);
            Date.setBounds(30,270,100,20);
            grade.setBounds(30,310,100,20);
            Grade.setText((String)grade_b.getSelectedItem());
            Grade.setBounds(30,350,100,20);
            train.setBounds(30,390,100,20);
            Train.setText((String)train_b.getSelectedItem());
            Train.setBounds(30,430,100,20);
            show.add(num);show.add(Num);show.add(name);
            show.add(Name);show.add(sex);show.add(Sex);
            show.add(Date);show.add(grade);show.add(Grade);
            show.add(train);show.add(Train);
            show.setLayout(null);
            show.setVisible(true);
        });
    }
}
