
fun main() {
    // muttable
    var thisVar: Int = 5
    //immutable
    val thisVal: Int = 20
    println("This var is: " + thisVar)
    println("This val is: " + thisVal)
    println("Their sum is: " + (thisVar + thisVal) + '\n')

    // Data types

    val num: Int = 5
    val doubNum: Double = 5.99
    val letter: Char = 'D'
    val bool:Boolean = true
    val text:String = "lololol" 

    println("Int: " + num)
    println("Double: " + doubNum)
    println("Char: " + letter)
    println("Boolean: " + bool)
    println("String: " + text)


    //Numbers: 
    //  Integers: Byte, Short, Int, Long
    //  Floating: Float, Double

    //Scientific notation:

    println(10E20F)

    //String are arrays

    println("3rd[2] char of text is: " + text[2])

    // String Templates/Interpolation

    var fName = "meName"
    var lName = "zeLast"
    println("Za name of the person is $fName $lName")
}
