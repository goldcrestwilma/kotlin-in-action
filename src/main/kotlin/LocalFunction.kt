fun main() {
    User("1", "Joe", "").saveUser()
}

fun User.saveUser() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${id}: empty $fieldName")
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}

data class User(
    val id: String,
    val name: String,
    val address: String,
)