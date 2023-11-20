package november

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val words = next()
    val charList: MutableList<Char> = words.toMutableList()

    var lt = 0
    var rt = words.length - 1

    while (lt < rt) {
        if (!charList[lt].isLetter()) lt ++
        else if (!charList[rt].isLetter()) rt --
        else {
            val tmp = charList[lt]
            charList[lt] = charList[rt]
            charList[rt] = tmp
            lt ++
            rt --
        }
    }

    val answer = charList.joinToString("")

    println(answer)
}
