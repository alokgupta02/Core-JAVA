package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
class NameAge {
	private String name;
	private int age;
}

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class StreamAPIExample3 {

	private String name;
	private int age;
	private String city;

	public static void main(String[] args) {
		ArrayList<StreamAPIExample3> myList = new ArrayList<>();
		myList.add(new StreamAPIExample3("Alok Gupta", 33, "Port Blair"));
		myList.add(new StreamAPIExample3("Jeegnesh Kumar", 35, "Surat"));
		myList.add(new StreamAPIExample3("Surya", 23, "Delhi"));

		System.out.println("Original Values : ");
		myList.stream().forEach(a -> {
			System.out.println("Name : " + a.getName() + " | Age : " + a.getAge() + " | City : " + a.getCity());
		});
		System.out.println();

		Stream<NameAge> nameAgeStream = myList.stream().map(a -> new NameAge(a.name, a.age));
		System.out.println("Mapped Values : ");

		// Collect to List()
		List<NameAge> naList = nameAgeStream.toList();
		for (NameAge a : naList)
			System.out.println(a.getName() + " : " + a.getAge());

	}

}
