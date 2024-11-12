package net.skhu

fun main() {
    // ?. (null safe operator) : 참조연산자를 실행하기 전에 객체가 null인지 확인 후 null일 시 뒤에 함수 실행 X
    // ?: (elvis operator) : 객체가 null일 시 뒤에 함수 실행
    // !!. (non-null assertion operator) : 참조연산자를 실행할 때 null 여부를 컴파일 시 확인하지 않도록 하여 런타임시 에러 발생

    var a: String? = null

    println(a?.toUpperCase())
    println(a?:"default".toUpperCase())
    // 에러 발생
    // println(a!!.toUpperCase())

    var b: String?= "Kotlin Exam"

    b?.run {
        println(toUpperCase())
        println(toLowerCase())
    }

    println()

    // 내용의 동일성: 서로 다른 곳에 할당된 객체라도 내용이 같다면 동일
    // 예. a == b

    // 객체의 동일성: 서로 다른 객체가 같은 곳을 가르킨다면 동일
    // 예. a === b

    var a2 = Product("콜라", 1000)
    var b2 = Product("콜라", 1000)
    var c2 = a2
    var d2 = Product("사이다", 1000)

    println(a2 == b2)
    println(a2 === b2)

    println(a2 == c2)
    println(a2 === c2)

    println(a2 == d2)
    println(a2 === d2)

}

class Product(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        if(other is Product)
        {
            return other.name == name && other.price == price
        } else {
            return false
        }
    }
}