package lambdaExpressions

/**
 * 1. Напишите функцию, которая запускает лямбду print() столько раз сколько будет указано в параметре count.
 * Например, чтобы передаваемое сообщение в print() выводилось count раз.
 * 2. Напишите программу, реализующую лямбда-выражение для вычисления среднего арифметического списка чисел.
 * 3. Дан массив произвольного набора чисел. Отфильтруйте его, чтобы в нем остались только положительные числа.
 * 4. Напишите программу, которая реализует лямбда-выражение для работы с массивом целых чисел таким образом, что его четные элементы делятся на 2, нечетные – умножаются на 3.
 */
fun repeatAction(count: Int, print: () -> Unit) {
    repeat(count) {
        print()
    }
}

fun main() {
    println("Задание 1")
    repeatAction(5) {
        println("Это сообщение выводится 5 раз")
    }
    println("Задание 2")
    val numbers = listOf(4, 8, 15, 16, 23, 42)
    val average = { list: List<Int> ->
        if (list.isEmpty()) 0.0
        else list.sum().toDouble() / list.size
    }
    val  result = average(numbers)
    println("Среднее арифметическое списка: $result")
    println("Задание 3")
    val numbersArr = arrayOf(-3, 5, -1, 9, -8, 3, 0, 7, -2)
    val positiveNumbers = numbersArr.filter { it > 0 }.toTypedArray()
    println("Положительные числа: ${positiveNumbers.joinToString(", ")}")
    println("Задание 4")
    val numbersP = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val processNumbers: (Array<Int>) -> Array<Int> =
        { array -> array.map { if (it % 2 == 0) it / 2
                              else it * 3 }.toTypedArray() }
    val result2 = processNumbers(numbersP)
    println ("Обработанный массив: ${result2.joinToString(", ")}")
}
