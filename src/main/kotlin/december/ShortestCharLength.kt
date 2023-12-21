package december

import java.util.*
import kotlin.math.pow

// 꿀팁) char를 toInt하면 아스키 코드 값이 나온다
fun shortestCharLengthSolution1(
    str: String,
    char: Char,
): Array<Int> {

    val answer: Array<Int> = Array(str.length) { index -> index }

    // 길이가 100이 최대기 때문에 100보다 큰 숫자 아무거나 정함
    var p = 1000
    for (i in str.indices) {
        if (str[i] == char) {
            p = 0
            answer[i] = p
        } else {
            p++
            answer[i] = p
        }
    }

    // 끝에서부터 하나씩 탐색하기 위해 다시 p를 1000으로 초기
    p = 1000
    for (i in str.length - 1 downTo 0) {
        if (str[i] == char) {
            p = 0
            answer[i] = p
        } else {
            p++
            if (answer[i] > p) {
                answer[i] = p
            }
        }
    }

    println(answer.joinToString(" "))

    return answer
}


fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val str = next()
    val char = next()[0]
    println(shortestCharLengthSolution1(str,char))
}