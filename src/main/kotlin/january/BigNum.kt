package january

import java.util.*

fun bigNumSolution1(
    num: Int,
    intArray: IntArray,
): String {
    val answerList = mutableListOf<Int>()

    for (i in intArray.indices)
        if (num <= intArray[i])
            answerList.add(intArray[i])

    return answerList.joinToString (" ")
}

// intArray 만들기
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val num = nextInt()
    val intArray = IntArray(num)
    for (i in 0 until num) {
        intArray[i] = nextInt() // 배열의 각 요소에 값을 입력받음
    }
    println(bigNumSolution1(num, intArray))
}