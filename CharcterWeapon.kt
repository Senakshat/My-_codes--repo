class Charcter(var name:String,var surname:String,var age:Int) {
      var warriorChoice:Int=0
      var weaponChoice="Rock"
      var warriorType="Stone man"
      fun warriorType(warriorChoice:Int){
         this.warriorChoice=warriorChoice
         when(this.warriorChoice){
               1-> {
                     this.weaponChoice = "Shield"
                     this.warriorType="Shield hero"
               }
               2-> {
                     this.weaponChoice = "Sword"
                     this.warriorType="Sword Warrior"
               }
               3->{
                     this.weaponChoice="Bow"
                     this.warriorType="Archer"
               }
               4->{
                     this.weaponChoice="Spear"
                     this.warriorType="Spear Warrior"
               }
               else->{
                     this.weaponChoice="Rock"
                     this.warriorType="Stone man"
               }
         }
      }


}
fun main(){
      var typeOfWeapon=0
      println("Enter to your character builder")
      println("Hi i would like to know your name->")
      var pName:String= readLine()!!
      println("surname->")
      var lName:String= readLine()!!
      println("Your age please->")
      var pAge:Int=Integer.valueOf(readLine())
      var player= Charcter(pName,lName,pAge)
      println("Would u like to have a weapon?\nPress Y:Yes N:No")
      var yOn = false
      yOn=Inputt()
      var weapon:Int=0
      if(yOn){
           weapon=chooseWeapon()
      }
      player.warriorType(weapon)
      println("So ${player.name} ${player.surname},\n you choose the Weapon:${player.weaponChoice}\nIt is a good weapon")
      println("Well if you have the weapon of type ${player.weaponChoice}\nI shall call you mm")
      println("Bah!how about ${player.warriorType}")
      println("sound good right!!!")
      println("Well then ${player.warriorType} ${player.surname} good luck in your journey")
}
fun Inputt():Boolean{
     var inp=String.format(readLine()!!)
     if(inp=="Y"){
         return true
      }
     else if(inp=="N"){
          return false
    }
    else{
        print("Try again\n")
         return Inputt()
         
     }
}
fun chooseWeapon():Int{
      println("choose->>\n 1:Shield\n 2:Sword\n 3:Bow\n 4:Spear")
      return Integer.valueOf(readLine())
}
