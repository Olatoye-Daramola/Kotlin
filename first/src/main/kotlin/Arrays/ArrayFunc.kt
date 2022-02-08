fun <T> sizeOf(array: Array<T>): Int {
    return array.size
}

fun main() {
    // println(sizeOf(arrayOf("A", "B", "C")))

    var mutableList: MutableList<String> = mutableListOf("Apple", "Orange")
    mutableList.add("Banana")
    mutableList.add("Mango")

    for (element in mutableList) {
        println(element)
    }

    println("\n" + mutableList.removeAt(1))

    val newList = mutableList.removeAt(1)
    println(newList)
}