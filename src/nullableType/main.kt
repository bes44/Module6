package nullableType

/**
 * 1. Написать функцию, которая выводит в консоль Вашу любимую книгу.
 * Входной параметр – название книги. Если в аргументы передается значение null, вывести фразу «У меня нет любимой книги».
 * 2. Создайте функцию, которая возвращает сколько раз целое число может быть разделено на другое целое число без остатка.
 * Функция должна возвращать null, если результатом деления является не целое число. Назовите функцию DivideIfWhole.
 * Дополнительно написать решение, в случае, когда нет ни одного деления без остатка – вывести ноль. Рефакторинг сделать с применением оператора ?:
 * 3. Дан массив строк array = arrayOf("Привет","как", null, "дела"). Создать новый массив,
 * который будет состоять из элементов массива array, которые не являютсяnull. Вывести их в консоль.
 */

fun printFavoriteBook(bookTitle: String?) {
    if (bookTitle != null) {
        println("Моя любимая книга: $bookTitle")
    } else {
        println("У меня нет любимой книги")
    }
}

fun divideIfWhole(numerator: Int, denominator: Int): Int? {
    return if (denominator != 0 && numerator % denominator == 0) {
        numerator / denominator
    } else {
        null
    }
}


fun main() {
    println("Задание 1")
    val favoriteBook = "Мастер и Маргарита"
    printFavoriteBook(favoriteBook)
    printFavoriteBook(null)

    println("Задание 2")
    println(divideIfWhole(10, 2) ?: 0)
    println(divideIfWhole(10, 4) ?: 0)
    println(divideIfWhole(10, 0) ?: 0)


    println("Задание 3")
    val array = arrayOf("Привет", "как", null, "дела")
    val nonNullArray = array.filterNotNull().toTypedArray()
    println("Новый массив без null: ${nonNullArray.joinToString(", ")}")
}
