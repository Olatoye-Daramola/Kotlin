fun <T> sizeOf(array: Array<T>): Int {
    return array.size
}

fun main(args: Array<String>) {
    println(sizeOf(arrayOf("A", "B", "C")))
}