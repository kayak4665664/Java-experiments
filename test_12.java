// 实验步骤：
// 1.编程接收用户输入的一个正浮点数，随机生成一个不大于该数的正整数，在屏幕打印输出。
// 2.使用数组实现一个10到20的平方表，打印输出这个平方表。
// 3.编程记录用户输入的一组正整数数据，-1表示输入结束，求这些数据的平均值，并统计大于平均值的数据个数。
import java.util.*;

public class test_12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个正浮点数：");
		float f=sc.nextFloat();
		int random=new Random().nextInt((int)f)+1;
		System.out.print(random+"\n\n");
		int[] square={100,121,144,169,196,225,256,289,324,361,400};
		System.out.print(Arrays.toString(square)+"\n\n");
		System.out.println("请输入正整数，输入‘-1’结束输入");
		int[] data=new int[100];
		int amt=0,sum=0;
		float ave;
		while(sc.hasNext()){
			int i=sc.nextInt();
			if(i==-1){
				ave=(float)sum/amt;
				System.out.println("平均值："+ave);
				int n=0;
				for(int j=0;j<amt;++j){
					if(data[j]>ave) ++n;
				}
				System.out.println("大于平均值的个数："+n);
				break;
			}
			sum+=i;
			data[amt++]=i;
		}
	}
}