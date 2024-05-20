//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		
		//Use a stringbuilder when the string is not the final version to avoid filling up the heap.
		StringBuilder myString = new StringBuilder("This is my string");
		for(int i=0; i<10; i++) {
			myString.append("-" + i);
		}
		System.out.println(myString.toString());
		
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		List<String> myList = new ArrayList<>();
		myList.add("abc");
		myList.add("defg");
		myList.add("hijkl");
		myList.add("mnopqr");
		myList.add("stuvwxy");
		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		System.out.println(shortestString(myList));
		
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		List<String> swapped = swapFirstLast(myList);
		System.out.println("-".repeat(30));
		System.out.println("Original:");
		for(String origin : myList) {
			System.out.println(origin);
		}
		System.out.println("-".repeat(30));
		System.out.println("Swapped:");
		for(String swap : swapped) {
			System.out.println(swap);
		}
		System.out.println("-".repeat(30));

		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		System.out.println(catList(myList));
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		List<String> testList = new ArrayList<>();
		testList.add("peanut butter");
		testList.add("coconut water");
		testList.add("milk");
		testList.add("Mixed nuts");
		testList.add("orange juice");
		List<String> subList = listAllSubstring(testList,"nut");
		System.out.println("-".repeat(30));
		System.out.println("Original:");
		for(String origin : testList) {
			System.out.println(origin);
		}
		System.out.println("-".repeat(30));
		System.out.println("Items with \"nut\":");
		for(String sub : subList) {
			System.out.println(sub);
		}
		System.out.println("-".repeat(30));
		

		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(10);
		intList.add(15);
		intList.add(18);
		intList.add(11);
		intList.add(0);
		List<List<Integer>> bigList = methodSeven(intList);
		for(List<Integer> sub : bigList) {
			System.out.print("{ ");
			for(Integer i : sub) {
				System.out.print(i + " ");
			}
			System.out.println("}");
		}

		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		List<Integer> lengths = stringLengths(myList);
		System.out.print("Number 8: { ");
		for(Integer i : lengths) {
			System.out.print(i + " ");
		}
		System.out.println("}");

		
		// 9. Create a set of strings and add 5 values
		Set<String> myStringSet = new HashSet<>();
		myStringSet.add("Buns");
		myStringSet.add("Hamburger");
		myStringSet.add("Cheese");
		myStringSet.add("Bacon");
		myStringSet.add("Egg");
		System.out.print("Number 9:  { ");
		for(String s : myStringSet) {
			System.out.print(s + " ");
		}
		System.out.println("}");
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		Set<String> containsB = startsWithChar(myStringSet, 'B');
		System.out.print("Number 10 (Starts With B):  { ");
		for(String s : containsB) {
			System.out.print(s + " ");
		}
		System.out.println("}");

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		List<String> listFromSet = setToList(myStringSet);
		System.out.print("Number 11:  { ");
		for(String s : listFromSet) {
			System.out.print(s + " ");
		}
		System.out.println("}");
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		Set<Integer> intSet = new HashSet<>();
		for(int i=0; i<20; i++) {
			intSet.add(i);
		}
		Set<Integer> even = onlyEven(intSet);
		System.out.print("Number 12:  { ");
		for(Integer i : even) {
			System.out.print(i + " ");
		}
		System.out.println("}");

		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("big", "large, as in size, height, width, or amount");
		dictionary.put("small", "of limited size; of comparatively restricted dimensions; not big; little");
		dictionary.put("medium", "a middle state or condition; mean");
		System.out.println("Number 13:");
		Set<String> keys = dictionary.keySet();
		for(String s : keys) {
			System.out.println(s + ": " + dictionary.get(s));
		}

		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println("Number 14 (big):");
		System.out.println(lookUp(dictionary,"big"));
		System.out.println(lookUp(dictionary,"pumpkin"));
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		testList.add("pickles");
		Map<Character, Integer> myMap = stringCharCount(testList);
		System.out.println("-".repeat(30));
		System.out.println("Number 15:");
		System.out.println("  Original:");
		for(String origin : testList) {
			System.out.println("  " + origin);
		}
		System.out.println("  Map:");
		Set<Character> mapKeys = myMap.keySet();
		for(Character c : mapKeys) {
			System.out.println("  " + c + " : " + myMap.get(c));
		}
		System.out.println("-".repeat(30));
		

	}
	
	
	// Method 15:
	public static Map<Character, Integer> stringCharCount(List<String> listOfStrings) {
		Map<Character, Integer> sMap = new HashMap<>();
		Character tempKey = ' ';
		
		for(String s : listOfStrings) {
			//Get the first character of the current string
			tempKey = s.charAt(0);
			if(sMap.containsKey(tempKey)) {
				//If the key exists, increment the integer value by getting the value, then adding 1.
				sMap.replace(tempKey, sMap.get(tempKey) + 1);
			}
			else {
				//No strings starting with this key, so let's create a new map entry and make the count 1.
				sMap.put(tempKey,  1);
			}
		}
		
		
		return sMap;
	}
	
	
	// Method 14:
	public static String lookUp(Map<String, String> dictionary, String word) {
		return dictionary.get(word);
	}

	
	// Method 12:
	public static Set<Integer> onlyEven(Set<Integer> intSet) {
		Set<Integer> evens = new HashSet<>();
		for(Integer i : intSet) {
			if (i % 2 == 0) {
				evens.add(i);
			}
		}
		return evens;
	}

	
	// Method 11:
	public static List<String> setToList(Set<String> stringSet) {
		List<String> l = new ArrayList<>();
		for(String s : stringSet) {
			l.add(s);
		}
		return l;
	}


	// Method 10:
	public static Set<String> startsWithChar(Set<String> stringSet, char startsWith) {
		Set<String> includes = new HashSet<>();
		for(String s : stringSet) {
			if(s.indexOf(startsWith) == 0) {
				includes.add(s);
			}
		}
		return includes;
	}

	
	// Method 8:
	public static List<Integer> stringLengths(List<String> listOfStrings) {
		List<Integer> lengths = new ArrayList<>();
		for(String s : listOfStrings) {
			lengths.add(s.length());
		}
		return lengths;
	}

	
	// Method 7:
	public static List<List<Integer>> methodSeven(List<Integer> intList) {
		List<List<Integer>> finalList = new ArrayList<>();
		List<Integer> divBy2 = new ArrayList<>();
		List<Integer> divBy3 = new ArrayList<>();
		List<Integer> divBy5 = new ArrayList<>();
		List<Integer> notDivBy235 = new ArrayList<>();
		
		for(Integer myInt : intList) {
			if((myInt % 2 == 0) && (myInt != 0)) {
				divBy2.add(myInt);
			}
			if((myInt % 3 == 0) && (myInt != 0)) {
				divBy3.add(myInt);
			}
			if((myInt % 5 == 0) && (myInt != 0)) {
				divBy5.add(myInt);
			}
			if((myInt % 2 != 0) && (myInt % 3 != 0) && (myInt % 5 != 0) || (myInt == 0)) {
				notDivBy235.add(myInt);
			}
		}
		finalList.add(divBy2);
		finalList.add(divBy3);
		finalList.add(divBy5);
		finalList.add(notDivBy235);
		
		return finalList;
	}

	
	// Method 6:
	public static List<String> listAllSubstring(List<String> listOfStrings, String subString) {
		List<String> subList = new ArrayList<>();
		
		for(String s : listOfStrings) {
			if(s.contains(subString)) {
				subList.add(s);
			}
		}
		return subList;
	}

	
	// Method 5:
	public static String catList(List<String> listOfStrings) {
		StringBuilder sb = new StringBuilder(listOfStrings.get(0));
		int index = 0;
		do {
			sb.append("," + listOfStrings.get(++index));
		} while (index < listOfStrings.size() -1);
		return sb.toString();
	}
	
	
	// Method 4:
	public static List<String> swapFirstLast(List<String> listOfStrings) {
		List<String> swapped = new ArrayList<>();
		swapped.add(listOfStrings.get(listOfStrings.size() - 1));
		
		for(int i=1; i<listOfStrings.size()-1; i++) {
			swapped.add(listOfStrings.get(i));
			}
		swapped.add(listOfStrings.get(0));
		return swapped;
	}
	
	
	// Method 3:
	public static String shortestString(List<String> listOfStrings) {
		String shortest = listOfStrings.get(0);
		for(String s : listOfStrings) {
			if(s.length() < shortest.length()) {
				shortest = s;
			}
		}
		return shortest;
	}
	

}