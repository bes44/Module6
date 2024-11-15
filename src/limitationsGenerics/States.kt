package limitationsGenerics

class States<T : Number>(private val numbers: Array<T>) {
    fun getAverage(): Double {
        if (numbers.isEmpty()) {
            throw IllegalArgumentException("Array is empty")
        }
        val sum = numbers.map { it.toDouble() }.sum()
        return sum / numbers.size
    }
}