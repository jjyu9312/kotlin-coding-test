package october

import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextInt()
    val m = nextInt()
    val minusValue = n - m
    val answer = abs(minusValue)

    println(answer)
}
