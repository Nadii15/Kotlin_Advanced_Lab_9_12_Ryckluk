data class Item(
    val id: Int,
    val name: String,
    val guantity: Int
){
    override fun toString(): String{
       return "Id предмета:$id\nИмя: $name\nКоличество: $guantity\n"
    }
}
fun main(){
    val sword = Item(1,"Sword",1)
    val betterSword = sword.copy(guantity = 2)
    println(sword.toString())
    println(betterSword.toString())
   val(id,name,guantity) = betterSword
   println("Id предмета:$id\nИмя: $name\nКоличество: $guantity\n")
}
