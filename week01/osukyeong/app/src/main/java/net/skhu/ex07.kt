package net.skhu

fun main() {
    // 흐름제어
    // 1. return: 함수 종료 및 값 반환
    // 2. breack: 반복문 내의 구문이 실행되는 중간에 즉시 반복문 종료 및 다음 구문으로 즉시 넘어감
    for (i in 1..10) {
        if(i == 3) break
        print(i)
    }
    println()

    // 3. continue: 다음 반복 조건으로 즉시 넘어감
    for (i in 1..10) {
        if(i == 3) continue
        print(i)
    }
    println()

    // 코틀린 다중반복문 특별 기능
    loop@for (i in 1..10) {
        for (j in 1..10) {
            if(i == 1 && j == 2) break@loop
            println("i: $i, j: $j")
        }
    }
    println()

    // 논리연산자: 논리값을 연산하여 새로운 논리값을 도출할 때 쓰는 연산자
    // 1. &&: 그리고
    println(true && false)

    // 2. ||: 또는
    println(true || false)

    // 3 !: 반전
    println(!true)
    println(!false)

    // 조건식끼리의 연산
    var a = 6
    var b = 4
    println(a > 5 && b > 5)

}