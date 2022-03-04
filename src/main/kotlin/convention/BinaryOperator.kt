package convention

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)

    println(p1 + p2)

    println(p1 * 1.5)

    println('a' * 3)

    // compound assignment (only var)
    var point = Point(1, 2)
    point += Point(3, 4)
    println(point)

    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[0])
}