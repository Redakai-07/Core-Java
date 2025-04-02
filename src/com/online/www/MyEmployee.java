package com.online.www;

import java.util.Objects;
import java.util.function.Predicate;

class Employee {
	String name;
	String designation;
	double salary;
	String location;


	
	public Employee(String name, String designation, double salary, String location) {
	    this.name = name;
	    this.designation = designation;
	    this.salary = salary;
	    this.location = location;
	}
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + ", location="
//				+ location + "]";
//	}
	@Override
	public String toString(){
		String s = String.format("(%s, %s, %.2f, %s)", name, designation, salary, location);

		return s;
	}
	@Override
	public int hashCode() {
		return Objects.hash(designation, location, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(designation, other.designation) && Objects.equals(location, other.location)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
}


public class MyEmployee {

	public static void main(String[] args) {
		
//		Employee emp=new Employee("Man","Host",5000,"Kannur");
//		System.out.println(emp);
		
			Employee[] em= {
					new Employee("Seena","Member",40000.00,"Kasaragod"),
					new Employee("Bunty","Leader",60000.00,"Bangalore"),
					new Employee("Harish","Manager",100000.00,"Hassan"),
					new Employee("Sohith","Manager",45000.00,"Mandya"),
					new Employee("Babu","Member",40000.00,"Tumkur"),
					
			};
			Predicate<Employee> h=t->t.location.equals("Bangalore");
			Predicate<Employee> q=t->t.designation.equals("Manager");
			Predicate<Employee> r=t->t.salary>=45000;
			Predicate<Employee> s=Predicate.isEqual(em[2]);
			
//			for (Employee g:em) {
//				if(r.test(g)) {
//					System.out.println(g.name+" Employee Has Salary "+g.salary);
//				}
//			}
			
		
			dis(em,r.negate());
			System.out.println("**********************");
			dis(em,h.or(q));
			System.out.println("**********************");
			dis(em,h.and(r));
			System.out.println("**********************");
			
			
		}
	
	public static void dis(Employee[] ee,Predicate<Employee> rr) {
		for (Employee aa:ee) {
			if(rr.test(aa)) {
				System.out.println(aa.name+" Employee Has Salary "+aa.salary+" with the designation "+aa.designation);
			}
		}
	}
	
}

