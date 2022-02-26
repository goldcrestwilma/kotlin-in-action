fun main() {
    val result = Sum(Num(3), Num(7))
    println(eval(result))
}

interface Expression

class Num(val value: Int) : Expression

class Sum(
    val left: Expression,
    val right: Expression,
) : Expression

fun eval(e: Expression): Int =
    when (e) {
        is Num ->
            e.value // smart cast after check type(is)
        is Sum ->
            eval(e.left) + eval(e.right)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }
