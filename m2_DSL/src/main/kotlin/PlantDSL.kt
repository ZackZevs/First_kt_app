package ru.otus.okb.dsl

abstract class PlantDSL {
    var name: String = ""
    var height: Double = 0.0
    var docherniy: MutableList<Plant> = mutableListOf()

    fun add(pl: Plant) {
        docherniy.add(pl)
    }
    fun add(pld: PlantDSL) {
        add(pld.build())
    }
    abstract fun build(): Plant
}

class RasteniyeDSL: PlantDSL() {
    override fun build(): Rasteniye = Rasteniye(name, height, docherniy.toList())

    fun grass (pl: Grass) = add(pl)
    fun grass (block: GrassDSL.() -> Unit) = add(GrassDSL().apply(block))
}
class GrassDSL: PlantDSL() {
    override fun build(): Grass = Grass (name, height, docherniy.toList())

    fun flower (pl: Flower) = add(pl)
    fun flower (block: FlowerDSL.() -> Unit) = add(FlowerDSL().apply(block))
}
class FlowerDSL: PlantDSL() {
    override fun build(): Flower = Flower (name, height, docherniy.toList())
}