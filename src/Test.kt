var age: Int = 18
    set(value){
        if ((value > 0) and (value < 110))
            field = value
    }

fun main() {
    println(age)
    age = 45
    println(age)
    age = -345
    println(age)

    abstract class Human(val name: String) {
        abstract var age: Int
        abstract fun hello()


    }

    //    val denis :Human
//    val pavel: Human = Human("Pravel")
    class Person(name: String) : Human(name) {
        override var age: Int = 1
        override fun hello() {
            println("My name is $name")
            abstract class Figure {
                abstract fun perimeter(): Float
                abstract fun area(): Float
            }

            class Rectangle(val width: Float, val height: Float) : Figure() {
                override fun perimeter(): Float {
                    return 2 * (width + height)
                }

                override fun area(): Float {
                    return width * height
                }
            }
        }


            }
        }




