class ProblemB {

    fun main() {

        //ваша реализация в методе main
        //output на тестовый input может быть различным!
        val count = readInt()
        for (i in 1..count){
            val params = readIntArray(2)
            println(getUniformStr2(params.get(0), params.get(1)))
        }
    }

    fun getUniformStr2(n: Int, k: Int): String {
        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        val chars = alphabet.substring(0, k)
        var str = "";
        var i = 0;
        while (i < n){
            str += chars
            i+=k
        }
        return str.substring(0, n);
    }
}