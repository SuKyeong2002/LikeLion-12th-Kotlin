package net.skhu

fun main() {
    // 클래스 확장: 클래스 상속
    // 클래스의 다형성(Polymorphysm)

    // instance of Cola (Drink의 객체 공간 + Cola의 추가 공간)
    // var b: Drink = Cola() : Drink만 사용 가능
    // var b: Cola = Cola() : Cola, Drink 모두 사용 가능
    // Up-Casting: 상위 자료형인 슈퍼 클래스로 변환 (예. 음료->콜라)
    // Down-Casting: 하위 자료형으로 변환 (as, is 같은 별도 연산자 필요)

    // as: 변수를 호환되는 자료형으로 변환/반환해주는 캐스팅 연산자
    // is: 변수가 자료형에 호환되는지를 먼저 체크한 후 변환해주는 캐스팅 연산자 (조건문 내에서만 사용)

    var a = Drink()
    a.drink()

    var b: Drink = Cola()
    b.drink()

    // Unresolved reference: washDishes 에러
    // b.washDishes()

    if(b is Cola) {
        b.washDishes()
    }

    var c = b as Cola
    c.washDishes()
    b.washDishes()
}

open class Drink {
    var name = "음료"

    open fun drink() {
        println("${name}를 마십니다")
    }
}

class Cola: Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}를 마십니다")
    }

    fun washDishes() {
        println("${type}로 설거지를 합니다")
    }
}
