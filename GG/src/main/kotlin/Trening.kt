open class Stroki(
    var stroka: String
) {
    class Chisla: Stroki("drob * x =") {
        val drob = 125.1
        val x: Int = 2
        val res: Double = drob * x
    }
}
fun displ(stroki: Stroki.Chisla) {
    println("${stroki.stroka} ${stroki.res}")
    println("${stroki.drob} * ${stroki.x} = ${stroki.res}")
}

fun main() {
    val obj1 = Stroki.Chisla()
    displ(obj1)
}
