//VariableDemo.kt
//Mon, 05-08-2024

//Kotlin program to demonstrate use variables

fun main(){

    var age = 36 //Mutable variable
    //Value of the variable can be changed later
    val name = "Ankur Saxena" //Immutable variable
    //Read-only variable; Value cannot be changed once assigned

    //printing values
    println("Name: $name") //`$name` -> String interpolation
    println("Age: $age")

    //String Interpolation
    //`$` symbol -> to denote variables
    //`${variableName/expression}` -> to denote expression

    age = 37 //changing the value of `age`
    println("Updated age: $age")
}
