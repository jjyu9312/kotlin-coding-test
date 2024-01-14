package january

import java.util.*

fun rockScissorPaperSolution1(
    firstIntArray: IntArray,
    secondIntArray: IntArray,
): List<String> {
    val answer = mutableListOf<String>()

    for (i in firstIntArray.indices) {
        if (firstIntArray[i] == secondIntArray[i])
            answer.add("D")

        else if (firstIntArray[i] == 3 && secondIntArray[i] == 1)
            answer.add("B")

        else if(firstIntArray[i] < secondIntArray[i])
            answer.add("B")

        else answer.add("A")
    }

    answer.forEach {
        println(it)
    }

    return answer
}

fun rockScissorPaperSolution2(
    firstIntArray: IntArray,
    secondIntArray: IntArray,
): List<String> {
    val answer = mutableListOf<String>()

    for (i in firstIntArray.indices) {
        if (firstIntArray[i] == secondIntArray[i])
            answer.add("D")

        else if (firstIntArray[i] == 1 && secondIntArray[i] == 3)
            answer.add("A")

        else if (firstIntArray[i] == 2 && secondIntArray[i] == 1)
            answer.add("A")

        else if (firstIntArray[i] == 3 && secondIntArray[i] == 2)
            answer.add("A")

        else answer.add("B")
    }

    answer.forEach {
        println(it)
    }

    return answer
}

// 1 가위 < 2 바위 < 3 보
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val num = nextInt()
    val firstIntArray = IntArray(num)
    val secondIntArray = IntArray(num)
    for (i in 0 until num) {
        // 배열의 각 요소에 값을 입력받음
        firstIntArray[i] = nextInt()
    }
    for (i in 0 until num) {
        // 배열의 각 요소에 값을 입력받음
        secondIntArray[i] = nextInt()
    }
    println(
        rockScissorPaperSolution1(
            firstIntArray,
            secondIntArray,
        )
    )

    println("=============================")

    println(
        rockScissorPaperSolution2(
            firstIntArray,
            secondIntArray,
        )
    )
}