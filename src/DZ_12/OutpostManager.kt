package DZ_12
class OutpostManager{
    val resource: MutableList<ObservableResource> = mutableListOf()

    init{
        println("Создаётся менеджер аванпоста...")
    }
}
val outpostManager: OutpostManager by lazy {
    OutpostManager()
}
