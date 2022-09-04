class CustomReader {

    fun readResource(file: String): List<String>? {
        return object {}.javaClass.getResourceAsStream(file)?.bufferedReader()?.readLines()
    }
}