package october

import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextLong()
    val m = nextLong()
    val minusValue = n - m
    val answer = abs(minusValue)
    println()
    println(answer)
}
