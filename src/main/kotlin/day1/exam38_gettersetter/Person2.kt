package day1.exam38_gettersetter

class Person2(
    private var _name: String
) {

    var name: String
        get() {
            if(_name.isEmpty()) {
                return "noname"
            }

            return _name
        }
        set(value) {
            if(value.isEmpty()) {
                println("이름은 공백일 수 없습니다.")
                _name = "noname"
            }
        }
}

fun main() {

    val p = Person2("")

//        p.name = ""
    println(p.name)

}