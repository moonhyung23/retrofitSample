package com.example.a210109_ex_retrofit_stickode.collectionFun

fun main() {
    val dinnerList = listOf("Pizza", "Risotto", "Pasta", "Hamburger")
    dinnerList.filter {
        it.startsWith("P")
    }.forEach {
        println(it)
    }

    //인덱스가 3인 요소만 필터링
    dinnerList.filterIndexed { index, s ->
        index == 3
    }.forEach {
        println(it)
    }

    //Null 체크
    val diNullList = listOf("Pizza", null, "Risotto", "Pasta", "Hamburger")
    diNullList.filterNotNull().filter {
        it.startsWith("P")
    }

    //객체인 경우 String 타입만 필터링
    diNullList.filterIsInstance<String>().filter {
        it.startsWith("P")
    }


}