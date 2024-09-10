package net.skhu

fun main() {
    var price = 5000

    // 스코프 함수: 함수형 언어의 특징을 좀 더 편리하게 사용할 수 있도록 기본 제공한느 함수
    // apply/also: 처리가 끝나면 인스턴스 반환
    // run/let: 처리가 끝나면 최종값 반환

    var a = Book("디모의 코틀린", 10000).apply {
        name = "[초특가]" + name
        discount()
    }

    a.run {
        println("상품명: ${name}, 가격: ${price}원")
    }

    a.let {
        println("상품명: ${it.name}, 가격: ${it.price}원")
    }
}

class Book(var name: String, var price: Int)
{
    fun discount()
    {
        price -= 2000
    }
}