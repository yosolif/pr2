fun main() {
    println("Введите целое число n:")
    val n = readLine()?.toIntOrNull()

    if (n != null) {
        println("Введите основание степени x:")
        val x = readLine()?.toIntOrNull()

        if (x != null && x != 0) {
            val y = findExponent(n, x)
            if (y != null) {
                println("Целочисленный показатель y: $y")
            } else {
                println("Целочисленный показатель не существует")
            }
        } else {
            println("Основание степени должно быть ненулевым целым числом")
        }
    } else {
        println("Введите корректное целое число")
    }
}

fun findExponent(n: Int, x: Int): Int? {
    var y = 0
    var result = 1

    while (result < n) {
        result *= x
        y++
    }

    return if (result == n) y else null
}