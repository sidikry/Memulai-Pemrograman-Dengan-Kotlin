// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean = false

    fun toSleep(sleep: Boolean) = if(sleep == true){
        println("$name, let's play!")
    }
    else{
        println("$name, sleep!")
    }

    fun getSlepp(){

        println("Fungsi getter dipanggil")
    }

    fun setSleep(){
        println("Fungsi setter dipanggil")
    }


}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.getSlepp()
    gippy.toSleep(true)
    gippy.setSleep()
    gippy.getSlepp()
    gippy.toSleep(false)
}