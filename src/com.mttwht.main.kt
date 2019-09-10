fun main(args: Array<String>) {
    println("Hello, World!")

    Immutability()
}

class Question {
    var Answer:String = ""
    val CorrectAnswer = "42"
    val Question:String = "What is the meaning of life?"

    fun display() {
//        println("Your answer is " + Answer)
        println("Your answer is $Answer")
    }
}

fun Immutability() {
    // mutable
    var q = Question()
    q = Question()

    // immutable
    val r = Question()
//    r = Question() // Not allowed!
    r.Answer = "42"
//    r.Question = "" // Not allowed!

    println(q.Question)
    r.display()
    println("The answer is ${r.Answer}")

    var message = if(r.Answer == r.CorrectAnswer) {
        "Answer is correct!"
    } else {
        "Try again"
    }
    println(message)
}
