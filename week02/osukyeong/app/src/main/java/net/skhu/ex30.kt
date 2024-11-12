package net.skhu

fun main() {
    // 실무에서의 비트연산: 정수형의 값을 비트단위로 나누어 담아 경제성을 높이기 위람
    // and: 둘다 1이면 1 반환
    // or: 하나라도 1이면 1 반환
    // xor: 비트가 같은 자리는 0, 다른 자리는 1로 반환

    var bitData: Int = 0b10000

    bitData = bitData or(1 shl 2)
    println(bitData.toString(2))

    var result = bitData and(1 shl 4)
    println(result.toString(2))

    println(result shr 4)

    bitData = bitData and((1 shl 4).inv())
    println(bitData.toString(2))

    println((bitData xor(0b10100)).toString(2))


}
