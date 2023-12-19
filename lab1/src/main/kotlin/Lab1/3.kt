package Lab1

fun main(args: Array<String>) {
println("Введите цену подписки: ")
   val cena = readln().toInt()
    if (cena<1001)
    {
       println("Ваша скидка составляет: 0 рублей.")
    }
    if (cena in 1001..10000)
    {
        println("Ваша скидка составляет: 100 рублей.")
    }
    if (cena > 10000)
    {
        val skid = (cena*5)/100
        println("Ваша скидка составляет: " + skid + "рублей")
    }
}