package com.pluralsight.interview_exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		replaceCharInText();
//		printFibonacci(100);
//		fizzBuzz(50);
//		employeeComparator();
//		reverseString("abcdefgh");
		primeChecker();
		System.out.println(factorial(3));
	}

	private static void primeChecker() {
		PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();
		Integer[] numbers = {21,12,13,34,65,71,123,23223,3847,63784};
		for (Integer nr : numbers){
			System.out.println(nr + " : " + primeNumberChecker.isPrime(nr)); 
		}
	}

	private static void reverseString(String string) {
		StringModifier stringModifier = new StringModifier();
		System.out.println(stringModifier.reverseString(string));	
	}

	private static void employeeComparator() {
		List<Employee> employees = new ArrayList<>();
		
		Employee emp1 = new Employee();
		emp1.setName("John Do");
		emp1.setDepartment("management");
		emp1.setAge(34);
		
		Employee emp2 = new Employee();
		emp2.setName("John Do");
		emp2.setDepartment("management");
		emp2.setAge(24);
		
		employees.add(emp1);
		employees.add(emp2);
		
		System.out.println(employees);
		employees.sort(new EmployeeComparator());
		System.out.println(employees);
	}

	private static void fizzBuzz(Integer n) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.printNumbers(n);
	}

	private static void replaceCharInText() {
		StringModifier stringModifier = new StringModifier();
		System.out.println(stringModifier.replaceChar("aaabbbbaaa", 'b', 'c'));
	}

	private static void printFibonacci(int n){
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.print(n);
	}
	
	public static int factorial(int number){       
        //base case
        if(number == 0){
            return 1;
        }
        return number*factorial(number -1); //is this tail-recursion?
    }
}
