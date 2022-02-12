package ru.otus.okb.first

sealed class Rasteniya (val s: String)
{
    class Palm: Rasteniya ("Пальма")
    {
        private val Height:Int = 200
        fun height (){
            println("Пальма имеет высоту больше ${Height} сантиметров")
        }
    }
    class Grass: Rasteniya ("Трава")
    {
        private val Stem = "стебель"
        fun stem (){
            println("Трава не имеет ${Stem}")
        }
    }
    class Bush: Rasteniya ("Кустарник")
    {
        private val Size:Int = 225
        fun s1ze (){
            println("Кустарник размером не больше ${Size} кв.сантиметров")
        }
    }
}
