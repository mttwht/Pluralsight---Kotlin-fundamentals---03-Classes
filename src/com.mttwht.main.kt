fun main(args: Array<String>) {
    println("Hello, World!")

    doThings()
}

class Question {
    var Answer:String? = null
    val CorrectAnswer = "42"
    val Question:String = "What is the meaning of life?"

    fun display() {
//        println("Your answer is " + Answer)
        println("Your answer is $Answer")
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

    var message = if(r?.Answer == r?.CorrectAnswer) {
        "Answer is correct!"
    } else {
        "Try again"
    }
    println(message)
}
