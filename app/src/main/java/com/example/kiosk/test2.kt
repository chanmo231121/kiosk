package com.example.kiosk

fun main() {

    // 객체 생성
    println("동물 소리를 듣고 싶은 동물을 선택해주세요!")
    println("1. 고양이")
    println("2. 개")

    when (readLine()?.toInt()) {
        1 -> {
            val cat = Kebab("고양이", 5000)
            cat.item()
        }

        2 -> {
            val dog = Kebab("개", 6000)
            dog.item()
        }

        else -> println("잘못된 선택입니다.")
    }
}



class Kebab(private val name: String, private val price: Int) {

    fun item() {
println("${name}은 ${price}원 입니다")
    }
}
