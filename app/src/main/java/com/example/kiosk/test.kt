data class Mainmenu(val name:String, val price:Int,val content:String)


fun mainmenu() {
    var kebabchicken = {
        listOf(
            Mainmenu("turkish kebab chicken", 5500, "터키 케밥 닭고기"),
            Mainmenu("turkish kebab lamb", 6000, "터키 케밥 양고기"),
            Mainmenu("turkish kebab chicken", 7000, "터키 케밥 닭&양고기")
        )

        var grill = {
            listOf(
                Mainmenu("inegol kebab", 9900, "갈은소고기나 양고기,빵가루,양파를 사용하여 구운 미트볼"),
                Mainmenu("chicken steak kebab", 9000, "닭고기 스테이크 케밥"),
                Mainmenu("lavash wrap inegol kebab", 8000, "라바시 랩 이네골 케밥")
            )

            var dessert = {
                listOf(
                    Mainmenu("turkish icecream", 3000, "터키아이스크림"),
                    Mainmenu("plain yogurt", 5000, "플레인 요거트"),
                    Mainmenu("baklava 1pcs", 1500, "바클라바 1조각")
                )

            }

        }
    }

}
