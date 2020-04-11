fun main() {
    val text = "Kotlin"
    val results = with(text){
        "First letter is ${this[0]}" + " and ${this[this.length -1]}" + " for second letter"
    }

    // TODO 2
    println(results)
}
