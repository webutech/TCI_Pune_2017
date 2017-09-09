class MyThread extends Thread{
	@Override
	public void run() {
		String threadName=Thread.currentThread().getName();
		for(int i=1;i<=10;i++){
			System.out.println(threadName+" : i : "+i);
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.setName("Muskan");
		t2.setName("Shashi");
		t1.start();
		t2.start();

	}

}
