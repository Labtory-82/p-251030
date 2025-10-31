package day1.exam34_inheritance

open class Animal {
    open fun eat() {}
}

interface Pet {
    fun play()
}

class Dog : Animal(), Pet {
    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun play() {
        TODO("Not yet implemented")
    }

}

fun main() {

}