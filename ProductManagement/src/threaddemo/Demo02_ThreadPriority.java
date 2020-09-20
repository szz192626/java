package threaddemo;

import java.util.Random;

class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random random=new Random();
		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()+"生成的第"+i+"个随机数："+random.nextDouble());
		}
	}
}


public class Demo02_ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myth=new MyThread();
		myth.setName("我的线程1");
		//设置优先级
		myth.setPriority(10);
		myth.start();
		
		MyThread myth2=new MyThread();
		myth2.setName("我的线程2");
		myth2.setPriority(1);
        myth2.start();
        
        
		
	}

}
