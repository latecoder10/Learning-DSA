package com.latecoder.recursion;

//Q: Calculate the Fibonacci of a number using recursion
public class Prog1 {
    public static void main(String[] args) {
        int n = 5; // Example input
        int result = fibonnaci(n);
        System.out.println("Fibonnaci of " + n + " is: " + result);
    }

    private static int fibonnaci(int i) { //here i is the position in the fibonnaci series
        if(i ==1 || i ==2){
            return 1;
        }
        return fibonnaci(i -1) + fibonnaci(i -2);
        //visualize this as sum of previous two fibonnaci numbers
        //iteration steps:
        //fibonnaci(5) = fibonnaci(4) + fibonnaci(3)
        //fibonnaci(4) = fibonnaci(3) + fibonnaci(2)
        //fibonnaci(3) = fibonnaci(2) + fibonnaci(1)
        //fibonnaci(2) = 1
        //fibonnaci(1) = 1
        //so, fibonnaci(3) = 1 + 1 = 2
        //fibonnaci(4) = 2 + 1 = 3
        //fibonnaci(5) = 3 + 2 = 5
    }
}
//Q: Calculate the factorial of a number using recursion
class SubProg2 {
    public static void main(String[] args) {
        int n = 5; // Example input
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    private static int factorial(int i) { //here i is the number whose factorial we want to find
        if(i == 0){
            return 1;
        }
        return i * factorial(i -1);
        //visualize this as i * (i-1)!
        //iteration steps:
        //factorial(5) = 5 * factorial(4)
        //factorial(4) = 4 * factorial(3)
        //factorial(3) = 3 * factorial(2)
        //factorial(2) = 2 * factorial(1)
        //factorial(1) = 1 * factorial(0)
        //factorial(0) = 1
        //so, factorial(1) = 1 * 1 = 1
        //factorial(2) = 2 * 1 = 2
        //factorial(3) = 3 * 2 = 6
        //factorial(4) = 4 * 6 = 24
        //factorial(5) = 5 * 24 = 120

    }
}
//Q: Calculate the sum of first n natural numbers using recursion
class SubProg3 {
    public static void main(String[] args) {
        int n = 5; // Example input
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }

    private static int sum(int i) { //here i is the number up to which we want to find the sum of natural numbers
        if(i == 1){
            return 1;
        }
        return i + sum(i -1);
        //visualize this as i + sum of first (i-1) natural numbers
        //iteration steps:
        //sum(5) = 5 + sum(4)
        //sum(4) = 4 + sum(3)
        //sum(3) = 3 + sum(2)
        //sum(2) = 2 + sum(1)
        //sum(1) = 1
        //so, sum(2) = 2 + 1 = 3
        //sum(3) = 3 + 3 = 6
        //sum(4) = 4 + 6 = 10
        //sum(5) = 5 + 10 = 15

    }
}
//Q: Calculate n raised to the power of p using recursion
class SubProg4 {
    public static void main(String[] args) {
        int n = 5; // Example input
        int result = power(n, 3); // Example: n^3
        System.out.println(n + " raised to the power of 3 is: " + result);
    }

    private static int power(int n, int p) { //here n is the base and p is the exponent
        if(p == 0){
            return 1;
        }
        return n * power(n, p-1);
        //visualize this as n * n^(p-1)
        //iteration steps:
        //power(5,3) = 5 * power(5,2)
        //power(5,2) = 5 * power(5,1)
        //power(5,1) = 5 * power(5,0)
        //power(5,0) = 1
        //so, power(5,1) = 5 * 1 = 5
        //power(5,2) = 5 * 5 = 25
        //power(5,3) = 5 * 25 = 125
        //another example:
        //power(2,3) = 2 * power(2,2)
        //power(2,2) = 2 * power(2,1)
        //power(2,1) = 2 * power(2,0)
        //power(2,0) = 1
        //so, power(2,1) = 2 * 1 = 2
        //power(2,2) = 2 * 2 = 4
        //power(2,3) = 2 * 4 = 8

    }
}
//Q: Count the number of digits in a number using recursion
class SubProg5 {
    public static void main(String[] args) {
        int n = 5; // Example input
        int result = countDigits(n);
        System.out.println("Number of digits in " + n + " is: " + result);
    }

