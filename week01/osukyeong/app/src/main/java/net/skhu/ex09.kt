package net.skhu

fun main() {
    // 생성자: 인스턴스의 속성 초기화 + 인스턴스 생성 시 구문 수행
    // init 함수: 패러미터나 반환형이 없는 특수한 함수 (생성자를 통해 인스턴스가 만들어질 때 호출되는 함수)
    var a = Person2("박보영", 1990)
    var b = Person2("전정국", 1997)
    var c = Person2("장원영", 2004)
    
    var d = Person2("이루다")
    var e = Person2("차은우")
    var f = Person2("류수정")
}

// 기본 생성자
class Person2(var name: String, val birthYear: Int) {
    init {
        println("안녕하세요! ${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }
    
    constructor(name: String) : this(name, 1997) {
        println("보조 생성자가 사용되었습니다.")
    }
}
