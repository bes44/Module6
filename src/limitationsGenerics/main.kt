package limitationsGenerics
/*
1. Создать обобщенный класс States, который содержит функцию getAverage(), возвращающую среднее значение массива чисел.
 Класс имеет ограничение, работать может только с числовыми значениями, T:Number.
2. Создать класс по имени GenericMethod и обобщенную функцию внутри класса по имени isItIncluded().
 Функция isItIncluded() определяет, является ли объект членом массива. Он может быть использован с любым
 типом объектов и массивов до тех пор, пока массив содержит объекты, совместимые с типом искомого объекта.
*/

fun main() {
    val intStates = States(arrayOf(1, 2, 3, 4, 5))
    println("Среднее значение: ${intStates.getAverage()}")
    val doubleStates = States(arrayOf(1.5, 2.5, 3.5))
    println("Среднее значение: ${doubleStates.getAverage()}")


    val genericMethod = GenericMethod()
    val intArray = arrayOf(1, 2, 3, 4, 5)
    println( "Число 3 в массиве: ${genericMethod.isItIncluded(intArray,3)}")
    val stringArray = arrayOf("apple", "banana", "cherry")
    println("Слово 'banana' в массиве: ${genericMethod.isItIncluded(stringArray, "banana")}")
    val doubleArray = arrayOf(1.1, 2.2, 3.3)
    println("Число 4.4 в массиве: ${genericMethod.isItIncluded(doubleArray, 4.4)}")

}