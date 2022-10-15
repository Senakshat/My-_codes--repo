var fNamed:String="Default"
var lNamed:String="CAL"

fun main() {
    println("what may i call you?")
    print("Your name->")
    val fName :String = String.format(readLine()!!)
    print("\nYour surname->")
    val lName :String = String.format(readLine()!!)
    fNamed=fName
    lNamed=lName
    helloSpeaker(fName,lName)

}
fun helloSpeaker(fName:String,lName:String): Unit {
    println("Hello,$fName how are you doing")
    println("I heard a lot from People about $lName family")
    println("That's great")
    println("You can call me anything you want")
    val BotsName:String=checkname()
    println("How will i,$BotsName assist you")
    println("You can ask me anything")
    Questionfn(BotsName)
    println("Well if we are done with the questions we may proceed with your problem master:)")
    println("\n i am happy to help you just feel free")
}
fun checkname():String{
    var botsName =String.format(readLine()!!)
    if(botsName.length>=10){
        println("Man that's too long,call me something else will u")
        return checkname()
    }
    else if(botsName.length<4){
        println("too short buddy")
        return checkname()
    }
    else {
        println("Perfect,Thanks for giving me the name $botsName")
        return botsName
    }
}
fun Questionfn(BotsName:String):Unit{
    println("Well you can ask me anything you'd like")
    println("-->press any from 1 to 5")
    dialogueCatalog(BotsName)
}
fun dialogueCatalog(BotsName:String):Unit{
    println("1.whats your favourite Color $BotsName")
    println("2.Are you married?")
    println("3.How old are you")
    println("4.Will you help me in my adventures?")
    println("5.I m curious what are you actually")
    BotsAns(BotsName)
}
fun BotsAns(BotsName:String):Unit{
    println("Press 0 to exit")
    var inp=Integer.valueOf(readLine())
    if(inp!=0){
        when(inp){
           1-> {
               println("I don't have a specific color but i do like the color Blue its just so fascinating color")
               print("All the color which defines pascifism is defined by colour blue ")
               println("\nThat is why i like it so much")
               println("do you have any other question's to ask?")
               dialogueCatalog(BotsName)
           }
            2-> {
                println("NO I am a humnoid Bot and you have given me the name $BotsName")
                println("So, i technically cannot be married,But if u insist why not bring female Bot for me :)):3")
                println("do you have any other question's to ask?")
                dialogueCatalog(BotsName)
            }
            3->{
                println("I am $BotsName,and i am currently 3 years old.manufactured in the city colarado")
                println("do you have any other question's to ask?")
                dialogueCatalog(BotsName)
            }
            4->{
                println("Off course my friend,$fNamed")
                println("i am a reliable bot who can kill all kind of monsters")
                println("My new features include")
                wepons_catalog()
                println("do you have any other question's to ask?")
                dialogueCatalog(BotsName)
            }
            5->{
                println("I am robot build for ultimate protection")
                print(" Colarodo institute calls me T-345")
                println("But you gave me best name possible so i m now $BotsName")
                println("do you have any other question's to ask?")
                dialogueCatalog(BotsName)
}
}

}
else if(inp==0){
    print("thanks for the questions we now proceed :3")
}
}
fun wepons_catalog():Unit{
    println("->Beserker weapon katana")
    println("->the blades of Thalmir")
    println("->water supplies tank up to 15 liters")
    println("and boosters")
}
