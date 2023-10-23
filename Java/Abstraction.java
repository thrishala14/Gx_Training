package CoreJava;

abstract class Connection {

	private String name;
	
	public void dbName(String name) {
		this.name = name;
		System.out.println(name);
	}
	
	
	public abstract void createConnection();
	
}

class OracleConnection extends Connection{

	@Override
	public void createConnection() {
		// TODO Auto-generated method stub
		System.out.println("connecting to oracle");
		
	}
	
	
}
class PostGres extends Connection{

	@Override
	public void createConnection() {
		// TODO Auto-generated method stub
		System.out.println("connecting to PostGres");
		System.out.println();
	}

	
}
public class Abstraction{
	public static void main(String[] args) {
		Connection c = new PostGres();
		c.createConnection();
	}
}