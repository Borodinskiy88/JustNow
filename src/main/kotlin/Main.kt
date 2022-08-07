fun main() {

    val secondAgo = 59
    val minutes: Int = secondAgo / 60
    val hours: Int = secondAgo / 3600

    println("был(а) в сети " + lastVisit(minutes, secondAgo, hours))
}


//fun agoToText(): String {
//    val secondAgo = 549
//    val message = "был(а) в сети"
//    when(secondAgo) {
//        in 0..60 -> print("$message только что ")
//        in 61..60 * 60 -> print("$message х минут назад ")
//        in 60 * 60 + 1..24 * 60 * 60 -> print("$message x часов назад ")
//        in 24 * 60 * 60 + 1..24 * 60 * 60 * 2 -> print("$message сегодня ")
//        in 24 * 60 * 60 * 2 + 1..24 * 60 * 60 * 3 -> print("$message вчера ")
//        else -> print("давно")
//    }
//    return String()
//}

fun lastVisit(minutes: Int, secondAgo: Int, hours: Int): String {

    return when(secondAgo) {
        in 0..60 -> "только что "
        in 61..60 * 60 -> "$minutes ${minutesAgo(minutes)} назад "
        in 60 * 60 + 1..24 * 60 * 60 -> "$hours часов назад "
        in 24 * 60 * 60 + 1..24 * 60 * 60 * 2 -> "сегодня "
        in 24 * 60 * 60 * 2 + 1..24 * 60 * 60 * 3 -> "вчера "
        else -> "давно"
    }
}

fun minutesAgo(minutes: Int): String {
//todo 1, 11, 21, 31, 41, 51 минута
// 2-4, 22-24, 32-34, 42-44, 52-54 минуты
// остальное минут
    return if (minutes % 10 == 1 && minutes != 11) {
        "минуту"
    } else if (minutes % 10 == 2 || minutes % 10 ==3 || minutes % 10 ==4) {
        "минуты"
    } else {
        "минут"
    }


////    val minutes: Int = secondAgo / 60
//    return when(minutes) {
// //       in 60 * 60..60 * 60 * 2 -1 -> "1 час назад"
//        (minutes % 10 == 1) -> "минута"
//        (minutes % 10 == 2 || minutes % 10 ==3 || minutes % 10 ==4) {"минуты"}
//        else {"минут"}
//    }
}

//fun hoursAgo(hours: Int): String {
////todo 1, 21 час
//// 2, 3, 4, 22, 23 часа
//// 5-20 часов
//// 1 час = 3600 секунд
//    return if ()
//}