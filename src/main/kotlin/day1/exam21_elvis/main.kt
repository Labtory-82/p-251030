package day1.exam21_elvis

fun main() {
    val name: String? = null
    val displayName: String = name ?: "Guest"

    println(displayName)
}