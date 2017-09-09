
public class MySQLDriver implements ConnectDB {

	@Override
	public void connect() {
		System.out.println("MySQL Connecting.....");

	}

	@Override
	public void use() {
		System.out.println("MySQL using.....");
	}

	@Override
	public void disConnect() {
		System.out.println("MySQL disConnecting.....");

	}

}
