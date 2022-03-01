class Customer
class Contact (val id:Int, var email:String)
//Klasa ze szablonu, zadziała na dowolnym typie
class MutableStack<A>(vararg items: A ){
    private val elements=items.toMutableList()
    fun push(ele: A)=elements.add(ele)
    fun peek():A=elements.last()
    fun pop():A=elements.removeAt(elements.size-1)
    fun isEmpty()=elements.isEmpty()
    fun size()=elements.size
    override  fun toString()="MutableStack(${elements.joinToString()})"
}
//Dziedziczenie
open class Animal(val legs:Int){
   open fun Hi():Unit{
       println("A A A")
   }
}
class Dog : Animal(4){
    override fun Hi(){
        println("B B B")
    }
}
fun main(){
    val Customer=Customer()
    val Contact=Contact(4,"dsadq2e3@.pl")
    println(Contact.id)
    println(Contact.email)
    Contact.email="dsasd.dasdssdad.@@@@ad"
    println(Contact.email)
    val stack = MutableStack(0.62, 3.14, 2.7)
    stack.pop()
    stack.push(9.87)
    println(stack)
    val dog:Animal=Dog()
    dog.Hi()
}