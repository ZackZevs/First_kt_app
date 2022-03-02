package ru.otus.okb.first

fun display(rasteniya: Rasteniya) {
    val tree = "дерево"
    val col0R = "зелёная"
    when (rasteniya) {
        is Rasteniya.Palm -> println("${rasteniya.s} это ${tree}")
        is Rasteniya.Grass -> println("${rasteniya.s} полностью ${col0R}")
        is Rasteniya.Bush -> println("${rasteniya.s} это маленькое ${tree}")
    }
}
fun main() {
    val obj1 = Rasteniya.Palm()
    val obj2 = Rasteniya.Grass()
    val obj3 = Rasteniya.Bush()
    display(obj1)
    obj1.heightt()
    display(obj2)
    obj2.stemm()
    display(obj3)
    obj3.sizee()
    }