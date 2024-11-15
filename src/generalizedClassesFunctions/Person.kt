package generalizedClassesFunctions

class Person<T>(val name: String, var phone: T) {
    init {
        require(phone != null) { "Номер телефона не должен быть пустым." }
    }

    override fun toString(): String {
        return "Person: name = $name, phone = $phone"
    }
}