    private static int countDigits(int i) { //here i is the number whose digits we want to count
        if(i == 0){
            return 0;
        }
        return 1 + countDigits(i / 10);
        //visualize this as removing the last digit and counting 1 for it
        //iteration steps:
        //countDigits(5) = 1 + countDigits(0)
        //countDigits(0) = 0
        //so, countDigits(5) = 1 + 0 = 1
        //another example:
        //countDigits(123) = 1 + countDigits(12)
        //countDigits(12) = 1 + countDigits(1)
        //countDigits(1) = 1 + countDigits(0)
        //countDigits(0) = 0
        //so, countDigits(1) = 1 + 0 = 1
        //countDigits(12) = 1 + 1 = 2
        //countDigits(123) = 1 + 2 = 3
    }
}
//Q: Reverse a string using recursion
class SubProg6 {
    public static void main(String[] args) {
        String str = "hello"; // Example input
        String result = reverseString(str);
        System.out.println("Reversed string of " + str + " is: " + result);
    }

    private static String reverseString(String str) { //here str is the string we want to reverse
        if(str.isEmpty()){
            return str;
        }
        return str.charAt(str.length() -1) + reverseString(str.substring(0, str.length() -1));
        //visualize this as taking the last character and appending it to the reverse of the remaining string
        //iteration steps:
        //reverseString("hello") = 'o' + reverseString("hell")
        //reverseString("hell") = 'l' + reverseString("hel")
        //reverseString("hel") = 'l' + reverseString("he")
        //reverseString("he") = 'e' + reverseString("h")
        //reverseString("h") = 'h' + reverseString("")
        //reverseString("") = ""
        //so, reverseString("h") = 'h' + "" = "h"
        //reverseString("he") = 'e' + "h" = "eh"
        //reverseString("hel") = 'l' + "eh" = "leh"
        //reverseString("hell") = 'l' + "leh" = "lleh"
        //reverseString("hello") = 'o' + "lleh" = "olleh"
    }
}
//Q: Find the greatest common divisor (GCD) of two numbers using recursion
class SubProg7 {
    public static void main(String[] args) {
        int a = 56; // Example input
        int b = 98; // Example input
        int result = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }

    private static int gcd(int a, int b) { //here a and b are the two numbers whose GCD we want to find
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
        //visualize this as replacing a with b and b with a%b until b becomes 0
        //iteration steps:
        //gcd(56, 98) = gcd(98, 56)
        //gcd(98, 56) = gcd(56, 42)
        //gcd(56, 42) = gcd(42, 14)
        //gcd(42, 14) = gcd(14, 0)
        //gcd(14, 0) = 14
        //so, GCD of 56 and 98 is 14
    }
}
//Q: Solve the Tower of Hanoi problem using recursion
class SubProg8 {
    public static void main(String[] args) {
        int n = 3; // Example input
        System.out.println("Steps to solve Tower of Hanoi with " + n + " disks:");
        towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
    }

