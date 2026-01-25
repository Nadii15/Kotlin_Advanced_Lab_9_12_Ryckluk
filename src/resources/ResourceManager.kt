//package resources
//
//class ResourceManager {
//    private val resources = mutableListOf<OutpostResource>()
//    fun add(resource: OutpostResource){
//        resources.add(resource)
//        println("Добавлен ресурс: ${resource.name}")
//
//    }
//    fun get(name: String): OutpostResource?{
//        return resources.find {it.name == name}
//    }
//    fun printAll(){
//        println("Ресурсы базы")
//        resources.forEach { println("${it.name}: ${it.amount}") }
//
//    }
//    fun getAll(): List<OutpostResource> = resources.toList()
//}
//fun main(){
//    val loadedResource = FileStorage.load()
//    loadedResource.forEach{manager.add(it)}
//if(loadedResource.isEMPTY()){
//    manager.add(OutpostResource(1,"Minerals",300))
//    manager.add(OutpostResource(2,"Gas",100))
//    FileStorage.save(manager.getAll())
//}
//}