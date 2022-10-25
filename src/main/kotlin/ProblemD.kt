class ProblemD {

    fun main() {

        val numberOfCases = readInt()

        for (i in 0 until numberOfCases){
            val numberOfWallets = readInt()
            val wallets = readLongArray(numberOfWallets).toMutableList()
            println(getMaxProfit(wallets))
        }

    }

    fun getMaxProfit(wallets: MutableList<Long>): Long{
        if(wallets.size == 1){
            return wallets[0]
        }
        wallets.sort()
        var profitWithFirst = 0L
        for(i in wallets.indices){
            profitWithFirst += if(wallets[i] >= wallets[0]){
                wallets[0]
                } else 0L
        }
        wallets.remove(wallets[0])
        return profitWithFirst.coerceAtLeast(getMaxProfit(wallets))
    }

}