package com.example.a210109_ex_retrofit_stickode.lamdaSample1

fun main() {
    //람다식을 매개변수의 인자로 사용한 함수
    var result: Int

    result = highOrder({ x, y -> x * y }, 30, 60)

    //반환값이 없는 람다식의 선언
    val out: () -> Unit = { println("Hello World") }

}


//람다식을 함수의 입력값으로 사용
fun highOrder(calculate: (Int, Int) -> Int, a: Int, b: Int): Int {
    return calculate(a, b)
}