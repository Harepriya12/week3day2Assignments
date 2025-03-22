package week3.day2;

public class JavaConnection extends MySqlConnection implements DatabaseConnection{

	

	public static void main(String[] args) {
		
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
	

	}

	public void connect() {
		System.out.println("Connected successfully");
		
	}

	public void disconnect() {
		System.out.println("Disconnected successfully");
		
	}

	public void executeUpdate() {
		System.out.println("Execute and updated successfully");
		
	}

	@Override
	public void executeQuery() {
		
		System.out.println("Execute the query successfully");
	}

}
