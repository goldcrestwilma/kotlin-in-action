data class Person(
    val name: String,
    val age: Int,
) {
    fun lessThan27() = age <= 27
}