package november

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val sentence = nextLine()
    var answer = ""

    val wordsList = sentence.split(" ")

    wordsList.forEach {
        if (answer.length < it.length) {
            answer = it
        }
    }

    println(answer)
}
