import modules.EnergyGenerator
import modules.ModuleResult
import modules.ResearchLab
import resources.OutpostResource
import resources.ResourceManager
fun main(){
    val manager = ResourceManager()
    val minerals = OutpostResource(1,"Minerals",300)
    val gas = OutpostResource(2,"Gas",100)
    val bonus = minerals.copy(amount = minerals.amount + 50)
    println("Копия минералов с бонусом: $bonus")
    manager.add(minerals)
    manager.add(gas)
    manager.printAll()

    val generator = EnergyGenerator()
    val lab = ResearchLab()

    val generatorResult = generator.performAction(manager)
    val labResult = lab.performAction(manager)
    handleMobuleResult(generatorResult)
    handleMobuleResult(labResult)
    println()
    manager.printAll()
}
fun handleMobuleResult(result: ModuleResult) {
    when (result) {
        is ModuleResult.Sucess ->
            println("УСПЕХ: ${result.message}")

        is ModuleResult.ResourceProduced ->
            println("Произведено: ${result.resourceName} +${result.amount}")

        is ModuleResult.NotEnoughResources ->
            println(
                "Недостаточно ресурса ${result.resourceName}. " +
                        "Нужно: ${result.required}, есть: ${result.available}"
            )

        is ModuleResult.Error ->
            println("ОШИБКА: ${result.reason}")
    }
}

