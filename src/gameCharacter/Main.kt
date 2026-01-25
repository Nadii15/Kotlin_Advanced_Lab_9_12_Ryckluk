//package gameCharacter
//
//import example.InstantMessenger
//import example.PhotoCamera
//
//fun handleState(state: CharacterState){
//    when(state){
//        is CharacterState.Idle -> println("Персанаж бездействует")
//        is CharacterState.Running -> println("Персанаж бежит")
//        is CharacterState.Attacking -> println("Персанаж атакует с уроном ${state.damage}")
//        is CharacterState.Dead -> println("Персанаж погиб: ${state.cause}")
//    }
//}
//fun main(){
//    val character = GameCharacter("Герой")
//    character.changeState(CharacterState.Running)
//    handleState(character.state)
//
//    character.changeState(CharacterState.Attacking(42))
//    handleState(character.state)
//
//    character.changeState(CharacterState.Dead("Убит драконом"))
//    handleState(character.state)
//
//
//}