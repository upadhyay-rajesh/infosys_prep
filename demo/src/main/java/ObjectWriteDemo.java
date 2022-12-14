import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.example.demo.entity.Employee;

public class ObjectWriteDemo {
	

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpId("a001");
		e.setEmpName("Kevin");
		e.setEmpPassword("abcd");
		try {
		FileOutputStream fo=new FileOutputStream("c:/one/one.txt");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		oo.writeObject(e);
		oo.close();
		fo.close();
		System.out.println("object written");
		}
		catch(Exception ee) {
			ee.printStackTrace();
		}
		

	}

}
