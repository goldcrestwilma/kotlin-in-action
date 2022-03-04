package convention

import java.math.BigDecimal

fun main() {
    val p = Point(10, 20)
    println(-p)

    var bigDecimal = BigDecimal.ZERO
    println(++bigDecimal)
}