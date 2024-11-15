package limitationsGenerics

class GenericMethod {
    fun <T> isItIncluded(array: Array<T>, element: T): Boolean {
        return element in array
    }
}