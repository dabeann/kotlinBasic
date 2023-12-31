package com.example.testapplication.grammar

import java.lang.Integer.max
import java.util.Scanner
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

    // 반복문
    val items = listOf(1, 2, 3, 4, 5)
    items.forEach { item ->
        println(item)
    }
    // for (int i = 0; i < items.length; i++)
    for (j in 0..(items.size-1)) {
        println(items[j])
    }
    // 이 구문이 훨씬 불편함. 따라서 위의 forEach를 사용하자.
    // while문은 JAVA와 동일

    // List
    // val items = listOf(1, 2, 3, 4, 5)
    // 변경이 안되는 list
    val items2 = mutableListOf(1, 2, 3, 4, 5)
    // mutable: 변경 가능
    items2.add(6)
    items2.remove(3)

    // Array
    val itemsArray = arrayOf(1, 2, 3)
    itemsArray[0] = 10
    // 배열은 실질적으로 잘 쓰지 않기에 웬만하면 List를 사용

    // 예외 처리
    try {
        val item = items[10]
    } catch (e: Exception) {
        println(e.message)
    }

    // Null Safety
    var nameNull: String? = null
    nameNull = "dabin"
    nameNull = null
    var nameNull2: String = " "

    if (nameNull != null) {
        nameNull2 = nameNull
    }

    // nameNull2 = nameNull!! // 개발자가 임의로 null이 아님을 보증했으므로 안좋음

    nameNull?.let {
        nameNull2 = nameNull
    }

    // fun
    println(sum(10, 20))
    println(sum(b = 10, a = 20))

    // class
    val john = Person("John", 20)
    println(john.name)
    println(john.age)
    john.age = 23

    val john2 = Person("John", 20)
    println(john == john2) // false 출력
    // Person이 data class라면 john == john2 가 true이다.

}

// fun
fun sum(a: Int, b: Int, c: Int = 0) = a + b + c
// return type 생략 가능
// 메소드 오버로드는 메소드를 여러 개 만드는 게 아니라 파라미터 조절을 통해 디폴트 값을 적당히 넣어서 함


// class
class Person(val name: String, var age: Int){ // val이나 var 앞에 private 붙이면 접근 불가능
    init {
        println("init")
    }
    var hobby = "축구"
        private set // 외부에서 수정 불가능
        get() = "취미 : $field"
    fun some() {
        hobby = "농구"
    }
}