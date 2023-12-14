package december

import java.util.*
import kotlin.math.pow

// g0en2T0s8eSoft
// 0 2 0 8
fun extractOnlyNumbersSolution1(str: String): Int {
    val replaceStr = str.replace(Regex("[^0-9]"), "")
    val numberList = replaceStr.toList()
    var answer = 0.0
    val len = numberList.size
    for (i in 0 until len) {
        println("before answer : $answer")
        println(10.0.pow(i))
        println((10.0.pow(i) * (numberList[ len - (i+1) ]).toDouble()))
        answer += (10.0.pow(i) * (numberList[ len - (i+1) ]).toDouble())
        println("after answer : $answer")
    }
    return answer.toInt()
}


fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val str = next()
    println(extractOnlyNumbersSolution1(str))
}
