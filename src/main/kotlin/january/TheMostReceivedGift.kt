package january

import sun.security.ec.point.ProjectivePoint.Mutable
import java.util.*
import kotlin.math.max

fun theMostReceivedGiftSolution(
    friends: Array<String>,
    gifts: Array<String>
): Int {
    val giftMap = gifts.groupingBy { it }.eachCount()
    giftMap.forEach { t, u ->
        println("giftMap.t : $t")
        println("giftMap.u : $u")
    }

    val pIdxMap = friends.map { it to pIdx(it, friends, giftMap) }.toMap()

    return friends.map {
        numOfPresents(it, friends, giftMap, pIdxMap)
    }.max()
}

fun pIdx(
    friend: String,
    friends: Array<String>,
    giftMap: Map<String, Int>,
): Int {
    val give = friends.sumBy { giftMap["$friend $it"] ?: 0 }
    val receive = friends.sumBy { giftMap["$it $friend"] ?: 0 }

    return give - receive
}

fun numOfPresents(
    friend: String,
    friends: Array<String>,
    giftMap: Map<String, Int>,
    pIdxMap: Map<String, Int>,
): Int {
    return friends.count {
        val give = giftMap["$friend $it"] ?: 0
        val take = giftMap["$it $friend"] ?: 0
        give > take || (give == take && pIdxMap[friend]!! > pIdxMap[it]!!)
    }
}

fun List<Int>.max(): Int {
    return reduce { max, d -> max(max, d) }
}

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val friends = Array(4) { next() }
    val gift = Array(4) { next() }
    println(
        theMostReceivedGiftSolution(
            friends,
            gift
        )
    )
}