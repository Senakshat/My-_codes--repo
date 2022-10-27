import java.io.File
import java.io.InputStream
import java.util.*
open class CurrentTime(var dayno:String?="",var timeH:Int=0,var timeM:Int=0){
    var startDay:Int=7
    var endDay:Int=17
    fun SetCurrtime(Day:String,Time:Int,Minute:Int){
        dayno=Day
        timeH=Time
        timeM=Minute
    }
}
data class Robot(private var name:String):CurrentTime(){
    var temp:Double=0.0
    val tasks= arrayOf<String>("Setting Alarm for specific day","Temperature setting for your gezer","Clean your room",
            "Make you a coffee","Cook you meal","Pickupbacgorremovebooks")
    val calender= arrayOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    var hours:Int=0
    var mins:Int=0
    var pickedDay=""
    val breakfastFood=arrayOf<String>("Pav bhaji","Lemonade","Poha","Idli","Dosa")
    val LunchFood=arrayOf<String>("VEG Thali","Butterchikenmasala","CHICKEN 65","Porri bhaji","Chapati")
    val DinnerFood=arrayOf<String>("Gaulash","Tikki","Salad","Paneer","Pilka roti")
    fun welcomeMsg(){
        println("Hello there my name is $name,How may i help u?")
        println("set your current time please")
        print("Dayno.->1 to 7or any ")
        println(calender.contentToString())
        var Inp= (readLine()!!).toInt()
        Inp%=7
        val Day:String=calender.get(Inp)
        print("Setcurrtime:Hours")
        var Inph= (readLine()!!).toInt()
        Inph%=24
        print("mins:")
        var Inpm= (readLine()!!).toInt()
        Inpm%=60
        SetCurrtime(Day,Inph,Inpm)
        println("set current day and time are:-> Day:$Day ${Inph}H:${Inpm}M")
        println("What can i do for u ?")
        println("I can do the following task:->")
        Reapeatmsg()
    }
    fun Reapeatmsg(){
        for (i in 0 until tasks.size){
            println("${i+1}.${tasks[i]}")
        }
        var inp:Int=(readLine()!!).toInt()
        inp%=tasks.size
        when(inp){
            1->setAlarm()
            2->setGeazer()
            3->clothes()
            4->makeCoffee()
            5->cooking(timeH)
            6->picbagup()
        }
        println("press 0 for any other task")
        inp=(readLine()!!).toInt()
        if(inp==0){
            Reapeatmsg()
        }
    }

    fun setAlarm(){


        println("set your alarm:->")
        println("pick days you want your alarm from 1 to 7")
        var inpt= (readLine()!!).toInt()
        inpt %= 7
        if (inpt>0){pickedDay=calender.get(inpt)}
        println("select time:hours")
        var hour= (readLine()!!).toInt()
        print("mins:")
        var min=(readLine()!!).toInt()
        hour%=24
        min%=60
        hours=hour
        mins=min
        println("You picked $pickedDay,Hours:$hours,Minutes:$mins")
        alarmRings(dayno,timeH,timeM)
    }
    fun alarmRings(Day:String?,Hours:Int,Min:Int){
          if(pickedDay==Day&&hours==Hours&&mins==Min) {
              println("Ring!,Ring!,Ring!!!!")
          }
    }
    fun getcoffeeInputs():String{

        val inp=Integer.valueOf(readLine())
        var Prop =""
        when(inp){
            1->Prop="Black"
            2->Prop="Milky"
        }
        if(Prop==""){
            println("invalid input please try again")
            getcoffeeInputs()
        }

        return Prop
    }
    fun makeCoffee(){
      println("How would u like your coffee press:->\nPress 1:Black or no Milk\nPress 2:with milk")
      val coffeeT=getcoffeeInputs()
      println("Your $coffeeT coffee is created.\nWould u like to add some sugar?")
      val inpp=Integer.valueOf(readLine())
      println("$inpp Amt of Grams of sugar was added.")
      println("Your $coffeeT coffee with $inpp amt of sugar was created with LOve:)")
    }
    fun setGeazer() {
        println("Do you have a prefered temperature for your geazer to be on for heating the water?")
        println("1.yes or 2.no")
        val inp:String = (readLine()!!).toString()
        if (inp == "yes") {
            println("set temp")
            val inpp:Double=(readLine()!!).toDouble()
            temp=inpp
            println("temp was set to desirable temperature:$temp degrees celcius")
        }
        else{
            print("thank u")
        }
    }
    fun picbagup(){
        if(timeH<=startDay){
            println("Pickups the book and put it in the bag")
        }
        else if(timeH>=endDay){
            println("Removes the books from the back and put it in the shelf")
        }
    }


     fun getFoodinput():Int{
         val gFI:Int=(readLine()!!).toInt()
         return gFI
     }
     fun cooking(Hour:Int){
         val Hours:Int=Hour%24
         if(Hours in 5..11){
             println("hello what would u like to have for Breakfast Today")
             for(i in 0 until breakfastFood.size) {
                 println("$i.${breakfastFood[i]}")
             }
             var inp=getFoodinput()
             inp%=breakfastFood.size
             println("Your breakfast is ready\n${breakfastFood[inp]} was cooked on $Hours am")
         }
         else if(Hours in 12..17){
             println("hello what would u like to have for Lunch Today")
             for(i in 1 until LunchFood.size){
                 println("$i.${LunchFood[i]}")
             }
             var inp=getFoodinput()
             inp%=LunchFood.size
             println("Your Lunch is ready\n${LunchFood[inp]} was cooked on $Hours pm")
         }
         else{
             println("hello what would u like to have for Dinner Today")
             for(i in 1 until DinnerFood.size){
                 println("$i.${DinnerFood[i]}")
             }
             var inp=getFoodinput()
             inp%=DinnerFood.size
             println("Your Dinner is ready\n${DinnerFood[inp]} was cooked on $Hours pm")
         }
     }
    fun clothes(){
        println("clothese were arranged by Me")
    }
}


fun main()
{
  //setting current Day and time
    //setting robot name to robocop
    var robot1=Robot("Robocop")
    robot1.welcomeMsg()
}
