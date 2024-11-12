package net.skhu

fun main() {
    // 컬렉션 함수: list, set, map과 같은 컬렉션 또는 배열에 일반함수 또는 람다함수 형태를 사용하여
    // for문 없이도 아이템을 순회하며 참조하거나 조건을 걸고 구조의 변경까지 가능한 여러가지 함수
    // forEach(): 모든 객체를 순서대로 출력
    // filter(): 조건에 맞는 값만 반환
    // map(): 변경된 값만 반환
    // any: 하나라도 조건에 맞으면 true
    // all: 모두 조건에 맞으면 true
    // none: 하나도 조건에 맞지 않으면 true
    // first(): 컬렉션함수) 컬렉션의 첫번째 아이템 반환, 람다함수) 조건에 맞는 첫번째 아이템 반환
    // first(): 컬렉션함수) 컬렉션의 마지막 아이템 반환, 람다함수) 조건에 맞는 마지막 아이템 반환
    // first -> find, last -> findLast
    // first, last 사용 시 반환할 아이템이 없을 경우 NoSuchElementException 에러 발생
    // 해결방안: firstOrNull, lastOrNull
    // count(): 컬렉션함수) 컬렉션의 모든 아이템의 개수 반환, 람다함수) 조건에 맞는 아이템의 개수 반환

    val nameList = listOf("박수영", "김지수", "김다현", "신유나", "김지우")

    nameList.forEach{ println(it + " ") }
    println()

    println(nameList.filter { it.startsWith("김") })

    println(nameList.map { "이름: " + it })

    println(nameList.any{ it == "김지연" })
    println(nameList.all{ it.length == 3 })
    println(nameList.none{ it.startsWith("이") })

    println(nameList.first{ it.startsWith("김") })
    println(nameList.last{ it.startsWith("김") })
    println(nameList.count{ it.contains("지") })
}

