//RectangleArea.kt
//Wed, 14-08-2024

/*
Kotlin program to calculate the area of a rectangle.
*/

fun findRectArea(){
    val length = 72
    val width = 23

    println("Rectangle length = $length")
    println("Rectangle width = $width")

    //calculate rectangle area
    val area = length.toFloat() * width.toFloat()

    //print result
    println("The area of a rectangle = $area")
}

fun main(){
    //call function
    findRectArea()
}
