package november

import java.util.*

// 꿀팁 : 알파벳만 남기고 싶을 때 정규표현식 [^A-Za-z] 활용
fun alphabetPalindromeSolution1(str: String): String {
    val lowerCaseStr = str.toLowerCase()
    val replaceStr = lowerCaseStr.replace(Regex("[^A-Za-z]"), "")

    val len = replaceStr.length
    for (i in 0..len / 2) {
        if (replaceStr[i] != replaceStr[len - i - 1]) return "NO"
    }

    return "YES"
}

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val str = nextLine()
    println(alphabetPalindromeSolution1(str))
}
