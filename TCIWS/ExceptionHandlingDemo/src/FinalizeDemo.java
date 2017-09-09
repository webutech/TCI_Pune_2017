
public class FinalizeDemo {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize called");
	}
	public static void main(String[] args) {
		FinalizeDemo f1=new FinalizeDemo();
		f1=null;
		System.gc();

	}

}
