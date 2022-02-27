package strings

fun main() {
    println("Kotlin".lastChar())

// Receiver Type: String
// Receiver Object: this("Kotlin")
}

fun String.lastChar(): Char = get(length - 1)
// this 생략 가능
//fun String.lastChar(): Char = this[this.length - 1]
