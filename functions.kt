
fun myFunc() {
    println("I was Called")
}

fun myUsefulFunc(number: Int) {
    for (i in 1..number) {
        println(i)
    }
}

fun myReturningFunc(number: Int): Int {
    if (number != 1) {
        return number * myReturningFunc(number - 1)
    } else {
        return 1
    }
}

fun fastFun(x: Int, y: Int) = x + y

fun main() {

    myFunc()
    myUsefulFunc(10)
    println(myReturningFunc(6))
    println(fastFun(5, 10))

}