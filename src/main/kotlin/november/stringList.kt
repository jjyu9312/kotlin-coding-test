package november

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val sentence = next()
    val word = next()
    val charWord = word[0].toLowerCase() // 문자열의 첫 번째 문자를 추출합니다
    val charResult: Char = charWord // Char로 형변환합니다
    val lowerCaseSentence = sentence.toLowerCase()
    var answer = 0
    for (item in lowerCaseSentence) {
        if (item == charResult) {
            answer += 1
        }
    }

    println(answer)
}
