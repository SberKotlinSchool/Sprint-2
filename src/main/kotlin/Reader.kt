
fun readln() = readLine()!!

fun readInt() = readln().toInt()
fun readLong() = readln().toLong()
fun readByte() = readln().toByte()
fun readStrings() = readln().trim().split(" ")

fun readIntArray(size:Int) = readStrings().run { IntArray(size) { get(it).toInt() } }
fun readLongArray(size:Int) = readStrings().run { LongArray(size) { get(it).toLong() } }
fun readByteArray(size:Int) = readStrings().run { ByteArray(size) { get(it).toByte() } }

fun readListInt() = readStrings().map { it.toInt() }
fun readListLong() = readStrings().map { it.toLong() }