package january

import java.util.*

fun visibleStudentSolution1(
    intArray: IntArray
): Int {
    var answer = 0
    val newArray = intArray + 0
    for (i in 0 until newArray.size - 1) {
        if (newArray[i] < newArray[i+1]) {
            answer += 1
        }
    }

    return answer
}

fun visibleStudentSolution2(
    intArray: IntArray
): Int {
    var answer = 1
    var max = intArray[0]
    for (i in 1 until intArray.size) {
        if (intArray[i] > max) {
            answer++
            max = intArray[i]
        }
    }

    return answer
}

// intArray 만들기
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val num = nextInt()
    val intArray = IntArray(num)
    for (i in 0 until num) {
        // 배열의 각 요소에 값을 입력받음
        intArray[i] = nextInt()
    }
    println(visibleStudentSolution1(intArray))
    println(visibleStudentSolution2(intArray))
}