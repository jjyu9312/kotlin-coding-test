package october

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextInt()
    val m = nextInt()
    val minusValue = n - m
    val answer =
        if (minusValue  < 0) - minusValue
        else minusValue

    println(answer)
}