    private static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) { //here n is the number of disks, fromRod is the source rod, toRod is the destination rod and auxRod is the auxiliary rod
        if(n == 1){
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        towerOfHanoi(n -1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        towerOfHanoi(n -1, auxRod, toRod, fromRod);
        //visualize this as moving n-1 disks from source to auxiliary, then moving the nth disk from source to destination and finally moving the n-1 disks from auxiliary to destination
        //iteration steps for n=3:
        //towerOfHanoi(3, A, C, B)
        //towerOfHanoi(2, A, B, C)
        //towerOfHanoi(1, A, C, B)
        //Move disk 1 from rod A to rod C
        //Move disk 2 from rod A to rod B
        //towerOfHanoi(1, C, B, A)
        //Move disk 1 from rod C to rod B
        //Move disk 3 from rod A to rod C
        //towerOfHanoi(2, B, C, A)
        //towerOfHanoi(1, B, A, C)
        //Move disk 1 from rod B to rod A
        //Move disk 2 from rod B to rod C
        //towerOfHanoi(1, A, C, B)
        //Move disk 1 from rod A to rod C
    }
}
//Q: Check if a string is a palindrome using recursion
class SubProg9 {
    public static void main(String[] args) {
        String str = "madam"; // Example input
        boolean result = isPalindrome(str);
        System.out.println("Is the string \"" + str + "\" a palindrome? " + result);
    }

    private static boolean isPalindrome(String str) { //here str is the string we want to check
        if(str.length() <= 1){
            return true;
        }
        if(str.charAt(0) != str.charAt(str.length() -1)){
            return false;
        }
        return isPalindrome(str.substring(1, str.length() -1));
        //visualize this as checking the first and last characters and then checking the remaining substring
        //iteration steps for "madam":
        //isPalindrome("madam") -> 'm' == 'm' -> isPalindrome("ada")
        //isPalindrome("ada") -> 'a' == 'a' -> isPalindrome("d")
        //isPalindrome("d") -> length <= 1 -> true
        //so, "madam" is a palindrome
        //another example for "hello":
        //isPalindrome("hello") -> 'h' != 'o' -> false
        //so, "hello" is not a palindrome
    }
}
//Q: Find the sum of digits of a number using recursion
class SubProg10 {
    public static void main(String[] args) {
        int n = 123; // Example input
        int result = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + result);
    }

    private static int sumOfDigits(int i) { //here i is the number whose digits we want to sum
        if(i == 0){
            return 0;
        }
        return (i % 10) + sumOfDigits(i / 10);
        //visualize this as taking the last digit and adding it to the sum of the remaining digits
        //iteration steps for 123:
        //sumOfDigits(123) = 3 + sumOfDigits(12)
        //sumOfDigits(12) = 2 + sumOfDigits(1)
        //sumOfDigits(1) = 1 + sumOfDigits(0)
        //sumOfDigits(0) = 0
        //so, sumOfDigits(1) = 1 + 0 = 1
        //sumOfDigits(12) = 2 + 1 = 3
        //sumOfDigits(123) = 3 + 3 = 6
        //another example for 456:
        //sumOfDigits(456) = 6 + sumOfDigits(45)
        //sumOfDigits(45) = 5 + sumOfDigits(4)
        //sumOfDigits(4) = 4 + sumOfDigits(0)
        //sumOfDigits(0) = 0
        //so, sumOfDigits(4) = 4 + 0 = 4
        //sumOfDigits(45) = 5 + 4 = 9
        //sumOfDigits(456) = 6 + 9 = 15
    }
}
//Q: Print all permutations of a string using recursion
class SubProg11 {
    public static void main(String[] args) {
        String str = "ABC"; // Example input
        System.out.println("Permutations of the string \"" + str + "\":");
        printPermutations(str, "");
    }

    private static void printPermutations(String str, String ans) { //here str is the string whose permutations we want to print and ans is the current permutation being formed
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i +1); //ros = rest of string
            printPermutations(ros, ans + ch);
        }
        //visualize this as fixing one character and finding permutations of the remaining characters
        //iteration steps for "ABC":
        //printPermutations("ABC", "")
        //fix 'A', ros = "BC" -> printPermutations("BC", "A")
        //fix 'B', ros = "C" -> printPermutations("C", "AB")
        //fix 'C', ros = "" -> printPermutations("", "ABC") -> print "ABC"
        //backtrack to fix 'C' first, ros = "B" -> printPermutations("B", "AC")
        //fix 'B', ros = "" -> printPermutations("", "ACB") -> print "ACB"
        //backtrack to fix 'B' first, ros = "AC" -> printPermutations("AC", "B")
        //fix 'A', ros = "C" -> printPermutations("C", "BA")
        //fix 'C', ros = "" -> printPermutations("", "BAC") -> print "BAC"
        //backtrack to fix 'C' first, ros = "A" -> printPermutations("A", "BC")
        //fix 'A', ros = "" -> printPermutations("", "BCA") -> print "BCA"
        //backtrack to fix 'C' first, ros = "AB" -> printPermutations("AB", "C")
        //fix 'A', ros = "B" -> printPermutations("B", "CA")
        //fix 'B', ros = "" -> printPermutations("", "CAB") -> print "CAB"
        //backtrack to fix 'B' first, ros = "A" -> printPermutations("A", "CB")
        //fix 'A', ros = "" -> printPermutations("", "CBA") -> print "CBA"
    }
}
//Q: Find the nth term of an arithmetic progression using recursion
class SubProg12 {
    public static void main(String[] args) {
        int a = 2; // First term
        int d = 3; // Common difference
        int n = 5; // Example input
        int result = nthTermAP(a, d, n);
        System.out.println("The " + n + "th term of the arithmetic progression is: " + result);
    }

