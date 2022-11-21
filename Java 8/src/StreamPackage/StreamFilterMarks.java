package StreamPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamFilterMarks {

	public static void main(String[] args) {
		ArrayList<Marks> sheelaMarks = new ArrayList<>() ;
		sheelaMarks.add(new Marks("Tamil", 89)) ;
		sheelaMarks.add(new Marks("Kannada", 95)) ;
		sheelaMarks.add(new Marks("English", 84)) ;
		ArrayList<Marks> leelaMarks = new ArrayList<>() ;
		leelaMarks.add(new Marks("Tamil", 95)) ;
		leelaMarks.add(new Marks("Kannada", 88)) ;
		leelaMarks.add(new Marks("English", 100)) ;
		ArrayList<Marks> urmilaMarks = new ArrayList<>() ;
		urmilaMarks.add(new Marks("Tamil", 76)) ;
		urmilaMarks.add(new Marks("Kannada", 84)) ;
		urmilaMarks.add(new Marks("English", 88)) ;

		ArrayList<Student> students = new ArrayList<>();	
		students.add(new Student("Sheela", sheelaMarks)) ;
		students.add(new Student("Leela", leelaMarks)) ;
		students.add(new Student("Urmila", urmilaMarks)) ;
		
		 students.stream().forEach(null);
		
		

	}

}
class Student{
	private String name ;
	private ArrayList<Marks> marks ;
	public Student(String name, ArrayList<Marks> marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Marks> getMarks() {
		return marks;
	}
	public void setMarks(ArrayList<Marks> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
}
class Marks{
	private String subject ;
	private int marks ;
	public Marks(String subject, int marks) {
		super();
		this.subject = subject;
		this.marks = marks;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Marks [subject=" + subject + ", marks=" + marks + "]";
	}
}