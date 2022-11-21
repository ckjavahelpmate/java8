package StreamPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilter2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<>() ;
		emp.add(new Employee(1, "Urmila", 20000, 26)) ;
		emp.add(new Employee(2, "Leela", 14000, 19)) ;
		emp.add(new Employee(3, "Mala", 18000, 28)) ;
		emp.add(new Employee(4, "Sheela", 15000, 22)) ;
//		List<Employee> sorted = emp.stream().filter((employee)->employee.getAge()<25).collect(Collectors.toList());
		
//		sorted.forEach(System.out::println);
		
//	 List<Employee> emp1 = emp.stream().sorted((o1,o2)->(int)(o1.getSal() - o2.getSal())).collect(Collectors.toList()) ;
//		emp1.forEach(System.out::println);
//		List<Employee> sallary = emp.stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed()).collect(Collectors.toList()) ;
//		sallary.forEach(System.out::println);
	
		Predicate<Employee> p1 = e -> e.getSal()>15000 ;
		Predicate<Employee> p2 = e -> e.getAge()>20 ;
		Predicate<Employee> p3 = e -> e.getId()<3 ;
		for( Employee e : emp ) {
			if(p1.or(p2).and(p3).test(e)) {
				System.out.println(e);
			}
		}
	}

}
