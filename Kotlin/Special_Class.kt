data class user(val name:String,val id:Int){
    override fun equals(other:Any?)=other is user
            && other.id==this.id
}
enum class Color(val rgb:Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);
    //fun containsRed()=(this.rgb and 0xFF0000 !=0)
}
fun main(){
    //Data Class
    val us=user("Adam",1)
    println(us)
    val us2=user("Aleks",1)
    println(us2)
    println(us==us2)
    //Enum Class
    val blue=Color.BLUE
    println(blue)
    //println(blue.containsRed())
    //println(Color.RED.containsRed())
    val numbers=object {
        var a:Int=30
        var b:Int=50
        var c:Int=60
    }
    val total=numbers.a*numbers.b*numbers.c
    print("$total")
}