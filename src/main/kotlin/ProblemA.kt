class ProblemA {

    fun main() {
        val inputStream = this::class.java.getResource("problemA/input.txt")!!.openStream()
        System.setIn(inputStream)
        var steps = readInt()
        while (steps-- > 0) {
            val line = readListLong().toMutableList()
            while (line[2] > 10) {
                line[2] = line[2] - 10
            }
            var res = 0L
            var flag = true
            while (line[2]-- > 0) {
                when (flag) {
                    true -> {
                        res += line[0]
                    }
                    false -> {
                        res -= line[1]
                    }
                }
                flag = !flag
            }
            println(res)
        }
    }
}