//SumSingleExpression.kt
//Fri, 09-08-2024

/*
Kotlin program to calculate sum of two numbers using Single expression method.
*/

fun sum(num1: Int, num2: Int) = num1 + num2 // single expression

fun main(){
    val num1 = 15
    val num2 = 16

    println("First number is: $num1")
    println("Second number is: $num2")

    val result = sum(num1, num2)
    println("The sum of $num1 and $num2 is: $result")
}