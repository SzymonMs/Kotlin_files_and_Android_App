//Listy
val mod_list:MutableList<Int> = mutableListOf(1,2,3)
val lista:List<Int> = listOf(1,24,5)
//Zbiory
val zbior:MutableSet<Int> = mutableSetOf(11,11,2,3,4)
//Map
val mapa:MutableMap<String,Int> = mutableMapOf("a" to 1,"bo" to 2)

fun main(){
    println(mod_list)
    mod_list.add(33)
    println(mod_list)
    println(lista)
    println(zbior)
    println(mapa)
    val numbbers= listOf<Int>(1,-2,3,-5,-6,-7,10)
    val positive=numbbers.filter { it>0 }
    val negative=numbbers.filter { it<0 }
    println(positive)
    println(negative)
    val nummbers=listOf(-1,-2,-5,10,10,20)
    val dubled=nummbers.map { it+2-it*8 }
    val testt=mapa.map { mapa.values+4 } //????????
    println(dubled)
    println(testt)
    val fir=nummbers.first()
    val las=numbbers.last {it<-4}
    println("Pierwszy: $fir, Ostatni: $las")
    val total=nummbers.count()
    val total_pos=nummbers.count {it>0}
    println("All: $total, Positive: $total_pos")
    val liss=listOf(1,-3,4,3,5,-6)
    val evenOdd=liss.partition { it%2==0 }
    val (even,none_ev)=liss.partition { it%3==0 }
    println(evenOdd)
    println("$even,,,,,$none_ev")
    val fruitsBag = listOf("apple","orange","banana","grapes")
    val clothesBag = listOf("shirts","pants","jeans")
    val cart = listOf(fruitsBag, clothesBag)
    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }
    println("Your bags are: $mapBag")
    println("The things you bought are: $flatMapBag")
    val elel=listOf(1,1,1,1)
    println("${elel.minOrNull()}")
    val AAA=listOf(1,2,3)
    val BBB:List<Int> = listOf(1,2,3)
    val resss=AAA zip BBB
    println(resss)
    println(elel.getOrElse(2){23}) //1
    println(elel.getOrElse(20){23}) //23

}
