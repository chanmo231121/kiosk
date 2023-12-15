package com.example.calculrater


fun main() {
    mainmenu()
}

fun mainmenu() {

    println("환영합니다 케밥집입니다")
    println("케밥 메뉴")
    println("1.터키식 케밥")
    println("2.그릴 케밥")
    println("3.디저트")
    println("4.장바구니")
    val laughter = "\uD83D\uDE04"

    when (readLine()!!.toInt()) {
        1 -> {
            println("무슨 케밥을 드시겠어요 ?$laughter")
            println("1.turkish kebab chicken  | $5,500 | 터키 케밥 닭고기")
            println("2.turkish kebab lamb | $6,000 | 터키 케밥 양고기")
            println("3.turkish kebab mix | $7,000 | 터키 케밥 닭&양고기")
            println("4. go back")
            val selectkebab = turkishkebab(readLine()!!.toInt())  //turkishkebab 호출
            addcart(selectkebab)
        }

        2 -> {
            println("무슨 케밥을 드시겠어요 ?$laughter")
            println("1. inegol kebab  | $9,900 | 갈은소고기나 양고기,빵가루,양파를 사용하여 구운 미트볼")
            println("2. chicken steak kebab | $9,900 | 닭고기 스테이크 케밥")
            println("3. lavash wrap inegol kebab | $8,000 |라바시 랩 이네골 케밥 ")
            println("4. go back")
            val selectkebab = grillkebab(readLine()!!.toInt()) //grillkebab호출
            addcart(selectkebab)
        }

        3 -> {
            println("무슨 디저트를 드시겠어요 ?$laughter")
            println("1. turkish icecream |3,000| 터키아이스크림")
            println("2. plain yogurt | $5,000 | 플레인 요거트")
            println("3. baklava 1pcs | $1,500 | 바클라바 1조각")
            println("4. go back")
            val selectkebab = dessert(readLine()!!.toInt()) //dessert 호출
            addcart(selectkebab)
        }

        4 -> {
            println("내역확인")
            displayCart()
        }

        null -> {
            println("숫자를 제대로 입력하세요")
            mainmenu()
        }

        else -> {
            println("숫자를 제대로 입력하세요")
            mainmenu()
        }
    }
}

///넌 메소드야
fun turkishkebab(a: Int): Store {
    return when (a) {

        1 -> Store("TurkishKebabChicken", 5500)
        2 -> Store("TurkishKebabLamb", 6000)
        3 -> Store("TurkishKebabMix", 7000)
        4 -> {
            mainmenu()
            Store("", 0)
        }

        else -> {
            println("없는 메뉴입니다. 다시 입력해주세요.")
            turkishkebab(readLine()?.toInt() ?: 0)
        }

    }
}


///넌 메소드야
fun grillkebab(b: Int): Store {
    return when (b) {
        1 -> Store("InegolKebab", 9900)
        2 -> Store("ChickenSteakKebab", 9000)
        3 -> Store("DlavashWrapInegolKeab", 8000)
        4 -> {
            mainmenu()
            Store("", 0)
        }

        else -> {
            println("없는 메뉴입니다. 다시 입력해주세요.")
            grillkebab(readLine()?.toInt() ?: 0) // 재귀적으로 grillkebab() 호출
        }
    }
}


///넌 메소드야
fun dessert(c: Int): Store {
    return when (c) {
        1 -> Store("TurkishIcecream", 3000)
        2 -> Store("PlainYogurt", 5000)
        3 -> Store("Baklava1pcs", 1500)
        4 -> {
            mainmenu()
            Store("", 0)
        }

        else -> {
            println("없는 메뉴입니다. 다시 입력해주세요.")
            dessert(readLine()?.toInt() ?: 0)
        }
    }
}


data class Store(val name: String, val price: Int) {
}


val list = mutableListOf<Store>()
fun addcart(food: Store) {
    list.add(food)
    println("${food.name} 를 장바구니에 담았습니다!")
    mainmenu()
}

fun displayCart() {
    println("내역:")
    for ((index, item) in list.withIndex()) {
        println("${item.name} ${item.price}원")
    }
    val totalprice = list.sumBy { it.price }
    val gratitude = "\uD83D\uDE4F"
    println("총가격:$totalprice 원 입니다 결제해주세요$gratitude")
}



