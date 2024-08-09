//SumInlineExpression.kt
//Fri, 09-08-2024

/*Kotlin program to calculate sum of two numbers using Inline expression method.
*/

fun findAddition(){
    val num1 = 20
    val num2 = 30
    
    println("First number is: $num1")
    println("Second number is: $num2")

    //calculate sum
    val sum = num1 + num2 //Inline expression

    //print result
    println("The sum of $num1 and $num2 is: $sum")
}

fun main(){
    //call function
    findAddition()
}