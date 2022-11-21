package StreamPackage;

public class Employee {
	private int id ;
	private String name ;
	private double sal ;
	private int age ;
	public Employee(int id, String name, double sal, int age) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}  
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", age=" + age + "]";
	}
	
	
}
