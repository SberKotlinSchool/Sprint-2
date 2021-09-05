class ProblemB {
    fun main() {
        val t = readInt();
        for (runs in 1..t) {
            val (n, k) = readIntArray(2);
            for (i in 0 until n) {
                print('a' + (i % k));
            }
            println();
        }
    }
}