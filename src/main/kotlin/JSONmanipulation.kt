import com.beust.klaxon.*

fun parse(name: String) : Any? {
    val cls = Parser::class.java
    return cls.getResourceAsStream(name)?.let { inputStream ->
        return Parser.default().parse(inputStream)
    }
}

val doc = parse("/document.json") as JsonArray<JsonObject>

val tempat = doc.filter { it.obj("placement")?.string("name") =="Meeting Room" }
        .map { it.string("name") }

val electronic = doc.filter { it.string("type") =="electronic" }
        .map { it.string("name") }

val furnitur = doc.filter { it.string("type") =="furniture" }
        .map { it.string("name") }

val waktu = doc.filter { it.int("purchased_at") == 1579190642}
        .map { it.string("name") }

val colorObj = doc.filter { it.string("tags") == "brown" }
        .map { it.string("name") }

fun main() {
    println(tempat)
    println(electronic)
    println(furnitur)
    println(waktu)
    println(colorObj)
}