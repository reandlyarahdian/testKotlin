import java.util.*

fun main() {

    val input = Scanner(System.`in`)
    print("Enter number ")

    val testing: Int = input.nextInt()

    for (i in 1..testing){
        if((i % 15 == 0).equals(true)){
            print("FizzBuzz, ")
        }else if((i % 5 == 0).equals(true)){
            print("Buzz, ")
        }else if((i % 3 == 0).equals(true)){
            print("Fizz, ")
        }else{
            print("$i, ")
        }
    }
}