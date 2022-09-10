import java.io.InputStream

class ProblemB {
    private fun getString(stringLength: Int, maxSymbolNumber: Int) {
        val initialSymbol = Char(97)
        val maxAmount = stringLength / maxSymbolNumber

        var j = 0
        for (i in 1..maxAmount + 1) {
            for (k in 1..maxSymbolNumber) {
                if (++j > stringLength) break
                print(initialSymbol + (k - 1))
            }
        }
        print("\n")
    }

    fun main() {
        val inputStream: InputStream = this::class.java.getResource("problemB/input.txt").openStream()
        System.setIn(inputStream)

        val queryAmount = readInt()
        for (i in 1..queryAmount) {
            val queryParams = readIntArray(2)
            getString(queryParams[0], queryParams[1])
        }
    }
}