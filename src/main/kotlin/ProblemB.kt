class ProblemB {

    fun main() {

        val t = readInt()

        for (j in 1..t) {

            val info = readListInt()
            val n = info[0]
            val k = info[1]

            val characters = 'a'.rangeTo('z')
            val repeats = n / k
            val remainder = n % k

            for (i in 1..repeats) {
                print(characters.filterIndexed { index, _ -> index < k }
                    .toCharArray()
                )
            }
            println(characters.filterIndexed { index, _ -> index < remainder }
                .toCharArray()
            )
        }
    }
}