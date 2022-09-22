package com.java8;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

// StreamAPI Tutorial from the Complete Reference Book
public class StreamAPIExample2 {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(8);
		myList.add(5);
		myList.add(6);
		myList.add(2);
		myList.add(1);
		myList.add(4);

		System.out.println("Original Values : " + myList);

		// obtain stream
		Stream<Integer> myStream = myList.stream();

		// find minimum value
		Optional<Integer> minVal = myStream.min(Integer::compare);
		if (minVal.isPresent())
			System.out.println("Minimum Value : " + minVal.get());

		// find maximum value
		myStream = myList.stream();
		Optional<Integer> maxVal = myStream.max(Integer::compare);
		if (maxVal.isPresent())
			System.out.println("Maximum Value : " + maxVal.get());

		// sort
		Stream<Integer> sortedStream = myList.stream().sorted();
		System.out.print("Sorted Stream : ");
		sortedStream.forEach((n) -> System.out.print(n + " "));

		// filter
		Stream<Integer> oddVal = myList.stream().sorted().filter((n) -> (n % 2) == 1);
		System.out.print("\nOdd Values : ");
		oddVal.forEach((n) -> System.out.print(n + " "));

		// Display only the odd values that are greater than 5.
		Stream<Integer> greaterOddVals = myList.stream().filter((n) -> (n % 2 == 1)).filter((n) -> n > 5);
		System.out.print("\nFiltered Odd Values > 5 : ");
		greaterOddVals.forEach((n) -> System.out.print(n + " "));

		// Add all the numbers in the list
		Optional<Integer> addVal = myList.stream().reduce((a, b) -> a + b);
		if (addVal.isPresent())
			System.out.println("\nAddition result : " + addVal.get());

	}

}
