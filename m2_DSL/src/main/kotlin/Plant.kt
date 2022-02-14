package ru.otus.okb.dsl

sealed interface IPlant
sealed class Plant(
    val name: String,
    val height: Double,
    val docherniy: List<Plant> = emptyList()
)

class Rasteniye (name: String, height: Double, docherniy: List<Plant> = emptyList()): Plant(name, height, docherniy)
class Grass (name: String, height: Double, docherniy: List<Plant> = emptyList()): Plant(name, height, docherniy)
class Flower (name: String, height: Double, docherniy: List<Plant> = emptyList()): Plant(name, height, docherniy)
