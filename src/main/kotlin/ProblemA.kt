class ProblemA {
    fun main() {
        val t = readInt();
        for (i in 1..t) {
            val (a, b, k) = readLongArray(3);
            println((a - b) * (k / 2) + a * (k % 2));
        }
    }
}