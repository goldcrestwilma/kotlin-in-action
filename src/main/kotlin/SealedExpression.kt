fun main() {
    val result = SealedSum(SealedNum(3), SealedNum(7))
    println(evaluate(result))
}

sealed class SealedExpression

class SealedNum(val value: Int) : SealedExpression()

class SealedSum(
    val left: SealedExpression,
    val right: SealedExpression,
) : SealedExpression()

fun evaluate(e: SealedExpression): Int =
    when (e) {
        is SealedNum -> e.value
        is SealedSum -> evaluate(e.left) + evaluate(e.right)
    }
