fun main() {
    val text = "Kotlin".firstAndLast()

    val charOne = text["pertama"]
    val charTwo = text["terakhir"]

    println("First letter is $charOne and $charTwo for second letter")

}

fun String.firstAndLast() = mapOf(
    "pertama" to this.first(),
        "terakhir" to this.last()
)

