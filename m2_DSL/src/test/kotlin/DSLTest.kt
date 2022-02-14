package ru.otus.okb.dsl
import org.junit.Assert.assertTrue
import org.junit.Test
import kotlin.test.assertEquals

class DSLTest {
    @Test
    fun DSLTest() {
        val Priroda = rasteniye {
            name = "Trava"
            height = 0.8
            grass {
                name = "Podorozhnik"
                height = 0.2
            }

            grass {
                name = "Lebeda"
                height = 0.35
            }

            grass {
                name = "Cvetok"
                height = 0.8

                flower {
                    name = "Oduvanchik"
                    height = 0.3
                }
            }
        }
        assertEquals("Trava", Priroda.name)
        //assertTrue (
            //"Podorozhnik is Trava",
            //Priroda.docherniy.first { it.name == "Trava" } != null
    }
}

private fun rasteniye(function: RasteniyeDSL.() -> Unit): Rasteniye = RasteniyeDSL().apply(function).build()
/**
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
sealed interface IPlant
sealed class Plant(
    val name: String,
    val height: Double,
    val docherniy: List<Plant> = emptyList()
)

class Rasteniye (name: String, height: Double, docherniy: List<Plant> = emptyList()): Plant(name, height, docherniy)
class Grass (name: String, height: Double, docherniy: List<Plant> = emptyList()): Plant(name, height, docherniy)
class Flower (name: String, height: Double, docherniy: List<Plant> = emptyList()): Plant(name, height, docherniy)
 **/