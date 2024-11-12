package net.skhu

// : 한 줄 주석
/* 주석을
 * 여러줄로
 * 달아볼게요
 */

fun main() {
    // 클래스 이름: 파스칼 표기법 (예. ClassName)
    // 함수나 변수 이름: 카멜 표기법 (예. functionName)

    // var: 일반적으로 통용되는 변수
    // 에러: Variable 'a' must be initialized
    // var a: Int
    // println(a)

    // 변수 선언 시 초기값 할당
    var a: Int = 123
    println(a)

    // 초기값은 출력 전에만 할당하면 됨
    var b: Int
    b = 456
    println(b)

    // nullable 변수 선언 (* 꼭 필요한 경우에만 사용)
    var c: Int? = null
    println(c)

    // val: 선언시에만 초기화 가능, 중간에 값 변경 X

    // property(속성): 클래스에 선언된 변수
    // Local Variable(로컬변수): Scope 내에 선언된 변수

    // 기본 자료형(숫자): Byte(8bits), Short(16bits), Int(32bits), Long(64bits)
    var intValue: Int = 6789 // 32비트 10진수
    var longValue: Long = 6789L // 64비트 10진수
    var intValueByHex: Int = 0x1af // 16진수
    var intValueByBin: Int = 0b10110110 // 2진수
    println(intValue)
    println(longValue)
    println(intValueByHex)
    println(intValueByBin)

    // 기본 자료형(실수): Float(32bits), Double(64bits)
    var doubleValue: Double = 123.5 // 실수형 기본
    var doubleValueWithExp: Double = 123.5e10 // 지수 표기법 추가
    var floatValue: Float = 123.5f // 16비트 float형
    println(doubleValue)
    println(doubleValueWithExp)
    println(floatValue)

    // 문자: char (문자 1개)
    // 유니코드 인코딩 방식: UTF-16 BE (글자 하나가 2bytes(16bits) 메모리 공간 사용)
    var charValue: Char = 'a'
    var koreanCharValue: Char = '가'
    println(charValue)
    println(koreanCharValue)

    // Boolean
    var booleanValue: Boolean = true
    println(booleanValue)

    // 문자열: string (문자 여러개)
    var stringValue = "one two three four"
    var multiLineStringValue = """multiline
        string
        test
    """
    println(stringValue)
    println(multiLineStringValue)
}
