// 实验步骤：
// (1)选择一个比较了解Java系统异常，例如ArrayIndexOutofBoundsException，编程创建并抛出这个异常类的事例。运行该程序并观察执行结果。  
// (2)修改上题的程序增加异常处理语句，再次运行程序并观察执行结果。 
import java.io.*;

public class test_22{
	public static void main(String[] args){
		int[] tmp={0,1,2,3,4,5};
		for(int i=0;i<7;++i)  {
			try{
				System.out.println(tmp[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("error!");
			}
		}
	}
}