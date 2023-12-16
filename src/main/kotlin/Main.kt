import kotlin.math.pow
import kotlin.math.sqrt

class Point(val x: Double, val y: Double)

fun distanceBetweenPoints(point1: Point, point2: Point): Double {
    val distance = sqrt((point2.x - point1.x).pow(2) + (point2.y - point1.y).pow(2))
    return distance
}

fun main() {
    val pointA = Point(3.0, 4.0)
    val pointB = Point(6.0, 8.0)

    val distance = distanceBetweenPoints(pointA, pointB)
    println(" дистанция спереди точки А от точки В на $distance")
}