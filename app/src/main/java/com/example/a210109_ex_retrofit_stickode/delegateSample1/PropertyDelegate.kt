package com.example.sportsfriendrefac.sample1

import kotlin.reflect.KProperty

//위임할 객체
class PropertyDelegate(var value: String) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        //기본 값으로 name -> "name"
        //입력 값 -> "no name"
        println("${property.name} get value ${this.value}")

        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: String) {
        println("${property.name} set value ${this.value} -> $newValue")

        this.value = newValue
    }
}

class Person {
    //위임 객체를 받을 프로퍼티
    var name: String by PropertyDelegate("no name") // getValue, setValue
    val age: String by PropertyDelegate("31") // getValue
}

fun main() {
    val person = Person()
    // name get value no name
    //getValue()실행  value로 "no name"을 반환
    println("person name is ${person.name}") // person name is no name

    //setValue()메서드 실행 person.name -> "jin"으로 수정
    // " name set value no name -> jin " 출력
    person.name = "jin" // name set value no name -> jin

    // name get value no name
    println("person name is ${person.name}") // person name is jin

    // age get value 31
    println("person age is ${person.age}") // person age is 31
}