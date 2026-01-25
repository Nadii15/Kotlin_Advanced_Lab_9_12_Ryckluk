package DZ_12
import java.io.File

object StateStorage {
    private const val FILE_NAME = "resources.txt"


    fun save(resources: List<ObservableResource>) {
        val lines = resources.map { "${it.name},${it.amount}" }
        File(FILE_NAME).writeText(lines.joinToString("\n"))
        println("Состояние сохранено в $FILE_NAME")
    }


    fun load(): MutableList<ObservableResource> {
        val file = File(FILE_NAME)
        if (!file.exists()) {
            println("Файл $FILE_NAME не найден. Возвращаем пустой список.")
            return mutableListOf()
        }

        val resources = mutableListOf<ObservableResource>()
        file.readLines().forEach { line ->
            if (line.isNotBlank()) {
                val parts = line.split(",")
                if (parts.size == 2) {
                    val name = parts[0]
                    val amount = parts[1].toIntOrNull() ?: 0
                    resources.add(ObservableResource(name, amount))
                }
            }
        }
        println("Состояние загружено из $FILE_NAME")
        return resources
    }
}
