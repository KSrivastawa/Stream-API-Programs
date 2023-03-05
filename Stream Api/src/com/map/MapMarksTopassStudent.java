package com.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMarksTopassStudent {
	
	static final int passMarks = 350;
	static final int increaseMarks = 355;
	
	int roll;
	String name;
	int marks;
	
	public MapMarksTopassStudent() {
		// TODO Auto-generated constructor stub
	}

	public MapMarksTopassStudent(int roll, String name, int marks) {
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
		
		List<MapMarksTopassStudent> students = Arrays.asList(
				new MapMarksTopassStudent(10, "Ketan", 450),
				new MapMarksTopassStudent(20, "Rohit", 360),
				new MapMarksTopassStudent(30, "Mukesh", 300),
				new MapMarksTopassStudent(40, "Keshri", 750),
				new MapMarksTopassStudent(50, "Rudra", 250)
			);
		
		List<MapMarksTopassStudent> list = students.stream()
		.filter(s-> s.marks<passMarks)
		.map(m-> new MapMarksTopassStudent(m.roll, m.name, m.marks=increaseMarks))
		.collect(Collectors.toList());
		
		list.forEach(System.out::println);
		System.out.println("==================student details1=================");
		
		List<MapMarksTopassStudent> studentList = students.stream().map(m-> m
				.marks < passMarks
				? new MapMarksTopassStudent(m.roll, m.name, m.marks=increaseMarks)
						: new MapMarksTopassStudent(m.roll, m.name, m.marks))
		.collect(Collectors.toList());

		studentList.forEach(System.out::println);
		
		System.out.println("===================student details2=================");
		
		List<MapMarksTopassStudent> passedStudents = passTheStudents(students);
		passedStudents.forEach(System.out::println);
	}
	
	public static List<MapMarksTopassStudent> passTheStudents(List<MapMarksTopassStudent> students){
		List<MapMarksTopassStudent> list = new ArrayList<>();
		
		for(MapMarksTopassStudent ms: students) {
			if(ms.marks<passMarks) {
				MapMarksTopassStudent 
				topassStudent = new MapMarksTopassStudent
				(ms.roll,ms.name ,ms.marks=increaseMarks); 
				list.add(topassStudent);
			}
			list.add(new MapMarksTopassStudent(ms.roll,ms.name, ms.marks));
		}
		
		return list;
		
	}

}
