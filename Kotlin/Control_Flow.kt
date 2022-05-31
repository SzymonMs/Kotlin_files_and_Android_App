fun cases(obj:Any){
    when(obj){
        is Int->println("It is Int")
        is String-> println("It is String")
        is Long -> println("It is Long")
        else -> println("Unkown")
    }
}
fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}
class Class

class animal(val name:String)
class Zoo (val animals:List<animal>){
    operator fun iterator():Iterator<animal>{
        return animals.iterator()
    }
}
fun main(){
    //When
    cases(1)
    cases("ALA")
    cases(2L)
    cases(Class())
    //Loops
    val lista= listOf("A","B","C")
    for (a in lista){
        println(a)
    }
    println("\n")
    var i=0
    var j=5
    while(i<5){
        println(i)
        i++
    }
    println("\n")
    do {
        println(j)
        j--
    }while (j>-3)

//    val zoo=Zoo(listOf(animal("Dog"),animal("Cat")))
 //   for (a in zoo){
    //    println(a.name)
  //  }
     for (c in 'a'..'b')
      {
           println(c)
  }
    for(c in 'z' downTo 'a' step 2)
       println(c)

  //Equality Checks
  val authors= setOf("Adam","Alan","Artur")
  val writers= setOf("Artur","Adam","Alan")
  println(authors==writers)      //true
  println(authors===writers)     //false
  //Conditional Expression
  fun max(a:Int,b:Int)=if(a>b) a else b
  println(max(9,-54))
    }