package day1.exam20_map

fun main() {
    val names = listOf("Alice", "Bob", "Charlie")

    names.map {
        "Hello, $it"
    }
        .forEach(::println)

}