package net.skhu

fun main() {
    // 타입추론(type inference): 변수나 함수를 선언할 때나 연산이 이루어질 때 자료형을 코드에 명시하지 않아도 코틀린이 자동으로 자료형 추론
    var a = 1234 // Int형 변수 지정
    var b = 1234L // Long형 변수 지정
    var c = 12.45 // Double형 변수 지정
    var d = 12.45f // Float형 변수 지정
    var e = 0xABCD // 16진수 Int형 변수 지정
    var f = 0b0101010 // 2진수 Int형 변수 지정
    var g = true
    var h = 'c'

    println(add(5, 6, 7))
    println(add2(5, 6, 7))

}

// 함수(function): 특정한 동작을 하거나 원하는 결과값을 연산 (예. main(), println())
fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

// 단일 표현식 함수(single-expression function): 코드 간단히
fun add2(a: Int, b: Int, c: Int) = a + b + c