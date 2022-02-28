package collections

import Person

fun main() {
    val canBeInClub27 = { person: Person -> person.lessThan27() }

    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.all(canBeInClub27)) // false

    println(people.any(canBeInClub27)) // true
}