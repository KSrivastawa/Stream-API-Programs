package com.filter;

import java.util.Arrays;
import java.util.List;

public class FilterPassStudent {
	
	static final int passMarks = 350;
	
	int roll;
	String name;
	int marks;
	
	public FilterPassStudent() {
		// TODO Auto-generated constructor stub
	}

	public FilterPassStudent(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "FilterPassStudent [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
		
		List<FilterPassStudent> students = Arrays.asList(
					new FilterPassStudent(10, "Ketan", 450),
					new FilterPassStudent(10, "Rohit", 360),
					new FilterPassStudent(10, "Mukesh", 300),
					new FilterPassStudent(10, "Keshri", 750),
					new FilterPassStudent(10, "Rudra", 250)
				);
		
		students.stream().filter(m-> m.marks > FilterPassStudent.passMarks).forEach(p-> System.out.println(p));;
		

	}

}
