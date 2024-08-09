//SumFunction.kt
//Fri, 09-08-2024

/*
Kotlin program to calculate sum of two numbers using function.
*/

fun sum(num1: Int, num2: Int): Int{
    return num1 + num2
}

fun main() {
    val num1 = 10
    val num2 = 20
    
    println("First number is: $num1")
    println("Second number is: $num2")

    //call function
    val result = sum(num1, num2)

    //print result
    println("The sum of $num1 and $num2 is: $result")
}