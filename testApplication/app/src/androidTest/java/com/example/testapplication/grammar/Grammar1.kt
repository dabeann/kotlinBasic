package com.example.testapplication.grammar

import java.lang.Integer.max
import java.util.Scanner
import kotlin.jvm.internal.Intrinsics.Kotlin
import kotlin.random.Random

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

    // String
    var stringName = "hello"
    println(stringName.uppercase())
    println(stringName.lowercase())
    println(stringName[0]) // 특정 번째 글자를 취할 때 배열처럼 접근 가능
    println("제 이름은 ${stringName}입니다.")
    println("제 이름은 ${stringName + 10}입니다.")

    // max & min
    var minNum = 10
    var maxNum = 20
    println(max(minNum, maxNum))
    println(Math.max(minNum, maxNum)) // 이것도 동작하는데 JAVA로 짜져 있어서 성능 좀 더 안좋음

    // random
    val randomNumber = Random.nextInt(0, 100) // 0부터 99까지
    println(randomNumber)

    // 키보드 입력
    val reader = Scanner(System.`in`) // in은 kotlin에서 사용할 수 없는 키워드라서 ``로 감싸준다.
    reader.nextInt()
    reader.next()

    // 조건문
    var conditionVar = 5
    var result = when {
        conditionVar > 10 -> {
            "10보다 크다"
        }
        conditionVar > 5 -> {
            "5보다 크다"
        }
        else -> {
            "else"
        }
    }
    // if문은 when문으로 그대로 치환 가능

    println(result)

    // 3항 연산
    val result2 = if (conditionVar > 10) true else false
}