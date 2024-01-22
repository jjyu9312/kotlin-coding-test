package january

import sun.security.ec.point.ProjectivePoint.Mutable
import java.util.*

fun reverseSosuSolution1(
    num: Int,
    intArray: IntArray,
): List<Int> {
    // 로직 시간 기록
    val startTime = System.currentTimeMillis()
    println("로직 시작 시간 : $startTime 밀리초")

    val stringArray = intArray.map {
        it.toString()
    }

    val reverseStringList = mutableListOf<String>()

    stringArray.forEach {
        val reverseNum = StringBuilder()
        for (i in it.length - 1 downTo 0) {
            reverseNum.append(it[i].toChar())
        }
        reverseStringList.add(reverseNum.toString())
    }

    val reverseIntList = reverseStringList.map {
        it.toInt()
    }

    val answer = MutableList(reverseIntList.size) { 0 }

    val max = reverseIntList.maxBy { it }
    val maxIntArray = IntArray(max + 1)

    for (i in 2 .. max) {
        if (maxIntArray[i] == 0) {
            reverseIntList.forEachIndexed { index, it ->
                run {
                    if (i == it) {
                        answer.add(index, it)
                    }
                }
            }
            for (j in i .. max step i) {
                maxIntArray[j] = 1
            }
        }
    }

    // 로직 종료 후 시간 기록
    val endTime = System.currentTimeMillis()
    println("로직 종료 시간 : $endTime 밀리초")

    // 실행 시간 계산
    val elapsedTime = endTime - startTime
    println("로직 실행 시간 : $elapsedTime 밀리초")

    return answer.filter { it != 0 }
}

fun reverseSosuSolution2(
    num: Int,
    intArray: IntArray,
): List<Int> {
    // 로직 시간 기록
    val startTime = System.currentTimeMillis()
    println("로직 시작 시간 : $startTime 밀리초")

    val answer = mutableListOf<Int>()

    for (i in intArray.indices) {
        var tmp = intArray[i]
        var res = 0
        while (tmp > 0) {
            val t = tmp % 10
            res = res * 10 + t
            tmp /= 10
        }
        if (isPrime(res)) answer.add(res)
    }

    // 로직 종료 후 시간 기록
    val endTime = System.currentTimeMillis()
    println("로직 종료 시간 : $endTime 밀리초")

    // 실행 시간 계산
    val elapsedTime = endTime - startTime
    println("로직 실행 시간 : $elapsedTime 밀리초")

    return answer
}

fun isPrime(num: Int): Boolean {
    if (num == 1) return false
    for (i in 2 until num) {
        if (num % i == 0) return false
    }

    return true
}

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val num = nextInt()
    val intArray = IntArray(num)
    for (i in 0 until num) {
        // 배열의 각 요소에 값을 입력받음
        intArray[i] = nextInt()
    }
    println(
        reverseSosuSolution1(
            num,
            intArray
        )
    )
    println("==================================")
    println(
        reverseSosuSolution2(
            num,
            intArray
        )
    )
}