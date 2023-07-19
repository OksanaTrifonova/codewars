
Codewars Tasks
LEVEL 8. Task #1: Welcome! - hhttps://www.codewars.com/kata/577ff15ad648a14b780000e7/train/java
Description.
Your start-up's BA has told marketing that your website has a large audience in Scandinavia and surrounding countries. Marketing thinks it would be great to welcome visitors to the site in their own language. Luckily you already use an API that detects the user's location, so this is an easy win.

The Task
Think of a way to store the languages as a database (eg an object). The languages are listed below so you can copy and paste!
Write a 'welcome' function that takes a parameter 'language' (always a string), and returns a greeting - if you have it in your database. It should default to English if the language is not in the database, or in the event of an invalid input.
The Database
english: "Welcome",
czech: "Vitejte",
danish: "Velkomst",
dutch: "Welkom",
estonian: "Tere tulemast",
finnish: "Tervetuloa",
flemish: "Welgekomen",
french: "Bienvenue",
german: "Willkommen",
irish: "Failte",
italian: "Benvenuto",
latvian: "Gaidits",
lithuanian: "Laukiamas",
polish: "Witamy",
spanish: "Bienvenido",
swedish: "Valkommen",
welsh: "Croeso"
Possible invalid inputs include:

IP_ADDRESS_INVALID - not a valid ipv4 or ipv6 ip address
IP_ADDRESS_NOT_FOUND - ip address not in the database
IP_ADDRESS_REQUIRED - no ip address was supplied

LEVEL 7. 
Task #1: Longest Palindrome -https://www.codewars.com/kata/5a438bc1e1ce0e129100005a

Description.
 The citizens of Codeland read each word from right to left, meaning that lexicographical comparison works differently in their language. Namely, string a is lexicographically smaller than string b if either: a is a suffix of b (in common sense, i.e. b ends with a substring equal to a); or their last k characters are the same but the (k + 1)th character from the right in string a is smaller than the same character in string b.

Given an array of words in Codeland language, sort them lexicographically according to Codeland's unique rules.

For words = ["nigeb", "ta", "eht", "gninnigeb"], the output should be unusualLexOrder(words) = ["ta", "nigeb", "gninnigeb", "eht"].

In particular, "ta" < "nigeb" because 'a' < 'b' and "nigeb" < "gninnigeb" because the former word is a suffix of the latter.

LEVEL 6. Task #1: Longest Palindrome - https://www.codewars.com/kata/54bb6f887e5a80180900046b/train/java

Description. Find the length of the longest substring in the given string s that is the same in reverse. As an example, if the input was “I like racecars that go fast”, the substring (racecar) length would be 7. If the length of the input string is 0, the return value must be 0.

Task #2: Find The Parity Outlier - https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java

Description. You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

Task #3: Perimeter of Fibonacci Rectangle - https://www.codewars.com/kata/59c35ba16bddd219ee000082/train/java

Description. The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. The perimeter of the overall rectangle is 42. Give the perimeter of a rectangle when there are n + 1 squares disposed. The function perimeter has the parameter n where n + 1 is the number of squares (they are numbered from 0 to n), and returns the perimeter of the overall rectangle (not of its component squares).

Task #4: Casino chips - https://www.codewars.com/kata/5e0b72d2d772160011133654/train/java
Description.
You are given three piles of casino chips: white, green and black chips:
the first pile contains only white chips
the second pile contains only green chips
the third pile contains only black chips
Each day you take exactly two chips of different colors and head to the casino. You can choose any color, but you are not allowed to take two chips of the same color in a day.

You will be given an array representing the number of chips of each color and your task is to return the maximum number of days you can pick the chips. Each day you need to take exactly two chips.

Examples (input -> output)
* [1,1,1] -> 1, because after you pick on day one, there will be only one chip left
* [1,2,1] -> 2, you can pick twice; you pick two chips on day one then on day two
* [4,1,1] -> 2

Task #5: Who likes it? - https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java

Description. We want to create the text that should be displayed next to such an item.

Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this

LEVEL 5. Task #1: Longest Palindrome -https://www.codewars.com/kata/576b072359b1161a7b000a17/train/java

Description. Create a function that returns an array containing the first l numbers from the nth diagonal of Pascal's triangle.
n = 0 should generate the first diagonal of the triangle (the ones).
The first number in each diagonal should be 1.
If l = 0, return an empty array.
Both n and l will be non-negative integers in all test cases.