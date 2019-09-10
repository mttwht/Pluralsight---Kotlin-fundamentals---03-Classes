import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>) {
    println("Hello, World!")

    doThings()

    println()

    looping()
}

fun looping() {
//    for(i in 1..10) // prints 1,2,3,4,5,6,7,8,9,10
//    for(i in 1..10 step 2) // prints 1,3,5,7,9
//    for(i in 10 downTo 1) // prints 10,8,6,4,2
    for(i in 1 until 10) // prints 1,2,3,4,5,6,7,8,9
        println(i)

    var numbers = listOf(1,2,3,4,5)
    for(i in numbers) // prints 1,2,3,4,5
        println(i)

    var ages = TreeMap<String, Int>()
    ages["Matt"] = 33
    ages["Claire"] = 34
    ages["Baby"] = 0
    for((name, age) in ages)
        println("$name is $age years old")

    for((index, element) in numbers.withIndex())
        println("numbers[$index] = $element")
}

class Question {
    var Answer:String? = null
    val CorrectAnswer = "42"
    val Question:String = "What is the meaning of life?"

    fun display() {
//        println("Your answer is " + Answer)
        println("Your answer is $Answer")
    }

    fun printResult() {
        when (Answer) {
            CorrectAnswer -> println("Answer is correct!")
            else -> println("Try again")
        }
    }

    fun printNumber() {
        var number:Int? = try {
            Integer.parseInt(Answer)
        } catch(e:NumberFormatException) {
            null
        }
        println("Number value is $number")
    }
}

fun doThings() {
    // mutable
    var q = Question()
    q = Question()

    // immutable
    val r:Question? = Question()
//    r = Question() // Not allowed!
    r?.Answer = "42"
//    r.Question = "" // Not allowed!

    println(q.Question)
    r?.display()
    println("The answer is ${r?.Answer}")

    r?.printResult()

    r?.printNumber()
}
