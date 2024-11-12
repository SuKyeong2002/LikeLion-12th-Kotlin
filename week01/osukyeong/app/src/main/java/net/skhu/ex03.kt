package net.skhu

fun main() {
    // 형변환

    var a : Int = 12345

    // 에러: Initializer type mismatch: expected 'kotlin.Long', actual 'kotlin.Int'.
    // var b : Long = a

    // 명시적 형변환 (explicit type casting): 변환될 자료형 개발자가 직접 지정
    // 참고: 코틀린은 암시적 형변환 (변환될 자료형 지정하지 않아도 자동 형변환) 지원 X
    var b : Long = a.toLong()
    println(b);


    // 배열

    // 초기값으로 1, 2, 3, 4, 5를 가진 배열 intArr
    var intArr = arrayOf(1, 2, 3, 4, 5)
    // 배열 intArr 객체의 참조값 출력
    println(intArr)
    // 배열 intArr의 모든 값 출력
    println(intArr.contentToString())

    // 초기값으로 5개의 null을 가진 배열 nullArr
    var nullArr = arrayOfNulls<Int>(5)
    // 배열 nullArr 객체의 참조값 출력
    println(nullArr)
    // 배열 nullArr의 모든 값 출력
    println(nullArr.contentToString())

    // 2번째 인덱스 자리에 8 할당
    intArr[2] = 8
    // 2번째 인덱스에 위치한 값 출력
    println(intArr[2])
    // 4번째 인덱스에 위치한 값
    println(intArr[4])
}