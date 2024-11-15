package classString

/**
 * 1. Дана строка «Занятие». Вывести на экран символы, составляющие данную строку.
 * 2. Нужно осуществить проверку номера телефона. Он должен начинаться с +7 и содержать 10 цифр,
 * не считая +7. Если телефон верно введен, выведите true, иначе false.
 * 3. Дана строка. Вывести символы, составляющие эту строку, но в обратном порядке.
 * 4. Дана строка «kotlin2023course». Подсчитать количество содержащихся в ней цифр.
 */

fun isValidPhoneNumber(phoneNumber: String): Boolean {
    val regex = Regex("^\\+7\\d{10}$")
    return regex.matches(phoneNumber)
}

fun printChar(str : String){
    for (char in str) {
        println(char)
    }
}

fun countDigits(str: String): Int {
    return str.count { it.isDigit() }
}

fun main() {
    println("Задание 1")
    val str = "Занятие"
    printChar(str)
    println("Задание 2")
    val phoneNumber1 = "+71234567890"
    val phoneNumber2 = "81234567890"
    println("Телефон $phoneNumber1 - верный: ${isValidPhoneNumber(phoneNumber1)}")
    println("Телефон $phoneNumber2 - верный: ${isValidPhoneNumber(phoneNumber2)}")
    println("Задание 3")
    val reversedStr = str.reversed()
    printChar(reversedStr)
    println("Задание 4")
    val input = "kotlin2023course"
    val digitCount = countDigits(input)
    println("Количество цифр в строке: $digitCount")
}
