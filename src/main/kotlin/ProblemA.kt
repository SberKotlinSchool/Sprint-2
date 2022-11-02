class ProblemA {

    fun main() {
        Array(readInt()) { readLongArray(3) }.forEach {
            // разницу между шагами влево-вправо умножаем на кол-во четных шагов
            // + один нечетный шаг, если имеется
            println((it[0] - it[1]) * (it[2] / 2) + it[0] * (it[2] % 2))
        }

    }

}