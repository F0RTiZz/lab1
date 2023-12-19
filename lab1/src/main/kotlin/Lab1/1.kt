package Lab1

fun main(args: Array<String>) {
    println("Введите число лайков: ")
    val likes = readln().toInt()
    if (likes%10==1) println("Понравилось " + likes +" человеку")
    else println("Понравилось " + likes +" людям")
}