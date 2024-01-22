package january

import java.util.*

// 로직 오류 존재
// 2 3 5 7 외에 소수의 배수도 체크해야함
fun sosuSolution1(
    num: Int,
): Int {
    // 로직 시간 기록
    val startTime = System.currentTimeMillis()
    println("로직 시작 시간 : $startTime 밀리초")

    var answer = 0

    if (num <= 2) answer += 1
    else if (num <= 3) answer += 2
    else if (num <= 5) answer += 3
    else if (num <= 7) answer += 4
    else {
        answer += 4
        for (i in 8 .. num) {
           if (i % 2 != 0 &&
               i % 3 != 0 &&
               i % 5 != 0 &&
               i % 7 != 0
               ) {
               answer += 1
           }
        }
    }

    // 로직 종료 후 시간 기록
    val endTime = System.currentTimeMillis()
    println("로직 종료 시간 : $endTime 밀리초")

    // 실행 시간 계산
    val elapsedTime = endTime - startTime
    println("로직 실행 시간 : $elapsedTime 밀리초")

    return answer
}

// 에라스토테네스 체
// 2부터 배수인 숫자 모두 제거
fun sosuSolution2(
    num: Int,
): Int {
    // 로직 시간 기록
    val startTime = System.currentTimeMillis()
    println("로직 시작 시간 : $startTime 밀리초")

    var answer = 0
    val intArray = IntArray(num + 1)
    for (i in 2..num) {
        if (intArray[i] == 0) {
            answer++
            // i의 배수로 돌도록 만들기
            for (j in i..num step i) {
                intArray[j] = 1
            }
        }
    }

    // 로직 종료 후 시간 기록
    val endTime = System.currentTimeMillis()
    println("로직 종료 시간 : $endTime 밀리초")

    // 실행 시간 계산
    val elapsedTime = endTime - startTime
    println("로직 실행 시간 : $elapsedTime 밀리초")

    return answer
}



fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val num = nextInt()
    println(
        sosuSolution2(num)
    )
}