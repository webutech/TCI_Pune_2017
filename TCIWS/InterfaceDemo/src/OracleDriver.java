
public class OracleDriver implements ConnectDB {

	@Override
	public void connect() {
		System.out.println("Oracle Connecting.....");

	}

	@Override
	public void use() {
		System.out.println("Oracle using.....");
	}

	@Override
	public void disConnect() {
		System.out.println("Oracle disConnecting.....");

	}


}
