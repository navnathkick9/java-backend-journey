📘 Java DSA Practice – Basics to Strings (README Guide)

This repository covers fundamental programming and DSA problems frequently asked in interviews and coding rounds.
The focus is on logic understanding, not just coding.

📌 1. Swap Two Numbers (Without Temp Variable)
Theory

Two numbers can be swapped using arithmetic operations without using an extra variable.

Logic
a = a + b
b = a - b
a = a - b

Concept Used

Arithmetic operations

Variable manipulation

Time Complexity

O(1)

📌 2. Palindrome Number
Theory

A number is a palindrome if it reads the same forward and backward.

Example:

121 → Palindrome
123 → Not Palindrome

Logic

Reverse digits.

Compare reversed number with original.

Concept Used

Modulus (%)

Loop iteration

Time Complexity

O(log n)

📌 3. Factorial Using Recursion
Theory

Factorial:

n! = n × (n-1) × ... × 1


Example:

5! = 5 × 4 × 3 × 2 × 1 = 120

Logic

A function calls itself until base case.

Recursive Formula
factorial(n) = n × factorial(n-1)

Concept Used

Recursion

Base condition

Time Complexity

O(n)

📌 4. Floyd's Triangle
Theory

A triangular pattern of increasing numbers.

Example:

1
2 3
4 5 6
7 8 9 10

Logic

Outer loop controls rows.

Inner loop prints numbers.

Concept Used

Nested loops.

📌 5. Diamond Pattern
Theory

A symmetric star pattern shaped like a diamond.

Logic

Print upper pyramid.

Print inverted pyramid.

Concept Used

Nested loops

Space & pattern control

📌 6. Find Max and Min in Array
Theory

Traverse the array and update minimum and maximum values.

Logic

Assume first element as min and max.

Compare each element.

Concept Used

Array traversal

Time Complexity

O(n)

📌 7. Reverse an Array
Theory

Reverse elements by swapping start and end.

Example:

Input:  [1,2,3,4]
Output: [4,3,2,1]

Logic

Swap elements until middle.

Concept Used

Two-pointer technique.

Time Complexity

O(n)

📌 8. Rotate Array by K
Theory

Rotate array elements right by K positions.

Example:

Input: [1,2,3,4,5,6,7], K=3
Output: [5,6,7,1,2,3,4]

Logic

Reverse whole array.

Reverse first K elements.

Reverse remaining elements.

Concept Used

Array reversal technique.

Time Complexity

O(n)

📌 9. Reverse String
Theory

Reverse characters in string.

Example:

hello → olleh

Logic

Traverse from end or swap characters.

Concept Used

String traversal.

📌 10. Palindrome String
Theory

A string that reads same forward and backward ignoring symbols and case.

Example:

"A man, a plan, a canal: Panama"

Logic

Remove special characters.

Compare from both ends.

Concept Used

Two-pointer approach.

📌 11. Anagram Check
Theory

Two strings are anagrams if they contain same characters in different order.

Example:

listen → silent

Logic

Sort both strings and compare.

Concept Used

Sorting or frequency count.

Time Complexity

O(n log n)

📌 12. First Non-Repeating Character
Theory

Find first character appearing only once.

Example:

leetcode → l

Logic

Count frequency.

Return first with count 1.

Concept Used

Hashing / frequency array.

📌 13. Longest Common Prefix
Theory

Find longest common starting substring.

Example:

flower, flow, flight → "fl"

Logic

Reduce prefix until all strings match.

Concept Used

String comparison.

🧠 Concepts Covered

This practice covers:

Loops

Recursion

Arrays

Strings

Two-pointer technique

Hashing

Sorting

Pattern problems