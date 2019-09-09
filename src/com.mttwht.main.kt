fun main(args: Array<String>) {
    println("Hello, World!")

    Immutability()
}

class Question {
    var Answer:String = ""
    val Question:String = "What is the meaning of life?"
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
    println(r.Answer)
}