package january

import java.util.*
import kotlin.math.pow

// 꿀팁) str 마지막에 빈 문자열을 넣으면 마지막 i와 i+1 비교 가능
fun stringCompretionSolution1(
    str: String
): String {
    var answer = ""
    var str2 = str
    str2 += " "
    var cnt = 1

    // str2에서 빈 문자열 전 까지만 탐색해야하기 때문에 -1 해줘야함
    for (i in 0 until str2.length - 1) {
        if (str2[i] == str2[i+1]) cnt ++
        else {
            answer += str2[i]
            if (cnt > 1) answer += cnt
            cnt = 1
        }
    }

    return answer
}


fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val str = next()
    println(stringCompretionSolution1(str))
}