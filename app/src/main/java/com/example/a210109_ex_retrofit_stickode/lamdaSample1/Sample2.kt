package com.example.a210109_ex_retrofit_stickode.lamdaSample1

fun main() {
    //람다식 안에 람다식이 있는 경우
    //입력값: 없음
    //반환값: 람다식
    //람다식: 입력값 없음 반환값 println


    //입력값 ()
    //반환값 () -> Unit
    //body: println
    val nestedLamda: () -> () -> Unit = { { println("nested") } }
    val greet: () -> Unit
}