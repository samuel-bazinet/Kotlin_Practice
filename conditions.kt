fun main() {
    // conditions
    var a = 9
    if (a == 9) {
        println("It is true")
    } else if (a == 10) {
        println("It is 10")
    } else  {
        println("It is not true")
    }

    // Use if statements as val expressions

    // You don't need the {} for this

    var reply = if (a == 9) {
        "'Tis 9"
    } else {
        "'Tis not 9"
    }

    println(reply)

    var anotherReply = when (a + 1) {
        1 -> "'Tis 1"
        2 -> "'Tis 2"
        3 -> "'Tis 3"
        4 -> "'Tis 4"
        5 -> "'Tis 5"
        6 -> "'Tis 6"
        7 -> "'Tis 7"
        8 -> "'Tis 8"
        9 -> "'Tis 9"
        10 -> "'Tis 10"
        else -> "'Tis something"
    }

    println(anotherReply)
}