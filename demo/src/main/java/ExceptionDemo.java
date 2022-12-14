import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionDemo {
	
	transient String s="Alex";

	public static void main(String[] args) {
		double i=5;
		double j=0;
		double c=i/j;
		
		System.out.println(c);
		try {
		Connection co=DriverManager.getConnection("");
		}
		catch(SQLException e) {
			
		}

	}

}
