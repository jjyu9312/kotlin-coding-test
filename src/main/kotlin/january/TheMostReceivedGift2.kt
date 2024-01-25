package january

import sun.security.ec.point.ProjectivePoint.Mutable
import java.util.*
import kotlin.math.max

fun theMostReceivedGift2Solution(
    friends: Array<String>,
    gifts: Array<String>
): Int {
    val giftIndex = IntArray(friends.size)
    // 2차원 배열
    val giftCounts = Array(friends.size) { IntArray(friends.size) }
    val indexByFriend = friends
        .withIndex() // index, value를 모두 얻을 수 있는 함수
        .asSequence() // 컬렉션 크기가 클 떄 시퀀스로 변경하면 성능 향상
        .associate { it.value to it.index } // Map 형식의 <Key, Value>로 값들을 묶어주는 함수

    var answer = 0

    for (gift in gifts) {
        val (give, take) = gift.split(" ")
        val i = indexByFriend[give]!!
        val j = indexByFriend[take]!!

        // 선물 주고 받은 내역
        giftCounts[i][j]++

        // 본인 기준 선물 주고 받은 개수
        giftIndex[i]++
        giftIndex[j]--
    }

    giftCounts.forEach {
        println(it)
    }

    for (i in friends.indices) {
        val count = friends.indices.sumOf { j ->
            when {
                giftCounts[i][j] > giftCounts[j][i] -> 1
                giftCounts[i][j] < giftCounts[j][i] -> 1
                giftIndex[i] > giftIndex[j] -> 1
                giftIndex[i] < giftIndex[j] -> 1
                else -> 0
            } as Int
        }

        if (answer < count) {
            answer = count
        }
    }

    return answer
}

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val friendsString = nextLine()
    val giftsString = nextLine()
    val friendsArray = friendsString.split(",").toTypedArray()
    val giftsArray = giftsString.split(",").toTypedArray()
    println(
        theMostReceivedGift2Solution(
            friendsArray,
            giftsArray
        )
    )
}