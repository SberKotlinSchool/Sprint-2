import problemB.Str

class ProblemB {

    fun main() {
        val array = read()
        val arrayResponse = generate(array)
        write(arrayResponse)
    }

    private fun read(): Array<Str?> {
        val t = readInt()
        if (t !in 1..100) {
            throw RuntimeException("Ошибка ввода числа кол-ва запросов, цифра должна быть от 1 до 1000")
        }
        val inputArray = arrayOfNulls<Str>(t)
        for (i in inputArray.indices){
            val intList = readListInt()
            if (intList.size == 2) {
                val n = intList[0]
                val k = intList[1]
                if (n in 1..100 && k <= n.coerceAtMost(26) && k >= 1)
                inputArray[i] = Str(intList[0], intList[1])
            }
        }
        return inputArray
    }


    private fun generate(array: Array<Str?>): Array<String?> {
        val arrayResponse = arrayOfNulls<String>(array.size)
        val alphabet = ('a'..'z').toList()
        for ((index, obj) in array.withIndex()) {
            if (obj != null) {
                val str = StringBuilder()
                val k = obj.k
                val n = obj.n
                val count = n / k
                repeat(count) {
                    for (i in 0 until k) {
                        val ch: Char = alphabet[i]
                        str.append(ch)
                    }
                }
                val div: Int = n % k
                var i = 0
                repeat(div) {
                    val ch = alphabet[i++]
                    str.append(ch)
                }
                arrayResponse[index] = str.toString()
            }
        }
        return arrayResponse
    }

    private fun write(response: Array<String?>) {
        for (i in response) {
            println(i)
        }
    }

}