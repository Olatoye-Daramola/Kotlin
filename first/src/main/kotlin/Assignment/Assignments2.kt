import java.util.Scanner
import java.util.InputMismatchException


val scan: Scanner = Scanner(System.`in`)


// QUESTION 1
fun questionOne(array: Array<Int>): Int {
    println("\nQUESTION 1")
    
    var sum: Int = 0
    for (i in array) {
        sum += i
    }
    return (sum / array.size)
}

// QUESTION 2
fun questionTwo(array: Array<Int>) {
    println("\nQUESTION 2")

    var max: Int = array[0]
    // var index: Int = 0
    for (i in array) {
        if (i > max) max = i
        // else index++
    }

    println(max)
}

// // QUESTION 3
// fun questionThree() {
//     println("\nQuestion 3")

//     println("Enter first floating point number")
//     var floatOne = scanner.nextFloat()

//     println("Enter second floating point number")
//     var floatTwo = scanner.nextFloat()

//     println("The sum of the integers is: ${floatOne * floatTwo}")
// }

// QUESTION 4
fun questionFour(word: String): Boolean {
       println("\nQuestion 4")

        var alphabets = "abcdefghijklmnopqrstuvxyz"
    
    for (i in alphabets) {
        if (!(i in word)) return false
    }
    return true
}


// // QUESTION 5
// fun questionFive() {
//        println("\nQuestion 5")

//     println("Enter first number")
//     var numOne = scanner.nextFloat()

//     println("Enter second number")
//     var numTwo = scanner.nextFloat()

//     println("The quotient of the numbers is: ${numOne / numTwo}")
//     println("The remainder of the numbers is: ${numOne % numTwo}")
// }

// // QUESTION 6
// fun questionSix() {
//     println("\nQuestion 6")

//     println("Enter first number")
//     var numOne = scanner.nextFloat()

//     println("Enter second number")
//     var numTwo = scanner.nextFloat()

//     val temp = numOne
//     numOne = numTwo
//     numTwo = temp

//     println("Before swapping:\nFirst number: $numOne\nSecondNumber:$numTwo")
//     println("After swapping:\nFirst number: $numOne\nSecondNumber:$numTwo")
// }

// QUESTION 7
fun <T> questionSeven(array: Array<T>, value: Int): Boolean {
    println("\nQuestion 7")

    for (i in array) {
        if (value == i) return true
    }
    return false
}

// QUESTION 8
fun questionEight(num: Int): Int {
    println("\nQuestion 8")

    return if (num == 0) num
    else questionEight(num + (num-1))
}

// QUESTION 9
fun questionNine(numOne: Int, numTwo: Int, numThree: Int): Int {
    println("\nQuestion 9")

    if (numOne > numTwo && numOne > numThree) return numOne
    else if (numTwo > numThree) return numTwo
    else return numThree
}

// QUESTION 10
fun questionTen(num: Int, power: Int): Int {
    // println("\nQUESTION 10")


    if (power == 0) return 1
        
    return num * questionTen(num, power-1)
}

// QUESTION 11
fun questionEleven(num: Int): Int {
    // println("\nQUESTION 11")

    if (num == 1) return num
    return num * questionEleven(num - 1)
}

// QUESTION 12
// fun questionTwelve() {
//     println("\nQUESTION 12")


// }

// QUESTION 13
// fun questionThirteen(word: String): String {
//     println("\nQUESTION 13")

//     val vowels: String = "aeiou"

//     for (i in word) {
//         if (i in vowels) {
//             word.remove(i)
//         }
//     }
//     return word
//     }


// QUESTION 14
fun questionFourteen(word: String): String {
    // println("\nQUESTION 14")

    if (word.length == 0) return word
    return questionFourteen(word[word.length() - 1])
}


// QUESTION 15
fun questionFifteen(firstNumber: Int = 0, secondNumber:Int = 1, number:Int): Int {
    // println("\nQUESTION 15")
    
    if (number == 0) return -1
    println(firstNumber + secondNumber)
    
    return questionFifteen(secondNumber, secondNumber + firstNumber, number-1)
}

// QUESTION 16
fun questionSixteen(word: String): Boolean {
    println("\nQUESTION 16")

    return (word == word.reversed())
}

// QUESTION 17
fun questionSeventeen(firstWord: String, secondWord: String): Boolean {
    println("\nQUESTION 17")

    if (firstWord.length != secondWord.length) return false
    for (i in firstWord) {
        if (!(i in secondWord)) return false
    }
    return true
}

//     var gcd = multiplication / lcm


//     println(multiplication)
//     println(lcm)

//     println("The GCD is: $gcd")
// }

// // QUESTION 18
// fun questionEighteen() {
//     println("\nQUESTION 18")

//     println("Enter first number")
//     var numOne = scanner.nextInt()

//     println("Enter second number")
//     var numTwo = scanner.nextInt()

//     val multiplication = numOne * numTwo; var lcm = 0

//     first@for (i in numOne..multiplication) {
//         if ((i % numOne == 0 && i % numTwo == 0) && i > lcm) {
//             lcm = i
//             break@first
//         }
//     }

//     println("LCM is: $lcm")
// }








fun main() {

    // questionOne()
    // questionTwo(arrayOf(2,3,4,5,6))
    // questionThree()
    // questionFour()
    // questionFive()
    // questionSix()
    // questionSeven()
    // questionEight()
    // questionNine()
    // println(questionTen(6, 1))
    // println(questionEleven(4))
    // println(questionTwelve("adegoke"))
    // questionThirteen()
    // questionFourteen()
    questionFifteen(0, 1, 10)
    // questionSixteen()
    // questionSeventeen()
    // questionEighteen()
}