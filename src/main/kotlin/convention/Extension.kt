package convention

operator fun Point.times(scale: Double): Point =
    Point((x * scale).toInt(), (y * scale).toInt())

operator fun Char.times(count: Int): String =
    toString().repeat(count)

/*
operator fun <T> MutableCollection<T>.plusAssign(element: T) {
    this.add(element)
}
 */

operator fun Point.unaryMinus(): Point =
    Point(-x, -y)

//operator fun BigDecimal.inc() = this + BigDecimal.ONE
operator fun Point.get(index: Int): Int =
    when (index) {
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
