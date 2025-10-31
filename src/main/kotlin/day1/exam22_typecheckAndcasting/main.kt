package day1.exam22_typecheckAndcasting

fun main() {

    val obj: Any = "Hello"

    if(obj is String) {
        println(obj.length)
        val str: String = obj
        println(str.length)
    }

}