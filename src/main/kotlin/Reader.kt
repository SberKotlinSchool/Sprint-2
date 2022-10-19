
    fun readln() = readLine()!!

    fun readInt() = readln().toInt()
    fun readStrings() = readln().trim().split(" ")

    fun readIntArray(size:Int) = readStrings().run { IntArray(size) { get(it).toInt() } }
    fun readLongArray(size:Int) = readStrings().run { LongArray(size) { get(it).toLong() } }

    /** Замапить стандартный ввод (заранее известного размера) на экземпляр класса FrogJumps */
    fun readFrogJumps() = readIntArray(3).let { it ->
        IntArray(3) { it }
        FrogJumps(rightStepA = it[0].toLong(), leftStepB = it[1].toLong(), stepsQntK = it[2])
    }

    /** Замапить стандартный ввод (заранее известного размера) на экземпляр класса StringGenerator */
    fun readStrGenerator() = readIntArray(2).let { it ->
        IntArray(2) { it }
        StringGenerator(strLengthN = it[0], lettersQntK = it[1])
    }

