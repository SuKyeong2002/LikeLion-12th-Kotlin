package net.skhu

fun main() {
    // 조건형 반복문: 조건이 참인 경우 반복 유지
    // 1. while
    // 증감연산자
    // 1. 증가연산자
    // 01. 전위연산자(profix): 연산자가 포함된 구문에서 이미 증감된 수를 반영하여 연산 진행
    var a = 0
    while(a < 5) {
        println(++a)
    }

    // 02. 후위연산자(postfix): 증감된 수를 해당 구문에서 사용하지 않고 다음 구문부터 사용\
    var b = 0
    while(b < 5) {
        println(b++)
    }

    // 2. do...while: 반드시 한 번은 실행
    var c = 0
    do{
        println(c++)
    } while(c < 5)

    // 범위형 반복문: 반복 범위를 정해 반복 수행
    // for문
    for(i in 0..9) {
        print(i)
    }
    println()

    // 0-9 중 3씩 증가
    for(i in 0..9 step 3) {
        print(i)
    }
    println()

    // 9-0 중 1씩 감소
    for(i in 9 downTo 0) {
        print(i)
    }
    println()

    // 9-0 중 3씩 감소
    for(i in 9 downTo 0 step 3) {
        print(i)
    }
    println()

    // 'a'-'e' 중 1씩 증가
    for(i in 'a' .. 'e') {
        print(i)
    }
    println()
}