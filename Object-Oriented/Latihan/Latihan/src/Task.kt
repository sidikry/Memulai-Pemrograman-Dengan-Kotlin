// TODO 1
class Cat{
    var name: String = "Gippy"
    var sleep: Boolean = false
    get() {
        println("Fungsi getter dipanggil")
        return field
    }
    set(value) {
        println("Fungsi setter dipanggil")
        field = value
    }

    fun toSleep() {
        val gippy = Cat()
        println("${gippy.name}," + if (sleep) {
            " sleep!"
        }else{
            " let's play!"
        })
    }

}

fun main() {
    // TODO 2
    val gippy = Cat()
    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()


}