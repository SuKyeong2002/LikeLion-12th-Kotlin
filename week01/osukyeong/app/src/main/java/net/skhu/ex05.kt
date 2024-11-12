package net.skhu

fun main() {
    // 조건문 (만약 ~한다면 ...해라)
    var a = 11
    if(a > 10) {
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작거나 같다")
    }

    // 비교연산자(comparison operators)
    // 1. 부등호 (<, <=, >, >=, !=)
    // 2. 등호 (==)
    // 3. is 연산자 (a is Int: a를 Int형으로 호환/형변환)
    // 4. !is 연산자

    doWhen(1)
    doWhen("DiMo")
    doWhen(12L)
    doWhen(3.141592)
    doWhen("kotlin")

    doWhen2(1)
    doWhen2("DiMo")
    doWhen2(12L)
    doWhen2(3.141592)
    doWhen2("kotlin")
}

// 다중조건문(When): 하나의 값을 여러 개의 값과 비교 가능
fun doWhen(a: Any) {
    when(a) {
        1 -> println("정수 1입니다")
        "DiMo" -> println("디모의 코틀린 강좌입니다")
        is Long -> println("Long 타입입니다")
        !is String -> println("String 타입이 아닙니다")
        else -> println("어떤 조건도 만족하지 않습니다")
    }
}

// 표현식으로 변환
fun doWhen2(a: Any) {
    var result = when(a) {
        1 -> "정수 1입니다"
        "DiMo" -> "디모의 코틀린 강좌입니다"
        is Long -> "Long 타입입니다"
        !is String -> "String 타입이 아닙니다"
        else -> "어떤 조건도 만족하지 않습니다"
    }
    println(result)
}