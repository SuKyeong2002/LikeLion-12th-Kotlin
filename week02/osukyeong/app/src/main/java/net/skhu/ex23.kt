package net.skhu

fun main() {
    // overloading: 같은 scope 안에서 같은 이름의 함수를 여러 개 생성 가능
    // 단, 피라미터의 자료나 갯수가 서로 다르면 다른 함수로 작동

    read(7)
    read("감사합니다")

    println()

    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("노트북", 30, "학교")
    deliveryItem("선물", destination = "친구집")

    println()

    // variable number of arguments: 피라미터의 갯수 상관 없이 사용 가능

    sum(1, 2, 3, 4)

    println()

    println(6 multiply 4)
    println(6.multiply (4))

}

fun read(x: Int) {
    println("숫자 $x 입니다")
}

fun read(x: String) {
    println(x)
}

fun deliveryItem(name: String, count: Int = 1, destination: String = "집") {
    println("${name}, ${count}개를 ${destination}에 배달하였습니다")
}

fun sum(vararg numbers: Int) {
    var sum = 0

    for(n in numbers)
    {
        sum += n
    }
    println(sum)
}

infix fun Int.multiply(x: Int): Int = this  * x