package com.rzit.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferences {
	public static void main(String args[]) {
		// Type 1 Reference to a Static Method
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// Method reference
		list.forEach(MethodReferences::print);
		// Lambda expression
		list.forEach(number -> MethodReferences.print(number));
		// normal
		for (int number : list) {
			MethodReferences.print(number);
		}

		// Type 2 Reference to an Instance Method of a Particular Object
		final List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		final MyComparator myComparator = new MyComparator();
		// Method reference
		Collections.sort(list1, myComparator::compare);
		// Lambda expression
		Collections.sort(list1, (a, b) -> myComparator.compare(a, b));

		// Type 3 Reference to an Instance Method of an Arbitrary Object of a Particular
		final List<Person> people = Arrays.asList(new Person("dan"), new Person("laura"));
		// Method reference
		people.forEach(Person::printName);
		// Lambda expression
		people.forEach(person -> person.printName());
		// normal
		for (final Person person : people) {
			person.printName();
		}
		// Type 4 Reference to a Constructor
		final List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// Method Reference
		copyElements(list2, ArrayList<Integer>::new);
		// Lambda expression
		copyElements(list2, () -> new ArrayList<Integer>());
	}

	public static void print(final int number) {
		System.out.println("I am printing: " + number);
	}

	private static class MyComparator {
		public int compare(final Integer a, final Integer b) {
			return a.compareTo(b);
		}
	}

	private static class Person {
		private String name;

		public Person(final String name) {
			this.name = name;
		}

		public void printName() {
			System.out.println(name);
		}
	}

	private static void copyElements(final List<Integer> list, final Supplier<Collection<Integer>> targetCollection) {
		// Method reference to a particular instance
		list.forEach(targetCollection.get()::add);
	}
}