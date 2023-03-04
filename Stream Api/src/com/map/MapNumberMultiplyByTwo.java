package com.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapNumberMultiplyByTwo {
	
	static final int multiplyBy = 3;

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(7,5,9,9,4,7,5,6,2);
		
		numbers.stream()
		.map(m-> m*MapNumberMultiplyByTwo.multiplyBy)
		.sorted()
		.forEach(p-> System.out.print(p+" "));
		
		System.out.println();
		
		List<Integer> integers = numbers.stream()
				.filter(s-> s%2==0)
				.map(m-> m*MapNumberMultiplyByTwo.multiplyBy).sorted()
				.collect(Collectors.toList());

		integers.forEach(s-> System.out.println(s));
	}

}
