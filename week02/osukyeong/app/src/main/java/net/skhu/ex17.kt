package net.skhu


fun main() {
    // Observer: 이벤트 감시자 역할
    // 이벤트: 함수로 직접 요청하지는 않았지만, 시스템(루틴)에 의해서 발생하는 동작
    // 옵저버 패턴: 이벤트 발생 시 즉각적으로 처리할 수 있도록 만드는 프로그래밍 패턴
    // 클래스: 이벤트 수신 <-> 이번트의 발생 및 전달
    // 인터페이스: 이벤트 송수신 가능 (= 옵저버, 리스너)
    // 이벤트를 넘겨주는 행위: callback

    EventPrinter().start()

}

interface EventListener {
    fun onEvent(count: Int)
}

class Counter2(var listener: EventListener) {
    fun count() {
        for(i in 1..100) {
            if(i % 5 == 0) listener.onEvent(i)
        }
    }
}

/*
class EventPrinter: EventListener {
    override fun onEvent(count: Int) {
        print("${count}-")
    }

    fun start() {
        val counter = Counter2(this)
        counter.count()
    }
}
*/

// 익명 객체: EventPrinter가 EventListener를 상속받아 구현 X
// 임시로 만든 별도의 EventListener 객체를 대신 넘겨줄 수 있음

class EventPrinter {
    fun start() {
        val counter = Counter2(object : EventListener {
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}