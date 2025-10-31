package day1.exam4

fun main() {

    val number = 10
    val str = if(number % 2 == 0) "Even" else "Odd"
    println(str)

    when{
        number % 2 == 0 -> println("Even")
        number % 2 != 0 -> println("Odd")
    }

}