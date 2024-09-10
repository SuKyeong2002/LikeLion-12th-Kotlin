package net.skhu

fun main() {
    // 오버라이딩(overriding): 서브 클래스에서 같은 이름과 형태로 된 함수의 내용을 다시 구현

    var t = Tiger()

    t.eat()

    var r = Rabbit()

    r.eat()
    r.sniff()

    var b = Bog()

    b.run()
    b.eat()
}

open class Animal3 {
    open fun eat() {
        println("음식을 먹습니다")
    }
}

class Tiger : Animal3() {
    override fun eat() {
        println("고기를 먹습니다")
    }
}

// 추상화 (abstraction)
// 1. 선언부만 있고 기능이 구현되지 않은 추상 함수
// 2. 추상 함수를 포함하는 추상 클래스
abstract class Animal4 {
    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : Animal4() {
    override fun eat() {
        println("딩근을 먹습니다")
    }
}

// 인터페이스(생성자 X)
// 1. 속성
// 2. 추상 함수(생성자 O): 구현부가 없는 함수는 abstract 함수로 간주
// 3. 일반 함수: 구현부가 있는 함수는 open 함수로 간주
interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다")
    }
}

class Bog : Runner, Eater {
    override fun run() {
        println("우다다다 합니다")
    }
}