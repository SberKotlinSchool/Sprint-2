class ProblemD {
    fun main() {
        val t = readInt();
        for (runs in 1..t) {
            val n = readInt();
            val arr = readLongArray(n);
            arr.sort();
            val avgMoney = arr.sum() / n;
            val price = arr.find { it >= avgMoney }!!;
            println(arr.filter { it >= price }.size * price);
        }
    }
}