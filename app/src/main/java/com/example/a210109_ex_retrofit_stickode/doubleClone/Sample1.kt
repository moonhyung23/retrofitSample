package com.example.a210109_ex_retrofit_stickode.doubleClone


var x = 1024
fun main() {

    //변수에 대한 속성을 참조할 수 있음.
    //x: Int
    //get -> 1024
    println(::x.get())
    println(::x.name)

    val numList = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    //함수를 참조
    //함수를 참조함으로써 함수의 내용(body)을 사용가능
    println("홀수값: ${numList.filter(::isOdd)}")

    println("짝수값: ${numList.filter(::isEven)}")

}

fun isOdd(x: Int) = x % 2 != 0
fun isEven(x: Int) = x % 2 == 0