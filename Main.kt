import javax.swing.text.StyledEditorKit.BoldAction
import kotlin.math.*

fun fill_progressive(n:Int):List<Int>{
    var l = mutableListOf<Int>()
    for(i in 0..n){
        l.add(i)
    }
    return l
}
fun findMinMax(list: List<Int>): Pair<Int, Int> {
    var k:Int
    var K:Int
    val m:Int? = list.minOrNull()
    val M:Int? = list.maxOrNull()
    when(m){
        is Int->k=m
        else->k=0
    }
    when(M){
        is Int->K=M
        else->K=0
    }
    return Pair(k, K)
}
fun factorial(n:Int) :Long{
    var i=1
    var silnia=1L
    while(i<=n){
        silnia=silnia*i
        i=i+1
    }
    return silnia
}
fun factorial_recurection(n:Int):Long{
    if(n>1){
        return n*factorial_recurection(n-1)
    }
    else
        return 1
}
fun is_prime(n:Int,m:Int):List<Int>{
    var list = mutableListOf<Int>()
    var isPrime= true
    var j=n
    while(j<m){
        isPrime=true
        if(j==0||j==1){
            isPrime=false
        }
        for (i in 2..j/2){
            if(j%i==0){
                isPrime=false
            }
        }
        if(isPrime){
            list.add(j)
        }
        j=j+1
    }
    return list
}
fun pi_liebniz(stop_at:Double):Double{
    var pi=4.0
    var i=1
    while(1.0/i>stop_at){
        pi=pi+4*Math.pow(-1.0,i.toDouble())*1.0/(2*i+1)
        i++
    }

    return pi
}
fun draw_square(a:Int) {
    for (i in 0..a - 1) {
        for (j in 0..a - 1) {
            if (i == 0 || i == a - 1|| j==0 || j==a-1) {
                print("#")
            }
            else{
                print(" ")
            }
        }
        print("\n")
    }
}
fun draw_square2(a:Int,left_diagonal: Boolean,right_diagonal:Boolean){
    if(left_diagonal==true&&right_diagonal==false){
        for(i in 0..a-1){
            for(j in 0..a-1){
                if(i==0||i==a-1||j==0||j==a-1||i==j){
                    print("#")
                }else{
                    print(" ")
                }
            }
            print("\n")
        }
    }
    if(left_diagonal==true&&right_diagonal==true){
        for(i in 0..a-1){
            for(j in 0..a-1){
                if(i==0||i==a-1||j==0||j==a-1||i==j||i+j==a-1){
                    print("#")
                }else{
                    print(" ")
                }
            }
            print("\n")
        }
    }
}
fun Euklied(a:Int,b:Int):Int{
    var c=0
    var A=a
    var B=b
    while(B!=0){
        c= A.mod(B)
        A=B
        B=c
    }
    return A
}

fun main(){
    var l=fill_progressive(12)
    println(l)
    val (min,max)= findMinMax(l)
    println("$min, $max")
    println(pi_liebniz(0.000001))
    draw_square2(8,true,true)
    println(Euklied(4,3))
}