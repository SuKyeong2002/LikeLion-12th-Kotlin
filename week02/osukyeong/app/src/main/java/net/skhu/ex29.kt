package net.skhu

fun main() {
    // val: 할당된 객체 변경 X, 객체 내부의 속성 변경 O

    // 상수: 절대 변경 X (companion object 안에서만 사용 가능)
    // 예. CONST_A

    val foodCourt = FoodCourt()

    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)

    println()

    // lateinit: 일단 변수만 선언하고 초기값의 할당은 나중에 할 수 있도록 함
    // 제한사항 1. 초기값 할당 전까지 변수를 사용할 수 없음 (에러 발생)
    // 제한사항 2. 기본 자료형에는 사용할 수 없음
    // ::a.isInitalized: 초기값 할당 여부 확인

    val a = LateInitSample()

    println(a.getLateInitText())
    a.text = "새로 할당한 값"
    println(a.getLateInitText())

    println()

    // 지연 대리자 속성: 선언 시 즉시 객체 생성 및 할당 (코드의 최적화)
    // 예. by lazy { 7 }

    val number: Int by lazy {
        println("초기화를 합니다")
        7
    }

    println("코드를 시작합니다")
    println(number)
    println(number)
}

class LateInitSample {
    lateinit var text: String

    fun getLateInitText(): String {
        if(::text.isInitialized) {
            return text
        }
        else {
            return "기본값"
        }
    }

}

class FoodCourt {
    fun searchPrice(foodName: String) {
        val price = when(foodName)
        {
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }
        println("${foodName}의 가격은 ${price}원 입니다")
    }

    companion object {
        const val FOOD_CREAM_PASTA="크림파스타"
        const val FOOD_STEAK="스테이크"
        const val FOOD_PIZZA="피자"
    }
}

