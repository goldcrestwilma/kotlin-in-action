import java.io.BufferedReader
import java.io.StringReader

fun main() {
    println(isLetter('&'))

    val reader = BufferedReader(StringReader("abc"))
    readNumber(reader)
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: java.lang.NumberFormatException) {
        return // 아래 코드 실행되지 않음
    }
    println(number)
}