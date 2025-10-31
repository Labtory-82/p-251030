package day1.exam23_scope.exam25_let

fun main() {
    val name: String? = "hello"

    val len = name?.length ?: 0
    println(len)

    val rst = name?.let {
        println(it.length)
        10
    }

    println(rst)

}