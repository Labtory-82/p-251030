package day1.exam18_when

fun main() {
    val day = 3

    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        8 -> 12
        9 -> true
        else -> "Invalid Day"
    }

    println("Day: $dayName")

    val dayName2 = if(day == 3) "day" else false
    println("Day: $dayName2")
}