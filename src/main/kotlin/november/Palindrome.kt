package november

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val word = next()
    val lowerCaseWord = word.toLowerCase()
    val lowerCaseWordCharList = lowerCaseWord.toCharArray()
    val answerCharList = mutableListOf<Char>()

    for (i in lowerCaseWordCharList.size - 1 downTo 0) {
        answerCharList.add(lowerCaseWordCharList[i])
    }

    val answer = answerCharList.joinToString("")

    println("word : ${word}")
    println("answer : ${answer}")

    if (lowerCaseWord == answer) println("YES")
    else println("NO")
}
