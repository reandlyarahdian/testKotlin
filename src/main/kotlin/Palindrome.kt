import java.util.*

fun main() {

    val input = Scanner(System.`in`)
    print("Enter Word/s ")

    var string = input.nextLine()

    check(string)
}

fun String.isPalindrome(): Boolean =
    this.lowercase()
        .replace("\\s".toRegex(), "")
        .let { it == it.reversed() }

fun check(s : String){
    if(s.isPalindrome()){
        println("$s is Palindrome")
    }
    else println("$s is Not Palindrome")
}