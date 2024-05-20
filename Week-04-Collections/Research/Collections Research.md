# Collections Research
Collections

All information was found at:

* https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html

* https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html

* https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Set.html

* https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html


## Questions to Answer:
3. What are the difference between Lists, Sets, and Maps in Java?

4. List at least two different implementations for each collection (List, Set, and Map).  When would you use one of the implementations over the other?

5. Write Java code that does the following:
    (a) Write a line of code that shows how you would instantiate an ArrayList of String.

    (b) Write a line of code that shows how you would instantiate a HashSet of StringBuilder.

    (c) Write a line of code that shows how you would instantiate a HashMap of String, String.

## Question 3: Lists, Sets, and Maps
1. Lists: 

    (a) Ordered collection of objects that can be accessed by index (similar to an Array).  May contain duplicates

    (b) List is an interface, so you can make your own list class that "implements" the list interface making it almost interchangeable with other types of lists.

    (c) Existing classes that implent the list interface include ArrayList and LinkedList.

    (d) The user has the ability to determine where within a list that item is inserted/removed.

2. Sets:
    (a) A collection of objects that do not contain any duplicates.  Duplicates are defined as an object that would return true for equals() method.

    (b) Set is an interface, so you can make your own set class that "implements" the set interface making it almost interchangeable with other types of sets.

    (c) Existing classes that implement the set interface include HashSet, LinkedHashSet, and TreeSet.

3. Maps:
    (a) A collection of objects that are key-data pairs.  You cannot have duplicate keys, but can have duplicate data.  A dictionary is a classic example, where you have each word as a key, and it's definition as the data.

    (b) Map is an interface, so you can make your own map class that "implements the set interface making it almost interchangeable with other types of maps.

    (c) Existing classes that implement the map interface include HashMap and TreeMap.

## Question 4: 2 implementations for each and when to use.
1. Lists:

    (a) ArrayList
        
        * Use ArrayList in place of an array if you don't know how many elements are needed when coding.  Java automatically handles when to add more memory for additional list entries to help out with efficiency.

    (b) LinkedList

        * Linked Lists can be more efficient in memory, but the access can be slower since you need to traverse the list to get to an element.
2. Sets:

    (a) HashSet

        * Use HashSet when you don't want duplicates and don't care about maintaining insertion order of the collection.  It's the best performing version of the Set classes.

    (b) TreeSet

        * Use TreeSet when you are willing to sacrifice some performance to have an ordered set in the collection.
3. Maps:

    (a) HashMap

        * Use HashMap when you have key-data pairs and want the best performance.  Like sets, the insertion order is not maintained.

    (b) TreeMap

        *Use TreeMap similar to TreeSet, when you are willing to sacrifice some performance to have an ordered map in the collection, but still have key-data pairs.

## Question 5: Code Examples
1. Write a line of code that hows how you would instantiate an ArrayList of String.

    (a) List\<String> myList = new ArrayList<>();
2. Write a line of code that shows how you would instantiate a HashSet of StringBuilder.

    (a) Set\<StringBuilder> mySet = new HashSet<>();
3. Write a line of code that shows how you would instantiate a HashMap of String, String.

    (a) Map\<String,String> myMap = new HashMap<>();