    private static int nthTermAP(int a, int d, int n) { //here a is the first term, d is the common difference and n is the term number we want to find
        if(n == 1){
            return a;
        }
        return d + nthTermAP(a, d, n -1);
        //visualize this as adding the common difference to the (n-1)th term
        //iteration steps for a=2, d=3, n=5:
        //nthTermAP(2, 3, 5) = 3 + nthTermAP(2, 3, 4)
        //nthTermAP(2, 3, 4) = 3 + nthTermAP(2, 3, 3)
        //nthTermAP(2, 3, 3) = 3 + nthTermAP(2, 3, 2)
        //nthTermAP(2, 3, 2) = 3 + nthTermAP(2, 3, 1)
        //nthTermAP(2, 3, 1) = 2
        //so, nthTermAP(2, 3, 2) = 3 + 2 = 5
        //nthTermAP(2, 3, 3) = 3 + 5 = 8
        //nthTermAP(2, 3, 4) = 3 + 8 = 11
        //nthTermAP(2, 3, 5) = 3 + 11 = 14
    }
}
//Q: Find the nth term of a geometric progression using recursion
class SubProg13 {
    public static void main(String[] args) {
        int a = 2; // First term
        int r = 3; // Common ratio
        int n = 5; // Example input
        int result = nthTermGP(a, r, n);
        System.out.println("The " + n + "th term of the geometric progression is: " + result);
    }

    private static int nthTermGP(int a, int r, int n) { //here a is the first term, r is the common ratio and n is the term number we want to find
        if(n == 1){
            return a;
        }
        return r * nthTermGP(a, r, n -1);
        //visualize this as multiplying the common ratio to the (n-1)th term
        //iteration steps for a=2, r=3, n=5:
        //nthTermGP(2, 3, 5) = 3 * nthTermGP(2, 3, 4)
        //nthTermGP(2, 3, 4) = 3 * nthTermGP(2, 3, 3)
        //nthTermGP(2, 3, 3) = 3 * nthTermGP(2, 3, 2)
        //nthTermGP(2, 3, 2) = 3 * nthTermGP(2, 3, 1)
        //nthTermGP(2, 3, 1) = 2
        //so, nthTermGP(2, 3, 2) = 3 * 2 = 6
        //nthTermGP(2, 3, 3) = 3 * 6 = 18
        //nthTermGP(2, 3, 4) = 3 * 18 = 54
        //nthTermGP(2, 3, 5) = 3 * 54 = 162
    }
}
//Q: Find the maximum element in an array using recursion
class SubProg14 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 2}; // Example input
        int result = findMax(arr, arr.length);
        System.out.println("The maximum element in the array is: " + result);
    }

    private static int findMax(int[] arr, int n) { //here arr is the array and n is the number of elements in the array
        if(n == 1){
            return arr[0];
        }
        return Math.max(arr[n -1], findMax(arr, n -1));
        //visualize this as comparing the last element with the maximum of the remaining elements
        //iteration steps for arr={1,5,3,9,2}, n=5:
        //findMax(arr, 5) = max(2, findMax(arr, 4))
        //findMax(arr, 4) = max(9, findMax(arr, 3))
        //findMax(arr, 3) = max(3, findMax(arr, 2))
        //findMax(arr, 2) = max(5, findMax(arr, 1))
        //findMax(arr, 1) = 1
        //so, findMax(arr, 2) = max(5, 1) = 5
        //findMax(arr, 3) = max(3, 5) = 5
        //findMax(arr, 4) = max(9, 5) = 9
        //findMax(arr, 5) = max(2, 9) = 9
    }
}
//Q: Convert a decimal number to binary using recursion
class SubProg15 {
    public static void main(String[] args) {
        int n = 10; // Example input
        String result = decimalToBinary(n);
        System.out.println("The binary representation of " + n + " is: " + result);
    }

