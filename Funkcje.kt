fun printMess(Mess:String):Unit{ //Unit oznacza że funkcja nie zwraca wartości
    println(Mess)
}
fun print_with_prefix(mess:String,prefix:String="Info"):Unit{
    println("$prefix $mess")
}
fun sum(x:Int,y:Float):Float{
    return x+2.0f*y
}
fun mul(x:Int,y:Float)=x*y

fun print_all(vararg mess: String){
    for (m in mess) println(m)
}
fun print_all_with_prefix(vararg  mess:String,prefix:String){
    for (m in mess) println(prefix+m)
}
fun test_print(vararg e:String){
    print_all(*e)
}

fun main(args: Array<String>) {
    //Variables
    var a:String="AAA"
    val b:Int=2 //tych z val sie nie da zmodyfikować, zapisanie b=5 to błąd
    val c=2
    val d:Int
    d=4
    println("$a,$b,$c,$d")
    //Null Safety
    var e:String="Nie jestem null" // ta nie moze byc null
    var f:String?="Moge byc null"
    f=null
    //Function
    println(mul(4,5.6f))
    println(sum(2,3.0f))
    print_with_prefix("C")
    print_with_prefix("A","B")
    printMess("Ala")
    println("Hello World!")
    //Infix Function
    infix fun Int.mal(str:String)=str.repeat(this) //Powtarzanie Stringa
    print(4 mal "A")
    print("\n")
    val para="A" to "B"
    println(para)
    infix fun String.Parowanie(other:String)=Pair(this,other) //Tworzenie tuple
    val para2="AA" Parowanie "BB"
    println(para2)
    //Operator Functions
    operator fun Int.times(str:String)=str.repeat(this)
    println(2*"Bye ") //Przeciążono operator *
    //varargs
    print_all("A","B","C","D")
    print_all_with_prefix("A","B", prefix = "ADASA: ")
}