package Lab1

fun main(args: Array<String>) {

    print("Введите сумму: ")
    val amount = readln().toInt()
    val result = (amount*0.75)/100
    println("Комиссия равна: " +result)
}