
//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

import java.util.Arrays;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] myArray = {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
		System.out.println(myArray[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(myArray[myArray.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(myArray[6]);
		//results in exception
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(myArray[-1]);
		//results in exception
		System.out.println("-".repeat(10));
			
		// 6. Write a traditional for loop that prints out each element in the array
		for(int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		System.out.println("-".repeat(10));
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for(int element : myArray) {
			System.out.println(element);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for(int element : myArray) {
			sum+= element;
		}
		System.out.println("Sum is: " + sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it
		double average = (double)sum / (double)myArray.length;
		System.out.println("Average is: " + average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for(int element : myArray) {
			if(element % 2 != 0) {
				System.out.println("Odd: " + element);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] sArray = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
		int numChars = 0;
		for( String s : sArray) {
			numChars += s.length();
		}
		System.out.println("Character Count: " + numChars);
		System.out.println(isPalindrome("madam I am Adam"));

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		System.out.println("Methods 13:");
		printGreeting("Bubba");
		printGreeting("    Turd Ferguson     ");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println("Methods 14:");
		System.out.println(addGreeting("Bubba"));
		System.out.println(addGreeting("    Turd Ferguson     "));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println("Method 15: (Expect t-t-f-t)");
		System.out.println(isWordLongerThanCount("short",3));
		System.out.println(isWordLongerThanCount("short",-1));
		System.out.println(isWordLongerThanCount("short",45));
		System.out.println(isWordLongerThanCount("wehadababyitsaboy",3));
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println("Method 16: (Expect t-t-f-f)");
		String[] wordArray = {"hello", "how", "are", "you"};
		System.out.println(isWordInArray(wordArray, "how"));
		System.out.println(isWordInArray(wordArray, "you"));
		System.out.println(isWordInArray(wordArray, "fine"));
		System.out.println(isWordInArray(wordArray, "snickers"));
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println("Method 17:");
		int[] firstTest = {1,2,3,4,5,6};
		System.out.println(smallestValue(firstTest));
		int[] secondTest = {123,456,789,-123};
		System.out.println(smallestValue(secondTest));
		int[] thirdTest = {-1,2,-3,4,-5,6};
		System.out.println(smallestValue(thirdTest));
		int[] fourthTest = {6,5,4,3,2,1};
		System.out.println(smallestValue(fourthTest));
		
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		System.out.println("Method 18:");
		double[] d1Test = {1.0,2.0,3.0,4.0,5.0,6.0,7.0};
		System.out.println(averageDouble(d1Test));
		double[] d2Test = {5.0,5.0,5.0,5.0,5.0,5.0,5.0};
		System.out.println(averageDouble(d2Test));
		double[] d3Test = {1.0,-2.0,3.0,-4.0,5.0,-6.0,7.0};
		System.out.println(averageDouble(d3Test));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		System.out.println("Method 19:");
		System.out.println("String Array: " + Arrays.toString(sArray));
		System.out.println("Int Array" + Arrays.toString(stringArrayLengths(sArray)));

		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println("Method 20:");
		String[] s1Test = {"even", "odd", "evener", "odder"};
		System.out.println(evenGreaterThanOdd(s1Test));
		String[] s2Test = {"one", "two", "three", "four"};
		System.out.println(evenGreaterThanOdd(s2Test));
		String[] s3Test = {"123456", "123", "456"};
		System.out.println(evenGreaterThanOdd(s3Test));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.println("Method 21:");
		System.out.println(isPalindrome("Madam Im Adam"));
		System.out.println(isPalindrome("My name is Tom"));
		System.out.println(isPalindrome("civic"));
		System.out.println(isPalindrome("Hannah"));
		
		
	}
	

	
	// Method 13:
	public static void printGreeting(String name) {
		System.out.println("Hello " + name.trim() + ", welcome to my code!");
	}
	


	// Method 14:
	public static String addGreeting(String name) {
		return "Hello " + name.trim() + ", nice to meet you!";
	}
	
	//When calling, you still need to act on the returned method, method 13 is a call and forget.
	
	// Method 15:
	public static boolean isWordLongerThanCount(String word, int count) {
		return word.length() > count;
	}
	
	
	// Method 16:
	public static boolean isWordInArray(String[] wordList, String wordToCheck) {
		for(String word : wordList) {
			if(word.equals(wordToCheck)) {
				return true;
			}
		}
		return false;
	}
	
	// Method 17:
	public static int smallestValue(int[] intArray) {
		int smallestNumber = Integer.MAX_VALUE;
		for(int i : intArray) {
			if(i < smallestNumber) {
				smallestNumber = i;
			}
		}
		return smallestNumber;
	}

	
	// Method 18:
	public static double averageDouble(double[] doubleArray) {
		double sum = 0;
		for(double d : doubleArray) {
			sum += d;
		}
		return sum / (double)doubleArray.length;
	}
	
	// Method 19:
	public static int[] stringArrayLengths(String[] sArray) {
		int[] returnArray = new int[sArray.length];
		for(int i=0; i<sArray.length; i++) {
			returnArray[i] = sArray[i].length();
		}
		return returnArray;
	}

	
	// Method 20:
	public static boolean evenGreaterThanOdd(String[] sArray) {
		int[] lengthArray = stringArrayLengths(sArray);
		int evenSum = 0;
		int oddSum = 0;
		
		for(int length : lengthArray) {
			if(length % 2 == 0) {
				evenSum += length;
			} else {
				oddSum += length;
			}
		}
		return evenSum > oddSum;
	}
	
	
	// Method 21:
	public static boolean isPalindrome(String testString) {
		//Remove spaces so we don't need to worry about comparing them, and change all case to lower
		String noSpaces = testString.replace(" ", "").toLowerCase();
		for(int i=0; i<noSpaces.length()/2; i++) {
			if(noSpaces.charAt(i) != noSpaces.charAt(noSpaces.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
