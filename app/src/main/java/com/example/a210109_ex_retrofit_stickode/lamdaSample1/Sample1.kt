package com.example.a210109_ex_retrofit_stickode.lamdaSample1

fun main() {
    /*
    * (Int, Int) -> Int  선언자료형
    * { x : Int, y: Int  람다식의 매개변수 }
    * x * y 람다식의 처리내용
    * */
    val multi: (Int, Int) -> Int = { x: Int, y: Int -> x * y }
    val multi2 = { x: Int, y: Int -> x * y }
    val multi3: (Int, Int) -> Int = { x, y -> x * y }




    multi(1, 3)

}