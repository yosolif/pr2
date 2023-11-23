fun main() {
    println("Введите строку символов, прогрмма посчитает сколько одинаковых символов в ней:")
    val inputString = readLine() ?: ""
    val charCountMap = inputString.groupingBy { it }.eachCount().toSortedMap()

    println("Результат работы программы:")
    charCountMap.forEach { (char, count) ->
        println("$char - $count")
    }
}