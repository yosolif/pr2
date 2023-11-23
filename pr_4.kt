fun main() {
    println("Введите выражение в формате: ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")
    val input = readLine()

    if (input != null) {
        val parts = input.split(" ")

        if (parts.size == 3) {
            val num1 = parts[0].toDoubleOrNull()
            val num2 = parts[1].toDoubleOrNull()
            val operator = parts[2]

            if (num1 != null && num2 != null) {
                val result = when (operator) {
                    "+" -> num1 + num2
                    "-" -> num1 - num2
                    "*" -> num1 * num2
                    "/" -> if (num2 != 0.0) num1 / num2 else null
                    else -> null
                }

                if (result != null) {
                    println("Результат: $result")
                } else {
                    println("Ошибка: деление на ноль или недопустимая операция.")
                }
            } else {
                println("Ошибка: некорректные числа.")
            }
        } else {
            println("Ошибка: некорректный формат ввода.")
        }
    } else {
        println("Ошибка: некорректный ввод.")
    }
}