    private static String decimalToBinary(int n) { //here n is the decimal number we want to convert to binary
        if(n == 0){
            return "";
        }
        return decimalToBinary(n / 2) + (n % 2);
        //visualize this as dividing the number by 2 and appending the remainder
        //iteration steps for n=10:
        //decimalToBinary(10) = decimalToBinary(5) + "0"
        //decimalToBinary(5) = decimalToBinary(2) + "1"
        //decimalToBinary(2) = decimalToBinary(1) + "0"
        //decimalToBinary(1) = decimalToBinary(0) + "1"
        //decimalToBinary(0) = ""
        //so, decimalToBinary(1) = "" + "1" = "1"
        //decimalToBinary(2) = "1" + "0" = "10"
        //decimalToBinary(5) = "10" + "1" = "101"
        //decimalToBinary(10) = "101" + "0" = "1010"
    }
}
//Q: Calculate the sum of an array using recursion
class SubProg16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example input
        int result = sumOfArray(arr, arr.length);
        System.out.println("The sum of the array is: " + result);
    }

    private static int sumOfArray(int[] arr, int n) { //here arr is the array and n is the number of elements in the array
        if(n == 0){
            return 0;
        }
        return arr[n -1] + sumOfArray(arr, n -1);
        //visualize this as adding the last element to the sum of the remaining elements
        //iteration steps for arr={1,2,3,4,5}, n=5:
        //sumOfArray(arr, 5) = 5 + sumOfArray(arr, 4)
        //sumOfArray(arr, 4) = 4 + sumOfArray(arr, 3)
        //sumOfArray(arr, 3) = 3 + sumOfArray(arr, 2)
        //sumOfArray(arr, 2) = 2 + sumOfArray(arr, 1)
        //sumOfArray(arr, 1) = 1 + sumOfArray(arr, 0)
        //sumOfArray(arr, 0) = 0
        //so, sumOfArray(arr, 1) = 1 + 0 = 1
        //sumOfArray(arr, 2) = 2 + 1 = 3
        //sumOfArray(arr, 3) = 3 + 3 = 6
        //sumOfArray(arr, 4) = 4 + 6 = 10
        //sumOfArray(arr, 5) = 5 + 10 = 15
    }
}
//Q: Find the length of a string using recursion
class SubProg17 {
    public static void main(String[] args) {
        String str = "hello"; // Example input
        int result = stringLength(str);
        System.out.println("The length of the string \"" + str + "\" is: " + result);
    }

