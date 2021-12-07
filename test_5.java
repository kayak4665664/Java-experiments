// 实验步骤：
// 1．	阅读下面的程序，在main()方法里添加语句完成如下的功能：
// （1）	创建一个MyValue类的对象myValue
// （2）	为myValue对象中的value域赋值10
// （3）	使用getValue()方法获得myValue对象中的数据并将它们打印在屏幕上
// class  MyValue
// {
//     private int value;
//     public void setValue(int x)
//     {
//         Value=x;
//     }
//     public int getValue()
//     {
//         Returen value;
//     }
// }
// public class UseValue
// {
//     public static void main(String args[])
//     {
//     }
// }
class MyValue{
	private int value;
	public void setValue(int x){value=x;}
	public int getValue(){return value;}
}

public class test_5{
	public static void main(String[] args){
		MyValue myValue=new MyValue();
		myValue.setValue(10);
		System.out.println(myValue.getValue());
	}
} 