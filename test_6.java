// 实验步骤：
// 1.编写Java代码实现一个计数器类Counter, 其中包含：
//   域counterValue 用来保存计数器的当前数值
//   方法increment(), 计数器加一
//   方法decrement(), 计数器减一
//   方法reset(), 计数器清零
class Counter{
	private int counterValue;
	Counter(){counterValue=0;}
	public void increment(){++counterValue;}
	public void decrement(){--counterValue;}
	public void reset(){counterValue=0;}
	public int get(){return counterValue;}
}