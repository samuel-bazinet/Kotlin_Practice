//superclass
open class Car (
    var brand: String = "",
    var model: String = "", 
    var year: Int = 0 
) {

    override fun toString(): String {
        return "Brand: " + brand + 
        "\nModel: " + model + 
        "\nYear: " + year 
    }
    
}

//subclass
class SuperCar (
    brand: String = "",
    model: String = "",
    year: Int = 0,
    var maxSpeed:Int = 0) : Car(brand, model, year) {

    override fun toString(): String {
        return "Brand: " + brand + 
        "\nModel: " + model + 
        "\nYear: " + year + 
        "\nMax Speed: " + maxSpeed
    }

}

fun main() {
    var car1 = Car()
    car1.brand = "Ford"
    car1.model = "Escape"
    car1.year = 2022
    println(car1)

    var car2 = Car("Honda", "Civic", 2014) 
    println(car2.toString())

    var car3 = SuperCar("Ferrari", "whatever", 2000, 300)
    println(car3)

}