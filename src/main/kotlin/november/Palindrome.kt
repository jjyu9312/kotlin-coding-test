package november

import java.util.*

// 꿀팁 : 처음이랑 마지막을 하나씩 비교할 때는 i, len-i-1 활용
fun palindromeSolution1(str: String): String {
    val lowerCaseWord = str.toLowerCase()
    val len = lowerCaseWord.length
    for (i in 0..len / 2) {
        if (lowerCaseWord[i] != lowerCaseWord[len - i - 1]) return ("NO")
    }

    return "YES"
}

fun palindromeSolution2(str: String): String {
    val lowerCaseWord = str.toLowerCase()
    val lowerCaseWordCharList = lowerCaseWord.toCharArray()

    val answerCharList = mutableListOf<Char>()
    for (i in lowerCaseWordCharList.size - 1 downTo 0) {
        answerCharList.add(lowerCaseWordCharList[i])
    }

    val answer = answerCharList.joinToString("")

    if (lowerCaseWord == answer) return("YES")
    else return("NO")
}

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val str = next()
    println(palindromeSolution1(str))
    println(palindromeSolution2(str))
}
