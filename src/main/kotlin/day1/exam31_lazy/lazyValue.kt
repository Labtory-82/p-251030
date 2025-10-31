package day1.exam31_lazy

val lazyValue: String by lazy {
    println("initializing")
    "Hello"
}

fun main() {
    println(lazyValue)
    println(lazyValue)
}