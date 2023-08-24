package com.comparable.comparable;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Comparable_main {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		int arr[] = { 57, 12, 6, 34, 9 };

		// Compare and sorts by integer using compareTo - happens internally.
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		Employee[] employee = new Employee[5];
		employee[0] = new Employee(1, "Zara", "chan@gmail.com", "Bangalore");
		employee[1] = new Employee(2, "Ravi", "chan@gmail.com", "Bangalore");
		employee[2] = new Employee(3, "Amit", "chan@gmail.com", "Bangalore");
		employee[3] = new Employee(4, "Chan", "chan@gmail.com", "Bangalore");
		employee[4] = new Employee(5, "Mani", "chan@gmail.com", "Bangalore");
		// Custom object ordering by integer - compareTo Overrided in Employee
		Arrays.sort(employee); // Since employee-object is an type of array, Arrays is used.
		// For List<>,Map<> using Collections.sort(List<Employee>);
		System.out.println(Arrays.toString(employee));

		Arrays.sort(employee, Employee.nameComparing);
		System.out.println(Arrays.toString(employee));

	}
}
