fun readln() = readLine()!!

fun readInt() = readln().toInt()
fun readLong() = readln().toLong()
fun readStrings() = readln().trim().split(" ")

fun readIntArray(size:Int) = readStrings().run { IntArray(size) { get(it).toInt() } }
fun readLongArray(size:Int) = readStrings().run { LongArray(size) { get(it).toLong() } }

fun readListInt() = readStrings().map { it.toInt() }
fun readListLong() = readStrings().map { it.toLong() }



fun readArrayOfIntLists(lists: Int) = Array(lists) { readListInt() }
fun readArrayOfLongArraysOfVarLength(arrays: Int) = Array(arrays) { readLongArray(readInt()) }
fun readArrayOfIntLists() = readArrayOfIntLists(readInt())

