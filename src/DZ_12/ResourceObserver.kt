package DZ_12

class ResourceObserver{
    fun onResourceChanged(name:String, oldValue: Int, newValue: Int){
        println("[Наблюдатель] Ресурс '$name' изменился: $oldValue -> $newValue")
    }
}