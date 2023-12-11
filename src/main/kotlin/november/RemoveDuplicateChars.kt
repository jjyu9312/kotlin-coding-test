package november

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val word = next()
    val charList = mutableListOf<Char>()
    word.forEach {
        if (!charList.contains(it)) {
            charList.add(it)
        }
    }

    val answer = charList.joinToString("")
    println("answer : $answer")

    println("=============== 방법 ===================")

    var answer2 = ""

    // indexOf 이용
    for (i in 0 until word.length) {
        if (word.indexOf(word[i]) == i) answer2 += word[i]
    }

    println("answer2 : $answer2")
}
