package com.practice.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class TempStudent {
	public String name;
	public int age;
	public Address address;
	public List<MobileNumber> mobileNumbers;

	public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}
}

class Student {
	private String name;
	private int age;
	private Address address;
	private List<MobileNumber> mobileNumbers;

	public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	public List<MobileNumber> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", age=" + age + ", address=" + address + ", mobileNumbers="
				+ mobileNumbers + '}';
	}
}

class Address {
	private String zipcode;

	public Address(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}

class MobileNumber {
	private String number;

	public MobileNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}

public class StreamTest {

	public static void main(String[] args) {

		Student student1 = new Student("Jayesh", 21, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Student student2 = new Student("Khyati", 20, new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

		Student student3 = new Student("Jason", 25, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

		List<Student> students = Arrays.asList(student1, student2, student3);

		/*****************************************************
		 * Get student with exact match name "jayesh"
		 *****************************************************/

		Optional<Student> student = students.stream().filter(x -> x.getName().equals("Jayesh")).findFirst();
		System.out.println(student.isPresent() ? student.get().getName() : "No student found");

		/*****************************************************
		 * Get student with matching address "1235"
		 *****************************************************/

		students.stream().filter(x -> x.getAddress().getZipcode().equals("1235")).collect(Collectors.toList())
				.forEach(s -> System.out.println(s.getName()));

		/*****************************************************
		 * Get all student having mobile numbers 3333.
		 *****************************************************/

		List<Student> stu2 = students.stream()
				.filter(x -> x.getMobileNumbers().stream().anyMatch(y -> y.getNumber().equals("3333")))
				.collect(Collectors.toList());

		String result = stu2.stream().map(m -> m.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(result);

		/*****************************************************
		 * Get all student having mobile number 1233 and 1234
		 *****************************************************/

		List<Student> stu3 = students.stream()
				.filter(x -> x.getMobileNumbers().stream()
						.anyMatch(y -> (y.getNumber().equals("1233") || y.getNumber().equals("1234"))))
				.collect(Collectors.toList());
		String result1 = stu3.stream().map(m -> m.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(result1);

		/*****************************************************
		 * Create a List<Student> from the List<TempStudent>
		 *****************************************************/

		TempStudent tmpStud1 = new TempStudent("Jayesh1", 201, new Address("12341"),
				Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));

		TempStudent tmpStud2 = new TempStudent("Khyati1", 202, new Address("12351"),
				Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));

		List<TempStudent> tmpStudents = Arrays.asList(tmpStud1, tmpStud2);

		List<Student> studentList = tmpStudents.stream()
				.map(tmpStud -> new Student(tmpStud.name, tmpStud.age, tmpStud.address, tmpStud.mobileNumbers))
				.collect(Collectors.toList());
		System.out.println(studentList);

		/*****************************************************
		 * Convert List<Student> to List<String> of student name
		 *****************************************************/

		List<String> names = students.stream().map(Student::getName).collect(Collectors.toList());
		String nm = names.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(nm);

		/*****************************************************
		 * Convert List<students> to String
		 *****************************************************/

		String name = students.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(name);

		/*****************************************************
		 * Change the case of List<String>
		 *****************************************************/

		students.stream().map(m -> m.getName().toUpperCase()).forEach(System.out::println);

		/*****************************************************
		 * Sort List<String> .
		 *****************************************************/

		students.stream().map(m -> m.getName()).sorted().forEach(System.out::println);

		/*****************************************************
		 * Conditionally apply Filter condition, say if flag is enabled then
		 *****************************************************/

		students.stream().filter(m -> m.getName().startsWith("J")).sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList()).forEach(s -> System.out.println(s.getName()));

		System.out.println("-------");

		/*
		 * students.sort(Comparator.comparing(Student::getName, (name1, name2) -> {
		 * return name1.compareTo(name2); }));
		 * 
		 * students.forEach(s -> System.out.println(s.getName()));
		 */

		System.out.println("-------");

		/*
		 * students.sort(Comparator.comparing(Student::getAge).reversed()
		 * .thenComparing(Comparator.comparing(Student::getName)).reversed());
		 * 
		 * students.forEach(s -> System.out.println(s.getName()));
		 */
		
		System.out.println("-------");
		
		students.sort(Comparator.comparing(Student::getAge, (age1, age2) -> {
			if (age1 == age2)
				return 0;
			
			return age1 > age2 ? -1 : 1;
		}));
		
		students.forEach(s -> System.out.println(s.getName()));
		
	}
}
