package net.skhu

fun main() {
    // 리스트: 데이터를 코드로 지정한 순서대로 저장

    // List<outT>: 생성 시 넣은 객체를 대체/추가/삭제 불가능
    // 예. listOf(1, 2, 3)

    // MutableList<T>: 생성 시 넣은 객체를 대체/추가/삭제 가능
    // 예. mutableListOf("A", "B", "C")
    // 요소의 추가: add(데이터), add(인덱스, 데이터)
    // 요소의 삭제: remove(데이터), removeAt(인덱스)
    // 요소의 무작위섞기: shuffle()
    // 요소의 정렬: sort()

    val a = listOf("사과", "딸기", "배")
    println(a[1])

    for(fruit in a)
    {
        print("${fruit}")
    }
    println()

    val b = mutableListOf(6, 3, 1)
    println(b)

    b.add(4)
    println(b)

    b.add(2, 8)
    println(b)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)

}