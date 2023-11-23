fun main() {
    println("Введите первую цифру:")
    val digit1 = readLine()?.toIntOrNull()

    if (digit1 != null) {
        println("Введите вторую цифру:")
        val digit2 = readLine()?.toIntOrNull()

        if (digit2 != null) {
            val result = createOddNumber(digit1, digit2)

            if (result != null) {
                println("Результат: $result")
            } else {
                println("Создать нечетное число невозможно")
            }
        } else {
            println("Введите корректную вторую цифру")
        }
    } else {
        println("Введите корректную первую цифру")
    }
}

fun createOddNumber(digit1: Int, digit2: Int): Int? {
    if (digit1 != digit2) {
        val sum = digit1 + digit2
        return if (sum % 2 != 0) sum else null
    }
    return null
}