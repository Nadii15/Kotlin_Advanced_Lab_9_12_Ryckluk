package modules

import resources.OutpostResource
import resources.ResourceManager

class ResearchLab: OutpostModule("Исследовательская лаборатория") {
    override fun performAction(manager: ResourceManager) : ModuleResult {
        var minerals = manager.get("Minerals")
        if (minerals == null || minerals.amount < 30) {
            return ModuleResult.NotEnoughResources(
                resourceName = "Minerals",
                required = 30,
                available = minerals?.amount ?: 0
            )

        }else{
            minerals.amount -= 30
            return ModuleResult.Sucess("Исследование завершено")
        }


    }

}
fun main(){
    val manager = ResourceManager()
    manager.add(OutpostResource(1, "Minerals", 120))
    manager.add(OutpostResource(2, "Gas", 40))
    val generator = EnergyGenerator()
    val lab = ResearchLab()
    generator.performAction(manager)
    lab.performAction(manager)
    println()
    manager.printAll()
}