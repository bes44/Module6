package exceptionsLessson

class UserCatalog(private val capacity: Int = 10) {
    private val users = arrayOfNulls<String>(capacity)
    fun greeting() {
        println("Добро пожаловать в каталог пользователей!")
    }

    fun createList() {
        try {
            println("Введите имя и фамилию (через пробел):")
            val input = readlnOrNull()?.trim() ?: throw MyException("Имя не может быть пустым")
            if (input.isBlank()) throw MyException("Имя не может быть пустым")
            println ("Введите номер позиции в каталоге (0-${capacity - 1}):")
            val position = readlnOrNull()?.toIntOrNull() ?: throw MyException("Некорректный ввод позиции")
            if (position !in 0 until capacity) throw MyException("Позиция за пределами допустимого диапазона")
            if (users[position] != null) {
                println("На позиции $position уже есть пользователь: ${users[position]}")
                println ("Вы хотите заменить его? (да/нет)")
                val replace = readlnOrNull()?.toLowerCase() == "да"
                if (!replace) return
            }
            users [position] = input
            println ("Пользователь добавлен на позицию $position")
        } catch (e: MyException) {
            println("Ошибка: ${e.message}")
        } catch (e: Exception) {
            println("Произошла неожиданная ошибка: ${e.message}")
        }
    }

    fun printCatalog() {
        println("Текущий каталог пользователей:")
        users.forEachIndexed { index, user -> println("Позиция $index: ${user ?: "пусто"}") }
    }
}