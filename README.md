# Calculator
A simple java program to calculate sum,difference,multiplication,division of two entered numbers as well as perform operations like sum, standard deviation and variance of entered array elements.
This program contains 3 classes:

1. Main: In the main class we have declare the number and result array. We have also created objects of two other classes namely userinput and calculator. It further contains a switch case to perform operations based on the operator entered by the user. In each case the input of required numbers is asked, calculation is performed and the result is stored. Then the result is printed.

2. UserInput: In this class, we input the operator, two numbers for performing =,-,* and / (storing them in numbers array) and create an array of the required size and input the array elements. This is done with the help of scanner class and Buffer Reader.

3. Calculator: This file contains various methods for performing the main calculations.These methods are as follows:

i) performAddition: adds the two elements of numbers array and store them in result array.

ii) performSubtraction: subtracts the two elements of numbers array and store them in result array.

iii) performMultiplication: multiplies the two elements of numbers array and store them in result array.

iv) performDivision: Divides the two elements of numbers array and store them in result array.

v)performArrayOperations: This methods contains the formulas for adding all the elements of an array, finding their standard deviation and variance.  
