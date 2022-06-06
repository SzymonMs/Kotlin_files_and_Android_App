fun main2(){
//    var list1 = listOf(1.0,-2.0,0.0,2.0,1.0)
//    println("Punkt 1: $list1")
//    var list2 = list1.sorted()
//    println("Punkt 1: $list2")
//    var list3 = list1.sortedBy { it*it }
//    println("Punkt 1: $list3")
//    var list4 = list1.sortedBy { it*it*it }
//    println("Punkt 1: $list1")
    val texts:MutableSet<String> = mutableSetOf("abc","ab","abc")
    println(texts)
    println(texts.any{it == "ab"})
    println(texts.count())
    //println(texts[0]) -> Tak nie wolno
}
fun main(args:Array<String>){
//    val cakes = listOf("carrot","cheese","chocolate")
//    for (cake in cakes){
//        println("Yummy, it's a $cake cake!")
//    }
//    println(whenAssign("Hello"))
//    println(whenAssign(1.0))
//    println(whenAssign(1))
//    println(whenAssign("1"))
//    println(whenAssign(Myclass()))
    val s = MeasurementUnit.UNIT
    println(s.coeff)
    for (u in MeasurementUnit.values()) {
        print(u.toString() + ", ")
    }
    println()
}
fun whenAssign(obj:Any): Any{
    val result = when(obj){
        1->"one"
        "Hello"->1
        is Long ->false
        is Myclass ->"Obiekt"
        is String ->1
        else->42
    }
    return result
}

class Myclass
enum class MeasurementUnit(public val coeff:Int){
    MILI(-3),UNIT(1),KILO(3),MICRO(-6)
}