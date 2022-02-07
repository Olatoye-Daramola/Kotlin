import java.util.Scanner
import java.util.InputMismatchException


val scanner: Scanner = Scanner(System.`in`)


// QUESTION 1
fun questionOne() {
    println("\nQUESTION 1")

    try {
        println("Enter an integer")
        var userInput = scanner.nextInt()
    println("The intger you entered is $userInput")
    } catch (e: InputMismatchException) {
        questionOne()
    }
}

// QUESTION 2
fun questionTwo() {
    println("\nQUESTION 2")

    println("Enter first integer")
    var intOne = scanner.nextInt()

    println("Enter second integer")
    var intTwo = scanner.nextInt()

    println("The sum of the integers is: ${intOne + intTwo}")
}

// QUESTION 3
fun questionThree() {
    println("\nQuestion 3")

    println("Enter first floating point number")
    var floatOne = scanner.nextFloat()

    println("Enter second floating point number")
    var floatTwo = scanner.nextFloat()

    println("The sum of the integers is: ${floatOne * floatTwo}")
}

// QUESTION 4
fun questionFour() {
       println("\nQuestion 4")

       var character = scanner.next()
       println("The ASCII value is ${character.toInt()}")
}

// QUESTION 5
fun questionFive() {
       println("\nQuestion 5")

    println("Enter first number")
    var numOne = scanner.nextFloat()

    println("Enter second number")
    var numTwo = scanner.nextFloat()

    println("The quotient of the numbers is: ${numOne / numTwo}")
    println("The remainder of the numbers is: ${numOne % numTwo}")
}

// QUESTION 6
fun questionSix() {
    println("\nQuestion 6")

    println("Enter first number")
    var numOne = scanner.nextFloat()

    println("Enter second number")
    var numTwo = scanner.nextFloat()

    val temp = numOne
    numOne = numTwo
    numTwo = temp

    println("Before swapping:\nFirst number: $numOne\nSecondNumber:$numTwo")
    println("After swapping:\nFirst number: $numOne\nSecondNumber:$numTwo")
}

// QUESTION 7
fun questionSeven() {
    println("\nQuestion 7")

    println("Enter number")
    var num = scanner.nextInt()

    if (num % 2 == 0) println("$num is even") else println("$num is odd") 
}

// QUESTION 8
fun questionEight() {
    println("\nQuestion 8")

    println("Enter word")
    var word = scanner.next()

    println("Enter character to count")
    var character = scanner.next()

    var counter: Int = 0

    for (char in word) {
        if (char.toString() == character) counter++
    }

    println("$character appeared $counter time(s)")
}

// QUESTION 9
fun questionNine() {
    println("\nQuestion 9")

    println("Enter alphabet to check")
    var alphabet = scanner.next()

    val vowels = listOf("a", "e", "i", "o", "u")

    if (alphabet in vowels) println("$alphabet is a vowel") else println("$alphabet is a consonant")
}

// QUESTION 10
fun questionTen() {
    println("\nQUESTION 10")

    println("Enter first number")
    var numOne = scanner.nextFloat()

    println("Enter second number")
    var numTwo = scanner.nextFloat()

    println("Enter third number")
    var numThree = scanner.nextFloat()

    if (numOne > numTwo && numOne > numThree) println("$numOne is the largest number")
    else if (numTwo > numThree) println("$numTwo is the largest number") else println("$numThree is the largest number")
}

// QUESTION 11
fun questionEleven() {
    println("\nQUESTION 11")

    println("Enter year to check")
    var year = scanner.nextInt()

    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) println("$year is a leap year") else println("$year is not a leap year")
}

// QUESTION 12
fun questionTwelve() {
    println("\nQUESTION 12")

    println("Enter character to check")
    var character = scanner.next()[0]

    val asciiValue = character.code

    if (asciiValue in 65..90 || asciiValue in 97..122) println("$character is an alphabet") else println("$character is not an alphabet")
}

// QUESTION 13
fun questionThirteen() {
    println("\nQUESTION 13")

    println("Enter first natural number")
    var intOne = scanner.nextInt()
    if (intOne < 1) {
        println("Enter natural number only")
        questionThirteen()
    }

    println("Enter second natural number")
    var intTwo = scanner.nextInt()
    if (intTwo < 1) {
        println("Enter natural number only")
        questionThirteen()
    }


    println("The sum of the integers is: ${intOne + intTwo}")
}

// QUESTION 14
fun questionFourteen() {
    println("\nQUESTION 14")

    println("Enter number")
    var num = scanner.nextInt()
    val savedNum = num

    var factorial = 1; 
    while (num > 1) {
        factorial *= num
        num--
    }

    println("Factorial of $savedNum is $factorial")
}

// QUESTION 15
fun questionFifteen() {
    println("\nQUESTION 15")

    for (i in 1..12) {
        // println("\n$i Table")
        for (j in 1..12) {
            println("$i x $j = ${i * j}")
        }
    }
}

// QUESTION 16
fun questionSixteen() {
    println("\nQUESTION 16")

    var firstNumber = 0; var secondNumber = 1; var nextNumber = 0

    println("Enter number for Fibonacci")
    var number = scanner.nextInt()

    while (number > 0) {
        nextNumber = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = nextNumber
        println(nextNumber)
        number--

    }
}

// QUESTION 17
fun questionSeventeen() {
    println("\nQUESTION 17")

    // println("Enter first number")
    // var numOne = scanner.nextInt()

    // println("Enter second number")
    // var numTwo = scanner.nextInt()

    // for (i = 1; i <= numOne && counter <= numTwo) {

    // }
}

// QUESTION 18
fun questionEighteen() {
    println("\nQUESTION 18")
}

// QUESTION 19
fun questionNineteen() {
    println("\nQUESTION 19")

    for (i in 65..90) {
        println(i.toChar())
    }
}

// QUESTION 20
fun questionTwenty() {
    println("\nQUESTION 20")

    println("Enter number")
    var num = scanner.nextInt()

    var counter = 1

    while (!(num < 10)) {
        num /= 10
        counter++
    }
    println("${counter}")
}

// QUESTION 21
fun questionTwentyOne() {
    println("\nQUESTION 21")

    println("Enter number")
    var num = scanner.nextInt()
    val savedNum = num

    var reverse = ""; var newNum = 1

    while (!(num < 1)) {
        newNum = num % 10
        reverse += newNum
        num /= 10
    }
    println("Reverse of $savedNum is $reverse")
}

// QUESTION 22
fun questionTwentyTwo() {
    println("\nQUESTION 22")

    println("Enter number")
    var num = scanner.nextInt()
    var multiple = 1

    println("Enter power")
    var pow = scanner.nextInt()
    val savedPow = pow

    while (pow >= 1) {
        multiple *= num
        pow--
    }
    println("$num to the power of $savedPow is: $multiple")


}





fun main(args: Array<String>) {

    // questionOne()
    // questionTwo()
    // questionThree()
    // questionFour()
    // questionFive()
    // questionSix()
    // questionSeven()
    // questionEight()
    // questionNine()
    // questionTen()
    // questionEleven()
    // questionTwelve()
    // questionThirteen()
    // questionFourteen()
    // questionFifteen()
    // questionSixteen()
    // questionSeventeen()
    // questionEighteen()
    // questionNineteen()
    // questionTwenty()
    // questionTwentyOne()
    // questionTwentyTwo()
}