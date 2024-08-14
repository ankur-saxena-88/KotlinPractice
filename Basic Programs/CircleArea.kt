//CircleArea.kt
//Wed, 14-08-2024
/*
Kotlin program to find the diameter, circumference and area of a circle.
*/

fun circleArea(num: Int, pi: Float): Float{
    return pi * (num * num)
}

fun main(){
    val radius: Int = 12
    val pi = 3.142F

    println("Circle radius = $radius")

    //calculate circle diameter
    val diameter: Float = 2 * radius.toFloat()
    println("Circle diameter = $diameter")
    //calculate circle circumference
    val circumference: Float = 2 * pi * radius.toFloat()
    println("Circle circumference = $circumference")
    //calculate circle area
    val area: Float = circleArea(radius, pi)
    println("Circle area = $area")
}
