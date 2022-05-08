package com.example.a210109_ex_retrofit_stickode.collectionFun

fun main() {
    testMapAndFilter()

}

//1)Test Map And Filter
fun testMapAndFilter() {
    val list = listOf(
        Person("Alice", 27),
        Person("hzoou", 25),
        Person("txxbro", 28),
        Person("iyj", 28),
        Person("WooVictory", 27))

    //map(): 5번 filter: 5번
    //처음에 모든 요소를 Map을 통해 실행한 후
    //Filter로 걸러줌
    val result = list.map(::mapToName)
        .filter(::filterByAge)
    println(result)
}

fun mapToName(person: Person): Int {
    println("map : ${person.name}")
    return person.age
}

fun filterByAge(age: Int): Boolean {
    println("filter : $age")
    return age > 27
}


//2)Test Filter And Map
fun testFilterAndMap() {
    val list = listOf(
        Person("Alice", 27),
        Person("hzoou", 25),
        Person("txxbro", 28),
        Person("iyj", 28),
        Person("WooVictory", 27))

    //Filter: 5번 Map: 2번
    //모든 요소를 필터에 조건에 맞는지 확인 (5번)
    //Map을 통해 필터링된 데이터를 출력 (2번)
    val result = list.filter { filterByAge(it.age) }
        .map(::mapToName)

    println(result)
}


data class Person(
    val name: String,
    val age: Int,
)