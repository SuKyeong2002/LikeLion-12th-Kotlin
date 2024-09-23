package net.skhu

fun main() {
    // object: 생성자 없이 객체를 직접 만들어 냄 (하나로 공동 사용 시 용이)
    // Singleton Pattern: 클래스의 인스턴스를 단 하나만 만들어 사용하도록 하는 코딩 아키텍쳐 패턴

    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()

    println(Counter.count)

    // Companion Object: class 안에 object 생성 가능
    // Static 멤버 (클래스 내부에서 별도의 영역에 고정적으로 존재하여 인스턴스를 생성하지 않아도 공용으로 사용가능한 속성이나 함수)와 비슷

    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("총계 : ${FoodPoll.total}")

}

object Counter {
    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
}

class FoodPoll (val name: String) {
    companion object {
        var total = 0
    }

    var count = 0

    fun vote() {
        total++
        count++
    }
}