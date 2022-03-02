package ru.otus.okb.first

sealed class Rasteniya (val s: String)
{
    class Palm: Rasteniya ("Пальма")
    {
        private val height:Int = 200
        fun heightt (){
            println("Пальма имеет высоту больше ${height} сантиметров")
        }
    }
    class Grass: Rasteniya ("Трава")
    {
        private val stem = "стебель"
        fun stemm (){
            println("Трава не имеет ${stem}")
        }
    }
    class Bush: Rasteniya ("Кустарник")
    {
        val size:Int = 225
        fun sizee (){
            println("Кустарник размером не больше ${size} кв.сантиметров")
        }
    }
}
