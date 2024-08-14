//RectanglePerimeter.kt
//Wed, 14-08-2024

/*
Kotlin program to find the perimeter of a rectangle.
*/

fun findRecPerimeter(){
    val length = 5
    val width = 10

    println("Rectangle length = $length")
    println("Rectangle width = $width")

    //calculate perimeter of a rectangle
    val result = 2 * (length.toFloat() + width.toFloat())

    //print result
    println("Perimeter of a rectangle = $result")
}

fun main(){
    //call function
    findRecPerimeter()
}