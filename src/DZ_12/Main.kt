package DZ_12
fun main(){
    val manager = outpostManager

    manager.resource.add(ObservableResource("Minerals",100))
    manager.resource.add(ObservableResource("Gas",50))
    manager.resource.add(ObservableResource("Energy",75))

    println("Изменяем количество ресурсов")

    manager.resource[0].amount = 120
    manager.resource[1].amount = 60

    println("Сохранение состояние")

    StateStorage.save(manager.resource)

    println("Загружаем состояние из файла")

    val loadedResources = StateStorage.load()

    println("Выводим загруженные ресурсы")

    loadedResources.forEach { resource -> println("${resource.name}: ${resource.amount}") }
}
