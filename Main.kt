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
fun main(){
    var l=fill_progressive(12)
    println(l)
    val (min,max)= findMinMax(l)
    println("$min, $max")
}