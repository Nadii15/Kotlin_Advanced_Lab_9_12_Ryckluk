package example

object GameSession{
    init {
        println("Игровая сессия создана")
    }
    var isActive: Boolean = false
    fun start() {
        isActive = true
        println("Игра началась")
    }
    fun end(){
        isActive = false
        println("Игра завершена")
    }
}
fun main(){
    println("Программа запущена")
    println("Проверяем состояние, но не трогаем GameSession")
    println("Теперь запускаем игру")
    GameSession.start()
    println("Проверяем состояние ещё раз")
    println("Активна ли сессия: ${GameSession.isActive}")

}
object Logger{
    var count = 0

    fun log(message: String){
        count++
        println("[$count]$message")
    }




    object AppSetting{
        val version = "1.0.0"
        var isDarkMode = true

        fun toggleTheme(){
            isDarkMode = !isDarkMode

        }
        fun checkTheme(){
            if (AppSetting.isDarkMode){
                println("Темная тема включена")
            }
        }
    }
    object Color{
        const val RED = "#FF0000"
        const val GREEN = "#00FF00"
        const val  BLUE = "0000FF"
    }

    fun main(){
        val handle = object {
            val name = "Обработчик"
            fun handle(){
                println("Обрабатываю...")
                println(Color.RED)
                println(Color.GREEN)
                println(Color.BLUE)
                Logger.log("Первое сообщение")
                Logger.log("Второе сообщение")
                val logger1 = Logger
                val logger2 = Logger
                println(logger1 === logger2)
            }

        }
        println(handle.name)
        handle.handle()
    }
    class MyCar(val model: String){
        fun drive() = println("$model едет")
    }
    object TrafficController{
        var carCount = 0
        fun carPassed(){
            carCount++
        }
        fun main(){
            MyCar("Toyota")
            MyCar("BMW")
            TrafficController.carPassed()
        }
    }


}

