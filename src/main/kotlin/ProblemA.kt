class ProblemA {

    fun main() {

        for(rqStep in 1..readInt()) {
            val inputData = readListLong()
            val positiveJump = inputData.component1()
            val negativeJump = -inputData.component2()
            val jumpCount = inputData.component3()
            println("${(positiveJump + negativeJump) * (jumpCount / 2) + positiveJump * (jumpCount % 2)}")
        }

    }
}