package net.skhu

fun main() {
    // Set: 순서 정렬 X, 중복 허용 X 컬렉션
    // contains("문자열")로 객체 존재 여부 확인

    // Set<outT>: 객체의 추가, 삭제 가능
    // add(데이터): 요소의 추가
    // remove(데이터): 요소의 삭제

    // MutableSet<T>: 객체의 추가, 삭제 불가능

    val a = mutableSetOf("귤", "바나나", "키위")

    for(item in a)
    {
        println("${item}")
    }

    a.add("자몽")
    println(a)

    a.remove("바나나")
    println(a)

    println(a.contains("귤"))

    // Map: 객체를 넣을 때 그 객체를 찾아낼 수 있는 Key를 쌍으로 넣어주는 컬렉션
    // 예. key와 value가 한 쌍

    // Map<K, outV>: 객체의 추가, 삭제 가능
    // put(키, 값): 요소의 추가
    // remove(키): 요소의 삭제

    // MutableMap<K, V>: 객체의 추가, 삭제 불가능

    val a2 = mutableMapOf("레드벨벳" to "음파음파",
                            "트와이스" to "FANCY",
                            "ITZY" to "ICY")

    for(entry in a2)
    {
        println("${entry.key} : ${entry.value}")
    }

    a2.put("오마이걸", "번지")
    println(a2)

    a2.remove("ITZY")
    println(a2)

    println(a2["레드벨벳"])

}
