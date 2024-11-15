package generalizedClassesFunctions

/**
 * 1. Написать функцию print(), которая на вход может принимать различные типы. Вызвать эту функцию несколько раз, поместив аргументы разных типов.
 * 2. Создать класс параметризованный класс Person, у которого свойство номера телефона в конструкторе может передаваться по – разному,
 * как в виде числа, так и в виде строки. Создать Два экземпляра Person, поле телефона заполнить у первого числами, у второго строкой.
 * Вывести полученную информацию о них. Person: name = имя, phone = телефон
 * 3. Написать функцию вывода в консоль переменных разных типов данных. Вторым параметром в функции будет тип Char и будет представлять то,
 * во что будет оборачиваться переменная параметризованного типа, поступающая на вход в качестве первого параметра.
 * Например, переменная Int должна оборачиваться в фигурные скобки. Пример ввода данных и полученного результата должен быть таким:
 * val a: Int = 10 -> {10}
 * val b: String = "Hello" -> [ Hello]
 * val c: List<Int> = listOf(10, 16, 3) -> "[10, 16, 3]"
 * val d = 'f' -> (f)
 */
//fun checkIfArray(value: Any): Boolean {
//    return value is Array<*>
//}


inline fun <reified T> print(value: T) {
    if (value is Array<*>) {
        println("Массив: ${value.contentToString()}, тип элементов: ${T::class.simpleName}")
    } else {
        println("Значение: $value, тип: ${T::class.simpleName}")
    }
}

fun <T> wrapAndPrint(value: T, wrapper: Char) {
       val wrappedValue = when (wrapper) {
            '{' -> "{$value}"
            '[' -> "[$value]"
            '(' -> "($value)"
            else -> "$value"
        }
    println(wrappedValue)
}
    fun main() {
        println("Задание 1")
        print(42)
        print("Привет")
        print(true)
        print(listOf(1, 2))
        print(arrayOf(1, 2, 3))

        println("Задание 2")
        val person1 = Person("Иван", +71234567890)
        val person2 = Person("Марья", "+7 (999) 123-45-67")
//       val person3 = Person("Инкогнито", null)
        println(person1)
        println(person2)
   //     println(person3)
        println("Задание 3")
        val a = 10
        val b = "Hello"
        val c: List<Int> = listOf(10, 16, 3)
        val d = 'f'
        wrapAndPrint(a, '{')
        wrapAndPrint(b, '[')
        wrapAndPrint(c, ' ')
        wrapAndPrint(d, '(')

    }