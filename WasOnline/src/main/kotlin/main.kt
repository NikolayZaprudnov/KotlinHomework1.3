fun main() {
    val seconds = 61
    println(agoToText(seconds))
}
fun agoToText (seconds: Int) = when (seconds){
    in 1..60 -> "Был в сети тоько что"
    in 61..(60*60) -> "Был в сети " + seconds/60 + " " + textMinute(seconds) + " назад"
    in (60*60)+1..(24*60*60) -> "Был в сети "+ (seconds/60)/60 +" " + textHour(seconds) +" назад"
    in (24*60*60)..(24*60*60)*2 -> "Был в сети вчера"
    in (24*60*60)*2..(24*60*60)*3 -> "Был в сети позавчера"
    else -> "Был в сети давно"
}
fun textMinute(seconds: Int):String{
    val minutes = seconds/60
    return when (minutes){
        1, 21, 31, 41, 51-> "Минуту"
        2 ,3 ,4, 22, 23, 24, 32, 33, 34 ,42 ,43 ,44, 52, 53, 54 -> "Минуты"
        else -> "Минут"

    }
}
fun textHour(seconds: Int):String{
    val hours = (seconds/60)/60
    return when (hours){
        1, 21 -> "час"
        2, 3, 4, 22, 23, 24 ->"Часа"
        else -> "Часов"
    }
}