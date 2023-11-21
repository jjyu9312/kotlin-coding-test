package november

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val word = next()
    val charList = mutableListOf<Char>()
    word.forEach {
        if (!charList.contains(it)) {
            charList.add(it)
        }
    }

    val answer = charList.joinToString("")
    println(answer)
}
