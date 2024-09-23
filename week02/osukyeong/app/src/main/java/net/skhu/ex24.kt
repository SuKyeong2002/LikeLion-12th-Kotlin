package net.skhu

fun main() {
    // 중첩 클래스(Nested Class): 클래스 안에 클래스가 있는 구조
    // 예. 외부 클래스 이름.내부 클래스 이름

    // 내부 클래스(Inner Class): 외부 클래스가 있어야만 생성 가능
    // 예. 외부 클래스 내에 내부 클래스 있음
    Outer.Nested().introduce()

    val outer = Outer()
    val inner = outer.Inner()

    inner.introduceInner()
    inner.introduceOuter()

    outer.text = "Changed Outer Class"
    inner.introduceOuter()
}

class Outer {
    var text = "Outer Class"

    class Nested {
        fun introduce() {
            println("Nested Class")
        }
    }

    inner class Inner {
        var text = "Inner Class"

        fun introduceInner() {
            println(text)
        }

        fun introduceOuter() {
            println(this@Outer.text)
        }
    }
}