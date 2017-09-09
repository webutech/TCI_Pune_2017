
public class TestConnectDB {

	public static void main(String[] args) {
		ConnectDB con=new OracleDriver();
		con.connect();
		con.use();
		con.disConnect();
		con.showConnectionProperty();

	}

}
