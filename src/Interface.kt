interface Movable{
    var speed: Int
    val model: String
    val number: String
    fun move()
    fun stop(){
        println("Останавливаемся...")
    }
}
class Car(
    override val model: String,
    override val number: String): Movable{
    override var speed = 60
    override fun move(){
        println("Едем на машине со скоростью $speed км/ч")
    }

    }
class Aircraft(
    override val model: String,
    override val number: String): Movable{
    override var speed = 600
    override fun move(){
        println("Летим на самолёте со скоростью $speed км/ч")
    }
    override fun stop() = println("Приземляемся...")
}
fun main() {
    val player = MediaPlayer()
    player.play()
    val car = Car("LADA","134LAD" )
    val aircraft = Aircraft("Boeing", "737")
//    val car: Movable = Car()
//    val aircraft: Movable = Car.Aircraft()
    car.move()
    aircraft.move()
    travel(car)
    travel(aircraft)


    }

fun travel(obj: Movable) = obj.move()
interface VideoPlayable{
    fun play() = println("Play video")
}
interface AudioPlayable{
    fun play() = println("Play audio")
}
class MediaPlayer: VideoPlayable, AudioPlayable{
    override fun play() {
        println("Start playing")
        super<VideoPlayable>.play()
        super<AudioPlayable>.play()
    }
}