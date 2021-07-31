import java.util.*

fun main() {

    val input = Scanner(System.`in`)
    print("Enter two number ")

    val testing: String = input.nextLine()

    leapYear(testing.isYear())
}

fun String.isYear() : List<Int> =
    this.split("\\s+".toRegex())
        .map { it.toInt() }

fun leapYear(year : List<Int>){
    var y = year[0]..year[1]
    println(y.filter { it % 4 == 0 })
}