package DZ_12
import kotlin.properties.Delegates

class ObservableResource(val name: String,
    initialValue: Int,
    private val observer: ResourceObserver? = null
){
    var amount: Int by Delegates.observable(initialValue){
        _,old,new -> println("Ресурс $name изменён: $old -> $new ")
        observer?.onResourceChanged(name,old,new)
    }
}
