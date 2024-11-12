package net.skhu

fun main() {
    // Generic: 클래스나 함수에서 사용하는 자료형을 외부에서 지정 가능
    // 즉, 함수나 클래스 선언 시 실제 자료형으로 대체되는 타입 패러미터를 받아 사용
    // 캐스팅 연산자의 속도 문제를 해결

    UsingGeneric(A()).doShouting()
    UsingGeneric(B()).doShouting()
    UsingGeneric(C()).doShouting()

    doShouting(B())
}

fun <T: A> doShouting(t: T) {
    t.shout()
}

open class A {
    open fun shout() {
        println("A가 소리칩니다")
    }
}

class B : A() {
    override fun shout() {
        println("B가 소리칩니다")
    }
}

class C : A() {
    override fun shout() {
        println("C가 소리칩니다")
    }
}

class UsingGeneric<T: A>(val t: T) {
    fun doShouting() {
        t.shout()
    }
}