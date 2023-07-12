
Codewars Tasks

LEVEL 6. Task #1: Longest Palindrome - https://www.codewars.com/kata/54bb6f887e5a80180900046b/train/java

Description. Find the length of the longest substring in the given string s that is the same in reverse. As an example, if the input was “I like racecars that go fast”, the substring (racecar) length would be 7. If the length of the input string is 0, the return value must be 0.

Task #2: Find The Parity Outlier - https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java

Description. You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

Task #3: Perimeter of Fibonacci Rectangle - https://www.codewars.com/kata/59c35ba16bddd219ee000082/train/java

Description. The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. The perimeter of the overall rectangle is 42. Give the perimeter of a rectangle when there are n + 1 squares disposed. The function perimeter has the parameter n where n + 1 is the number of squares (they are numbered from 0 to n), and returns the perimeter of the overall rectangle (not of its component squares).

Task #4: Casino chips - https://www.codewars.com/kata/5e0b72d2d772160011133654/train/java

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