import java.util.*

fun main() {

    val input = Scanner(System.`in`)
    print("Enter Word/s ")

    var string : String  = input.nextLine()

    print(string.reversedWords())
}

fun String.reversedWords() : String {
    var string = this.split(Regex("\\s+"))
    var sb = StringBuilder()

    for(item in string){
        if(item != ""){
            val rev = StringBuilder(item.reversed())

            sb.append("$rev ")
        }
    }
    return sb.toString()
}