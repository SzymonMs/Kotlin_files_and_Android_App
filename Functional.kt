fun calc(x:Int,y:Int,z:Int,operation:(Int,Int,Int)->Int):Int{
    return operation(x,y,z)
}
fun summul(x:Int,y:Int,z:Int):Int {
    return x + y + z
}
fun main(){
    //High Order Function
    val result=calc(1,2,3,::summul)
    println("$result")
    //Lambda Funtions
    val x: (Int,Int)->Int={a:Int,b:Int->a+b}
    val up1: (String)->String={Str:String->Str.uppercase()}
    val up2: (String)->String={it.uppercase()}
    val up3={str:String->str.uppercase()}
    println(x(1,2))
    println(up1("hEllo"))
    println(up2("hEllo"))
    println(up3("hEllo"))

}