import java.utils.*;
public class Hello{
	public static void main(String[] args){
		System.out.println("Hello World!");
		
		Systeml.out.println("今天我想休息，但是不行，压力山大");
		// .....................
		
		System.out.println("活着的时候，就需要有压力，要不活着跟死人有什么区别呢？");
		
		System.out.println("正在努力拼命中，升级版本有压力……");
		
		System.out.println("还没有找到女朋友，心好累！");
		
		//打印随机数
		random();
	}
	
	public static void random(){
		Random random = new Random();
		System.out.println("random number is :" + random.nextInt());
	}
}
