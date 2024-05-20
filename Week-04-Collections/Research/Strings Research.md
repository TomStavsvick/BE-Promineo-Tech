# Strings Research
Strings

All information was found at https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html

1. Select five (5) methods from the String Java Documentation and describe the following for each: 

    (a) What is the method signature for each method?

    (b) What does each method do? 

    (c) Why would this method be useful (how could you use it)?  Give an example.

## Method 1: static String format()
1. Method Signature: 

    String format(Locale l, String format, Object...args)

    (a) It is a static method so you do not need to have a string to call it (it can be called by String.format)

    (b) It creates (and returns) a string literal.

    (c) Locale will use location specific formatting guidance (comma vs. period in numbers)

    (d) format (the parameter) is a string that can be a combination of fixed text (literal) and format specifiers.  A format specifier is a group of characters that will format one of the object arguments in a specific way.

    (e) args are optional sources for the format specifiers in the format string.
2. This method returns a string with specific formatting.  It allows you to specify how certain primitives are formatted in the string it creates.  For example, if you are displaying money, you can opt to always show 2 decimal places for your double.

3. This method is useful when creating strings in a particular neatly formatted display.  You can take an integer and display it in hexadecimal format, or reduce the number of decimal places displayed, etc.  You can basically override the default display format for primitives with the format you want.

## Method 2: String[] split()
1. Method Signature:

    String[] split(String regex)

    String[] split(String regex, int limit)

    (a) It is not static, so you call it from a string (eg. myString.Split(" ");)

    (b) "regex" is a delimiter the method uses to separate the string into substrings.
    
    (c) "limit" allows you to specify the maximum number of substrings to create.
2. This method returns an array of Strings that are all substrings of the original.  For example, you could use a string literal of a space (" ") as regex if the string were a sentance and you would get returned an array of all the words that made up the calling string's sentance.
3. This would be useful to break apart sentances, or if you had a data log with comma delimited values, you could separate the values to an array and call other methods to convert the value strings to their primitive equivalents.

## Method 3: String trim()
1. Method Signature:

    String trim()

    (a) It is not static, so you call it from a string.  It replaces the string calling it.

    (b) It removes all spaces (and ascii characters numerically less than a space) from the start and end of the calling string.
2. The method removes (or trims) "white space" from the start and end of a string, replacing the original string with a new one.
3. This is really helpful to use after the example from the previous method, where you have a comma separated list and the user entered ", " instead of just "," between data items.  You can use this method to remove the space, and if the space didn't exist there's no change to the string.

## Method 4: String toLowerCase()
1. Method Signature

    String toLowerCase()

    String toLowerCase(Locale locale)

    (a) It is not static, so you call it from a string.  It does not modify the string, but returns a string with all alphabetic characters replaced with their lower-case equivalent.

2. It returns a new string that has the original string's upper case characters replaced with their lower case equivalents.  This does not replace the original string, it returns a new reference to a new string.
3. This is really useful for doing string comparisons especially during searches or when handling user input.  You can force the case for comparisons without modifying the original string data.

## Method 5: String toUpperCase()
1. Method Signature

    String toUpperCase()

    String toUpperCase(Locale locale)

    (a) It is not static, so you call it from a string.  It does not modify the string, but returns a string with all alphabetic characters replaced with their upper-case equivalent.

2. It returns a new string that has the original string's lower case characters replaced with their upper case equivalents.  This does not replace the original string, it returns a new reference to a new string.
3. This is really useful for doing string comparisons especially during searches or when handling user input.  You can force the case for comparisons without modifying the original string data.