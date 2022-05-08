package com.example.a210109_ex_retrofit_stickode.delegateSample2

//Json 파싱과 같이 동적 작업을 진행 시 프로퍼티의 값을 map에 저장하는 일은 비일비재하다.
//map 객체에 저장할 수 있게 by map으로 위임할 수 있다.
//읽기 전용(val)일 시 map 읽기
///쓰기(var)가 가능할 시 mutable map을 사용한다.
class Person(map: MutableMap<String, Any>) {
    //프로터피 값을 map에 저장
    var name: String by map
    var age: Int by map
}

fun main() {
    val person = Person(mutableMapOf())
    person.name = "jin"
    person.age = 31

    //map에 저장한 변수를 출력할 때는 변수명으로 출력함.
    println("person name is ${person.name} and age is ${person.age}") // person name is jin and age is 31
}