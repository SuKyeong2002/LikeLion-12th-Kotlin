package net.skhu

fun main() {
    // 함수가 필요한 이유
    // 1. 이미 존재하는 클래스를 확장하여 새로운 속성이나 함수를 담은 클래스 구현
    // 2. 공통되는 부분을 뽑아 코드 관리 용이
    // 슈퍼 클래스(A) -> 서브 클래스(A, B)

    var a = Animal("멍이", 5, "개")
    var b = Dog("야옹이", 5)

    a.introduce()
    b.introduce()

    b.bork()

    var c = Cat("루이", 1)

    c.introduce()
    c.meow()
}

// open: 클래스가 상속될 수 있도록 클래스 선언 시 붙임
open class Animal (var name: String, var age: Int, var type: String)
{
    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

// 상속 규칙
// 1. 서브 클래스는 슈퍼 클래스에 존재하는 속성과 '같은 이름'의 속성을 가질 수 없음
// 2. 서브 클래스 생성 시 반드시 슈퍼 클래스의 생성자(: 뒤) 까지 호출
class Dog (name: String, age: Int) : Animal (name, age, "개")
{
    fun bork() {
        println("멍멍")
    }
}

class Cat (name: String, age: Int) : Animal (name, age, "고양이")
{
    fun meow() {
        println("야옹야옹")
    }
}
