import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.example.demo.entity.Employee;

public class ObjectReadDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fo=new FileInputStream("c:/one/one.txt");
			ObjectInputStream oo=new ObjectInputStream(fo);
			Employee ee=(Employee)oo.readObject();
			System.out.println("Employee id is "+ee.getEmpId());
			System.out.println("Employee name is "+ee.getEmpName());
			System.out.println("Employee password is "+ee.getEmpPassword());
			oo.close();
			fo.close();
			System.out.println("object written");
			}
			catch(Exception ee) {
				ee.printStackTrace();
			}

	}

}
