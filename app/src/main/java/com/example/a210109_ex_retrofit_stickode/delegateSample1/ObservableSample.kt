package com.example.a210109_ex_retrofit_stickode.delegateSample1

import kotlin.properties.Delegates

class Person {
    //Delegates.observable()은 초깃값과 수정에 대한 핸들러를 인자로 갖는다.
    //프로퍼티에 값을 할당(입력)할 때 실행됨
    //(프로퍼티의 값 변경을 관찰하고 있음)
    //입력이 없을 때는 "no name" 반환
    var name: String by Delegates.observable("no name") { property, oldValue, newValue ->
        println("value change ($oldValue) to ($newValue)")
    }
}

fun main() {
    val person = Person()
    println("person name is ${person.name}")
    //프로퍼티에 값을 할당할 때마다 (할당 완료 후에)핸들러를 호출
    person.name = "jin"

    println("changed person name is ${person.name}")
}

/*
*
* class Person {
    // 200살 이상은 값 오류로 판단 값 셋팅을 거부한다.
    var age: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
        newValue < 200
    }
}

fun main() {
    val person = Person()
    person.age = 31
    println("person age is ${person.age}") // person age is 31

    person.age = 9999 // 거부됨
    println("person age is ${person.age}") // person age is 31
}
* */