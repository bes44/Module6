package typesConversion

/**
 * 1. Дана строка, содержащая в себе значение 12.3. Преобразовать ее в целое число, число с плавающей точкой,
 * число в двоичной системе представления и вывести в консоль. Для части преобразований, например,
 * в двоичное представление, необходимо сделать несколько преобразований, чтобы целое число перевести в двоичное.
 * 2. Написать функцию, которая проверяет чем, является вводимый аргумент строкой, числом, числом с плавающей точкой,
 * символом. Ввод должен быть таким: «Это строка».
 * 3. Написать функцию, которая на вход принимает типизированный параметр. Если это будет целое число,
 * то в консоль вывести сумму вводимого числа и единицы, если строка - сумму длины строки и единицы,
 * если массив целых чисел - сумму элементов массива.
 */
fun checkType(input: Any) {
    when (input) {
        is String -> println("${input.toString()} - Это строка")
        is Int -> println("${input.toString()} - Это целое число")
        is Double -> println("${input.toString()} - Это число с плавающей точкой")
        is Float -> println("${input.toString()} - Это число с плавающей точкой")
        is Char -> println("${input.toString()} - Это символ")
        is Boolean -> println("${input.toString()} - Это булево значение")
        else -> println("${input.toString()} - Неизвестный тип")
    }
}

fun <T> processInput(input: T) {
    when (input) {
        is Int -> println("Сумма вводимого числа и единицы: ${input + 1}")
        is String -> println("Сумма длины строки и единицы: ${input.length + 1}")
        is Array<*> -> {
            if (input.all { it is Int }) {
                println("Сумма элементов массива: ${(input as Array<Int>).sum()}")
            } else {
                println("Массив содержит не только целые числа.")
            }
        }

        else -> println("Тип данных не поддерживается")
    }
}

fun main() {
    println("Задание 1")
    val str = "12.3"
    val floatValue = str.toDoubleOrNull()
    println("Число с плавающей точкой: $floatValue")
    val intValue = floatValue?.toInt()
    println("Целое число: $intValue")
    val binaryValue = intValue?.let { Integer.toBinaryString(it) }
    println("Число в двоичной системе: $binaryValue")

    println("Задание 2")
    val testInputs = listOf<Any>("Довод", 42, 3.14, -6.5, 'A', true, listOf(10, 16, 3))
    for (input in testInputs) {
        checkType(input)
    }

    println("Задание 3")
    processInput(5)
    processInput("Привет")
    processInput(arrayOf(1, 2, 3, 4, 5))
    processInput(arrayOf("a", "b", "c"))
}
