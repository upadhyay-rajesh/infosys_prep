import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parent{
	 protected void addition(float i,float j)throws IOException{
		
		 try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
			
			 String str=br.readLine();
		 }
		 catch(IOException e) {
			 e.printStackTrace();
		 }
		 
		 
	 }
	}

class Child extends Parent{
		public void addition(float i,float j)throws FileNotFoundException{}
	}
