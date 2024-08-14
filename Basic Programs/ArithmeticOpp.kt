//ArithmeticOpp.kt
//Wed, 14-08-2024


/*
Kotlin program that perform all arithmetic operation between two numbers.
*/

fun main(){
    val num1 = 10
    val num2 = 5

    println("First number is: $num1")
    println("Second number is: $num2")

    //Calculate sum using inline expression
    val sum = num1 + num2
    //Calculate difference
    val difference = num1 - num2
    //Calculate product
    val product = num1 * num2
    //Calculate division
    val division = (num1.toFloat()) / (num2.toFloat())
    //Calculate modulus
    val modulus = (num1.toFloat()) % (num2.toFloat())

    // print result
    println("Sum = $sum")
    println("Difference = $difference")
    println("Product = $product")
    println("Division = $division")
    println("Modulus = $modulus")
}