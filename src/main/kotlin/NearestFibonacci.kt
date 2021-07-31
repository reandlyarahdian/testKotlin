import java.util.*
import kotlin.math.abs

fun main() {

    val input = Scanner(System.`in`)

    print("Enter number ")
    var x : Int = input.nextInt()

    println("Enter $x number of Array")

    var arrayint = Array<Int>(x){ input.nextInt() }

    var num : Int = arrayint.sum().nearestFibonacci()
    println(num.splitNum().sum())
}

fun Array<Int>.sum() : Int {
    var n : Int = 0
    for(i in this){
        n += i
    }
    return n
}

fun Int.splitNum() : Array<Int> =
    this.toString()
        .map { it.toString().toInt() }
        .toTypedArray()

fun Int.nearestFibonacci() : Int{
    if(this == 0){
        return 0
    }
    var first : Int = 0
    var second : Int = 1
    var third : Int = first + second
    while (third <= this){
        first = second
        second = third
        third = first + second
    }
    return if(abs(third - this) >= abs(second - this)) second else third
}

