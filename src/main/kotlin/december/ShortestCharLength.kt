package december

import java.util.*
import kotlin.math.pow

// 꿀팁) char를 toInt하면 아스키 코드 값이 나온다
fun shortestCharLengthSolution1(
    str: String,
    char: String,
): List<Int> {
    val answer = mutableListOf<Int>()
    return answer
}


fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val str = next()
    val char = next()
    println(shortestCharLengthSolution1(str,char))
}