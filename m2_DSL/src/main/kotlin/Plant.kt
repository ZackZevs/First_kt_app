package ru.otus.okb.dsl

interface IPlant {
    val namePlant: String
}

sealed class Plant(
    val name: String,
    val height: Double,
    val docherniy: List<Plant> = emptyList()
)

class Rasteniye (name: String, height: Double, docherniy: List<Plant> = emptyList()): Plant(name, height, docherniy)
class Grass (name: String, height: Double, docherniy: List<Plant> = emptyList()): Plant(name, height, docherniy)
class Flower (name: String, height: Double, docherniy: List<Plant> = emptyList()): Plant(name, height, docherniy)

data class Cvetok (override val namePlant: String): IPlant
data class Derevo (override val namePlant: String): IPlant
data class Trava (override val namePlant: String): IPlant

class Planeta <T> {
    private val Plants = mutableListOf<T>()
    infix fun addPlan(rasten: T) = Plants.add(rasten)
    fun getAll(): List<T> = Plants.toList()
    inline fun <reified D: IPlant> getOnlyOneTyped(): List<D> {
        return getAll().filter { it is D }.map { it as D }
    }
}

fun main() {
    val rast = Planeta<IPlant>()
    val Elka = Derevo("Elka")
    val Roza = Cvetok("Roza")
    val Lebeda = Trava("Lebeda")
    rast addPlan Elka
    rast addPlan Roza
    rast addPlan Lebeda

    val cvet1: List<Cvetok> = rast.getOnlyOneTyped()
    println(cvet1)
    println(rast.getAll())
}