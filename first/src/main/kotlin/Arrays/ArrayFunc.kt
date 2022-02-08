fun <T> sizeOf(array: Array<T>): Int {
    return array.size
}

fun areAnagrams(firstWord: String, secondWord: String): Boolean {
    if (firstWord.length != secondWord.length) return false
    for (i in firstWord) {
        if (!(i in secondWord)) return false
    }
    return true
}

fun isPangram(word: String): Boolean {
    var alphabets = "abcdefghijklmnopqrstuvxyz"
    
    for (i in alphabets) {
        if (!(i in word)) return false
    }
    return true
}

fun main() {
    // println(sizeOf(arrayOf("A", "B", "C")))

    // var mutableList: MutableList<String> = mutableListOf("Apple", "Orange")
    // mutableList.add("Banana")
    // mutableList.add("Mango")

    // for (element in mutableList) {
    //     println(element)
    // }

    // println("\n" + mutableList.removeAt(1))

    // val newList = mutableList.removeAt(1)
    // println(newList)
    println(isPangram("abcdefghijklmnopqruvxyz"))
}