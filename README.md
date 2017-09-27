# Scala_Lab1

1.Define a Scala function called circleArea that will calculate the area of a circle. The function will be passed the radius of the circle.  (A = π*r2)


2.Define a Scala function called hypotenuse, which takes two arguments. The two arguments are numbers, which represent the lengths of the legs of a right triangle. The function returns a number representing the length of the hypotenuse of the right triangle.

Your answer should be a decimal, NOT a fraction.
    	
      > hypotenuse(3, 4)
    	5.0
    	> hypotenuse (9, 16)
    	18.35755975068582
 
3.Write a Scala function called reverseDigits, which will take in an integer (positive or negative) and return it as an integer with the digits reversed. The sign should not be changed. (Hint: Use remainder and quotient.)

      > reverse-digits( 123)
    	321
    	> reverse-digits( -42)
    	-24

4.Write a Scala function called conditionalRemove that takes a list and an element and returns a list with the last element removed if it equals the element passed in as a parameter. If the list does not end in the element passed as a parameter, the list is returned.    	


      > conditional-remove("a", List("b", "c", "d", "e", "a", "g", "a"))
    	List("b" , "c",  "d" ,"e", "a" ,"g")
      > conditional-remove ("a", List("b", "c", "d", "e", "a", "g", "a"))
    	List(b c d e a g)


5.Write a Scala function called isPalindrome? that takes a String, Int, or List and determines if it is a palindrome (i.e., the same forwards and backwards). The comparison should be case-insensitive (i.e., case does NOT matter). Spaces and punctuation should be ignored.  

    > isPalindrome( 12321)
          true
      > isPalindrome( "racecar")
          true
          > isPalindrome( "mom")
          true
    > isPalindrome( "Mammam")
          true
    > isPalindrome( "Yo Momma")
          false
      > isPalindrome( “rats! live on no evil star.” )
      true

6.Write a Scala function called isPerfectNumber that takes an integer and returns a tuple containing a Boolean and a List of Ints. The Boolean represents the “perfectness” of the number. (i.e., the sum of its divisors except itself is the number). The list should be the the divisors excluding the numbers. For example 6 is a perfect number. Its divisors are {1, 2, 3, 6}. Excluding itself the sum of 1, 2, and 3 is 6.    	

      > isPerfectNumber(6)
    	(true, List( 1, 2, 3))
    	> isPerfectNumber(7)
    	(false,List(1))


7.Write a Scala class to represent a ComplexNumber, i.e., a number with a real and an imaginary part. Define the standard arithmetic operation on the class: Add, Subtract, Multiply, Divide, Conjugate, Reciprocal, and Abs.  


8.Write a Scala object named Stats with the following functions that accepts a list of Doubles. (You may not use built-in functions that compute these functions for you.)

            mean(List(Doubles…))
            min(List(Doubles…))
            max(List(Doubles…))
            mode(List(Doubles…))
            median(List(Doubles…))

9.Write an object named FoldStats with the following functions implemented using the fold functions of Scala. (You may not use built-in functions that compute these functions for you.)

      mean(List(Doubles…))
      min(List(Doubles…))
      max(List(Doubles…))


