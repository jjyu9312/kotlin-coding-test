package november

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val letters = next()
    val charList = mutableListOf<Char>()
    for ((index, item) in letters.withIndex()) {
        if (item.isUpperCase()) {
            charList.add(item.toLowerCase())
        } else {
            charList.add(item.toUpperCase())
        }
    }
    val answer = charList.joinToString("")
    println(answer)
}
