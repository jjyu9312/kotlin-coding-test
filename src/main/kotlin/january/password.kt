package january

import java.util.*
import kotlin.math.pow

fun passwordSolution1(
    len: Int,
    str: String
): String {
    val replacedStr = str
        .replace('#', '1')
        .replace('*', '0')

    val chunkedList = replacedStr.chunked(7)

    // 2진수를 10진수로 바꾸기 => toInt 함수
    val binaryChunkedList = chunkedList.map {
        it.toInt(2)
    }

    // 아스키코드를 문자로 바꾸기 => toChar 함수
    val asciiChunkedList = binaryChunkedList.map {
        it.toChar()
    }

    return asciiChunkedList.joinToString ("")
}


fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val len = nextInt()
    val str = next()
    println(passwordSolution1(len, str))
}