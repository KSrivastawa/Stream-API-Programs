package com.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterEvenNumber {

	public static void main(String[] args) {
		
		// create an array and find only the even number
		List<Integer> arrList = new ArrayList<>();
		arrList.add(45);
		arrList.add(56);
		arrList.add(22);
		arrList.add(67);
		arrList.add(43);
		arrList.add(44);
		
		arrList.stream().filter(i-> i%2==0).forEach(p->System.out.println(p));
		
		
	}
}
