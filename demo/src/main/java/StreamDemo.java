import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamDemo {

	public static void main(String[] args) {
		List<Employee> employeelist=Employee.persons();
		//employeelist.stream().filter(Employee::isMale).map(Employee::getName).forEach(System.out::println);
		
		//employeelist.stream().filter(Employee::isMale).filter(p->p.getIncome()>5000.0).map(Employee::getName).forEach(System.out::println);
		
		//employeelist.stream().map(Employee::getName).forEach(System.out::println);
		
		//employeelist.stream().map(Employee::getIncome).forEach(System.out::println);
		//double sum=employeelist.stream().map(Employee::getIncome).reduce(0.0,Double::sum);
		//System.out.println("Total Income of all employee "+sum);
		
		//OptionalDouble dd=employeelist.stream().mapToDouble(Employee::getIncome).max();
		//System.out.println(dd.getAsDouble());
		long p=employeelist.stream().count();
		System.out.println("total no of record is "+p);

	}

}

class Employee{
	public static enum Gender{
		MALE,FEMALE
	}
	private long id;
	private String name;
	private Gender gender;
	private LocalDate dob;
	private double income;
	public Employee(long id,String name,Gender gender,LocalDate dob,double income) {
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.dob=dob;
		this.income=income;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	
	public boolean isMale() {
		return this.gender==Gender.MALE;
	}
	
	public boolean isFemale() {
		return this.gender==Gender.FEMALE;
	}
	
	public static List<Employee> persons(){
		Employee p1=new Employee(1, "Jake", Gender.MALE, LocalDate.of(1971, Month.JANUARY, 1), 2343.0);
		Employee p2=new Employee(2, "Jack", Gender.MALE, LocalDate.of(1972, Month.APRIL, 20), 7100.0);
		Employee p3=new Employee(3, "Jane", Gender.FEMALE, LocalDate.of(1973, Month.AUGUST, 29), 5455.0);
		Employee p4=new Employee(4, "Jeny", Gender.FEMALE, LocalDate.of(1974, Month.DECEMBER, 3), 1800.0);
		Employee p5=new Employee(5, "Jason", Gender.MALE, LocalDate.of(1975, Month.JULY, 5), 1243.0);
		Employee p6=new Employee(6, "Jode", Gender.MALE, LocalDate.of(1976, Month.FEBRUARY, 11), 3211.0);
		
		List<Employee> emplist=Arrays.asList(p1,p2,p3,p4,p5,p6);
		return emplist;
	}
	public String toString() {
		String str=String.format("(%s,%s,%s,%s,%.2f)\n",id,name,gender,dob,income);
		return str;
	}
}














