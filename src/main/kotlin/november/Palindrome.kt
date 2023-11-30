package november

import java.util.*

fun solution2(str: String): String {
    val lowerCaseWord = str.toLowerCase()
    val len = lowerCaseWord.length
    for (i in 0..len / 2) {
        if (lowerCaseWord[i] != lowerCaseWord[len - i - 1]) return ("NO")
    }

    return "YES"
}

fun solution1(str: String): String {
    val lowerCaseWord = str.toLowerCase()
    val lowerCaseWordCharList = lowerCaseWord.toCharArray()
    val answerCharList = mutableListOf<Char>()

    for (i in lowerCaseWordCharList.size - 1 downTo 0) {
        answerCharList.add(lowerCaseWordCharList[i])
    }

    val answer = answerCharList.joinToString("")

    println("str : $str")
    println("answer : $answer")

    if (lowerCaseWord == answer) return("YES")
    else return("NO")
}

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val str = next()
    println(solution1(str))
    println(solution2(str))
}
