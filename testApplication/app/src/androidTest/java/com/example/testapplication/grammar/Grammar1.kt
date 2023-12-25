package com.example.testapplication.grammar

// top level val const
const val number = 20
// 이 값은 main보다 우선해서 compile이 됨

fun main() {
    // print
    print("Hello World")
    println("Hello World!")

    // var 변수
    var i: Int = 10
    var name: String = "dabin"
    var point: Double = 3.3
    // 코틀린은 타입을 추론하는 기능을 가지고 있어서 별도로 타입을 지정해 주지 않아도 된다.

    // val 상수
    val num = 20
    // num = 30 이렇게 재대입 불가능
    // JAVA의 Final과 동일하다고 보면 된다.

    // type casting
    var before = 10 // Int
    var after = 20L // Long
    after = before.toLong()
    before = after.toInt()

    var stringNum = "10"
    before = stringNum.toInt()
}