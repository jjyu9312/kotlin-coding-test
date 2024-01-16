package january

import java.util.*

fun fibonacciSolution1(
    num: Int,
): IntArray {
    val intArray = IntArray(num)
    intArray[0] = 1
    intArray[1] = 1

    for (i in 2 until num) {
        intArray[i] = intArray[i-2] + intArray[i-1]
    }

    intArray.forEach {
        print("$it ")
    }

    return intArray
}

fun fibonacciSolution2(
    num: Int,
): String {
    var a = 1
    var b = 1
    var c = 0

    print("$a $b ")

    for (i in 2 until num) {
        c = a + b
        print("$c ")
        a = b
        b = c
    }

    return "TEST 2"
}

// 1 가위 < 2 바위 < 3 보
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val num = nextInt()
    println(
        fibonacciSolution1(num)
    )

    println(
        fibonacciSolution2(num)
    )
}