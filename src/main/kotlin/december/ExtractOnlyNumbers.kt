package december

import java.util.*
import kotlin.math.pow
import kotlin.reflect.typeOf

// 꿀팁) char를 toInt하면 아스키 코드 값이 나온다
fun extractOnlyNumbersSolution1(str: String): Int {
    val replaceStr = str.replace(Regex("[^0-9]"), "")
    val numberList = replaceStr.toList()

    var answer = 0.0

    val len = numberList.size
    for (i in 0 until len) {
        answer += (10.0.pow(i) * ((numberList[ len - (i+1) ]).toString().toInt()))
    }

    return answer.toInt()
}


fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val str = next()
    println(extractOnlyNumbersSolution1(str))
}
