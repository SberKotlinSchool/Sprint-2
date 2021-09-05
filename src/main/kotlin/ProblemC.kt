import kotlin.math.abs

class ProblemC {
    fun main() {
        val n = readInt();
        var arr = quickSort(readIntArray(n).toList());
        var counter = 0;
        for (i in 0 until n step 2)
            counter += abs(arr[i] - arr[i + 1]);
        println(counter);
    }

    private fun quickSort(arr: List<Int>): List<Int> {
        if (arr.size < 2) {
            return arr;
        }
        val pivot = arr[arr.size / 2];
        val equal = arr.filter { it == pivot };
        val less = arr.filter { it < pivot };
        val greater = arr.filter { it > pivot };

        return quickSort(less) + equal + quickSort(greater);
    }
}