    private static int stringLength(String str) { //here str is the string whose length we want to find
        if(str.isEmpty()){
            return 0;
        }
        return 1 + stringLength(str.substring(1));
        //visualize this as removing the first character and counting 1 for it
        //iteration steps for "hello":
        //stringLength("hello") = 1 + stringLength("ello")
        //stringLength("ello") = 1 + stringLength("llo")
        //stringLength("llo") = 1 + stringLength("lo")
        //stringLength("lo") = 1 + stringLength("o")
        //stringLength("o") = 1 + stringLength("")
        //stringLength("") = 0
        //so, stringLength("o") = 1 + 0 = 1
        //stringLength("lo") = 1 + 1 = 2
        //stringLength("llo") = 1 + 2 = 3
        //stringLength("ello") = 1 + 3 = 4
        //stringLength("hello") = 1 + 4 = 5
    }
}
//Q: Find the minimum element in an array using recursion
class SubProg18 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, -9, 2}; // Example input
        int result = findMin(arr, arr.length);
        System.out.println("The minimum element in the array is: " + result);
    }

    private static int findMin(int[] arr, int n) { //here arr is the array and n is the number of elements in the array
        if(n == 1){
            return arr[0];
        }
        return Math.min(arr[n -1], findMin(arr, n -1));
        //visualize this as comparing the last element with the minimum of the remaining elements
        //iteration steps for arr={1,5,3,-9,2}, n=5:
        //findMin(arr, 5) = min(2, findMin(arr, 4))
        //findMin(arr, 4) = min(-9, findMin(arr, 3))
        //findMin(arr, 3) = min(3, findMin(arr, 2))
        //findMin(arr, 2) = min(5, findMin(arr, 1))
        //findMin(arr, 1) = 1
        //so, findMin(arr, 2) = min(5, 1) = 1
        //findMin(arr, 3) = min(3, 1) = 1
        //findMin(arr, 4) = min(-9, 1) = -9
        //findMin(arr, 5) = min(2, -9) = -9
    }
}
//Q: Check if an array is sorted using recursion
class SubProg19 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example input
        boolean result = isSorted(arr, arr.length);
        System.out.println("Is the array sorted? " + result);
    }

    private static boolean isSorted(int[] arr, int n) { //here arr is the array and n is the number of elements in the array
        if(n == 1 || n == 0){
            return true;
        }
        if(arr[n -1] < arr[n -2]){
            return false;
        }
        return isSorted(arr, n -1);
        //visualize this as checking if the last element is greater than or equal to the second last element and then checking the remaining elements
        //iteration steps for arr={1,2,3,4,5}, n=5:
        //isSorted(arr, 5) -> 5 >= 4 -> isSorted(arr, 4)
        //isSorted(arr, 4) -> 4 >= 3 -> isSorted(arr, 3)
        //isSorted(arr, 3) -> 3 >= 2 -> isSorted(arr, 2)
        //isSorted(arr, 2) -> 2 >= 1 -> isSorted(arr, 1)
        //isSorted(arr, 1) -> true
        //so, the array is sorted
        //another example for arr={1,3,2,4,5}, n=5:
        //isSorted(arr, 5) -> 5 >= 4 -> isSorted(arr, 4)
        //isSorted(arr, 4) -> 4 >= 2 -> isSorted(arr, 3)
        //isSorted(arr, 3) -> 2 < 3 -> false
        //so, the array is not sorted
    }
}
//Q: Find the first occurrence of an element in an array using recursion
class SubProg20 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5}; // Example input
        int x = 2; // Element to find
        int result = firstOccurrence(arr, arr.length, x);
        if(result == -1){
            System.out.println("Element " + x + " not found in the array.");
        } else {
            System.out.println("The first occurrence of element " + x + " is at index: " + result);
        }
    }

    private static int firstOccurrence(int[] arr, int n, int x) { //here arr is the array, n is the number of elements in the array and x is the element we want to find
        if(n == 0){
            return -1;
        }
        if(arr[n -1] == x){
            return n -1;
        }
        return firstOccurrence(arr, n -1, x);
        //visualize this as checking if the last element is equal to x and then checking the remaining elements
        //iteration steps for arr={1,2,3,2,5}, n=5, x=2:
        //firstOccurrence(arr, 5, 2) -> arr[4] != 2 -> firstOccurrence(arr, 4, 2)
        //firstOccurrence(arr, 4, 2) -> arr[3] == 2 -> return 3
        //so, the first occurrence of element 2 is at index 3
        //another example for arr={1,3,4,5}, n=4, x=2:
        //firstOccurrence(arr, 4, 2) -> arr[3] != 2 -> firstOccurrence(arr, 3, 2)
        //firstOccurrence(arr, 3, 2) -> arr[2] != 2 -> firstOccurrence(arr, 2, 2)
        //firstOccurrence(arr, 2, 2) -> arr[1] != 2 -> firstOccurrence(arr, 1, 2)
        //firstOccurrence(arr, 1, 2) -> arr[0] != 2 -> firstOccurrence(arr, 0, 2)
        //firstOccurrence(arr, 0, 2) -> return -1
        //so, element 2 is not found
    }
}
//Q: Find the last occurrence of an element in an array using recursion
class SubProg21 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5}; // Example input
        int x = 2; // Element to find
        int result = lastOccurrence(arr, arr.length, x);
        if(result == -1){
            System.out.println("Element " + x + " not found in the array.");
        } else {
            System.out.println("The last occurrence of element " + x + " is at index: " + result);
        }
    }

    private static int lastOccurrence(int[] arr, int n, int x) { //here arr is the array, n is the number of elements in the array and x is the element we want to find
        if(n == 0){
            return -1;
        }
        if(arr[n -1] == x){
            return n -1;
        }
        return lastOccurrence(arr, n -1, x);
        //visualize this as checking if the last element is equal to x and then checking the remaining elements
        //iteration steps for arr={1,2,3,2,5}, n=5, x=2:
        //lastOccurrence(arr, 5, 2) -> arr[4] != 2 -> lastOccurrence(arr, 4, 2)
        //lastOccurrence(arr, 4, 2) -> arr[3] == 2 -> return 3
        //so, the last occurrence of element 2 is at index 3
        //another example for arr={1,3,4,5}, n=4, x=2:
        //lastOccurrence(arr, 4, 2) -> arr[3] != 2 -> lastOccurrence(arr, 3, 2)
        //lastOccurrence(arr, 3, 2) -> arr[2] != 2 -> lastOccurrence(arr, 2, 2)
        //lastOccurrence(arr, 2, 2) -> arr[1] != 2 -> lastOccurrence(arr, 1, 2)
        //lastOccurrence(arr, 1, 2) -> arr[0] != 2 -> lastOccurrence(arr, 0, 2)
        //lastOccurrence(arr, 0, 2) -> return -1
        //so, element 2 is not found


}
}
//Q: Print the Fibonacci series up to n terms using recursion
class SubProg22 {
    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Fibonacci series up to " + n + " terms:");
        for(int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int n) { //here n is the term number we want to find
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacci(n -1) + fibonacci(n -2);
        //visualize this as the sum of the two preceding terms
        //iteration steps for n=5:
        //fibonacci(0) = 0
        //fibonacci(1) = 1
        //fibonacci(2) = fibonacci(1) + fibonacci(0) = 1 + 0 = 1
        //fibonacci(3) = fibonacci(2) + fibonacci(1) = 1 + 1 = 2
        //fibonacci(4) = fibonacci(3) + fibonacci(2) = 2 + 1 = 3
        //so, the Fibonacci series up to 5 terms is: 0, 1, 1, 2, 3
    }
}

