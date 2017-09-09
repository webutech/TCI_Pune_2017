class MythreadTest implements Runnable{

	@Override
	public void run() {
		String threadName=Thread.currentThread().getName();
		for(int i=1;i<=10;i++){
			System.out.println(threadName+" : i : "+i);
		}
		
	}
	
}
public class RunnableDemo {

	public static void main(String[] args) {
		MythreadTest target=new MythreadTest();
		Thread t1=new Thread(target);
		Thread t2=new Thread(target);
		t1.setName("Muskan");
		t2.setName("Shashi");
		t1.start();
		t2.start();

	}

}
