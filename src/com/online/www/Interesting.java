package com.online.www;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import com.rom.Basics.Array;

class Student{
	String name;
	int mark;
	public Student(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", mark=" + mark + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(mark, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return mark == other.mark && Objects.equals(name, other.name);
	}
	
}

public class Interesting {

	public static void main(String[] args) {
		Student[] s= {
				new Student("Harsh",30),
				new Student("Prajwal",90),
				new Student("Harish",69),
				new Student("Adarsh",38),
				new Student("Vinya",97),
				new Student("Kenya",88)
		};
		List<Student> al=Arrays.asList(s);
		
		Function<Integer, String> f=s->{
			
		};
	}

}
