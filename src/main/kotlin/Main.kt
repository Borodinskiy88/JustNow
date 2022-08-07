fun main() {

    val secondAgo = 333333
    val minutes: Int = secondAgo / 60
    val hours: Int = secondAgo / 3600

    println("был(а) в сети " + agoToText(minutes, secondAgo, hours))
}

fun agoToText(minutes: Int, secondAgo: Int, hours: Int): String {

    return when (secondAgo) {
        in 0..60 -> "только что "
        in 61..60 * 60 -> "$minutes ${minutesAgo(minutes)} назад "
        in 60 * 60 + 1..24 * 60 * 60 -> "$hours ${hoursAgo(hours)} назад "
        in 24 * 60 * 60 + 1..24 * 60 * 60 * 2 -> "сегодня "
        in 24 * 60 * 60 * 2 + 1..24 * 60 * 60 * 3 -> "вчера "
        else -> "давно"
    }
}

fun minutesAgo(minutes: Int): String {
// 1, 11, 21, 31, 41, 51 минута
// 2-4, 22-24, 32-34, 42-44, 52-54 минуты
// остальное минут
    return if (minutes % 10 == 1 && minutes != 11) {
        "минуту"
    } else if (minutes % 10 == 2 || minutes % 10 == 3 || minutes % 10 == 4) {
        "минуты"
    } else {
        "минут"
    }
}

fun hoursAgo(hours: Int): String {
// 1, 21 час
// 2, 3, 4, 22, 23 часа
// 5-20 часов
    return if (hours % 10 == 1) {
        "час"
    } else if (hours % 10 == 2 || hours % 10 == 3 || hours % 10 == 4) {
        "часа"
    } else {
        "часов"
    }
}