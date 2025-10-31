package day1.exam7

private class Person(
    val name: String,
    val age: Int
) {

    fun greet() {
        println("Hello, my name is $name, my age is $age")
    }
}

fun main() {
    val person = Person("Alice", 20)
    person.greet()
}