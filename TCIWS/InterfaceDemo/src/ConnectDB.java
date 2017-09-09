
public interface ConnectDB {
	
	public void connect();
	public void use();
	public void disConnect();
	
	default public void showConnectionProperty(){
		System.out.println("connection property");
	}

}
