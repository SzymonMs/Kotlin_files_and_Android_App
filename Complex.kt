/// COMPLEX NUMBER SIMPLE IMPLEMENTATION
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.*

class Complex(var a:Double, var b:Double){
    public var module: BigDecimal = BigDecimal(sqrt(a*a+b*b)).setScale(2, RoundingMode.HALF_EVEN)
    private var modulee:Double=sqrt(a*a+b*b)
    public var fi= sign(this.b)*acos(this.a/this.modulee)

    fun add(c:Complex):Complex {
        val aaa = c.a + this.a
        val bbb = c.b + this.b
        return Complex(aaa, bbb)
    }
    fun sub(c:Complex):Complex {
        val aaa = this.a - c.a
        val bbb = this.b - c.b
        return Complex(aaa, bbb)
    }
    fun mull(c:Complex):Complex {
        val aaa = c.a*this.a-c.b*this.b
        val bbb = c.a*this.b+c.b*this.a
        return Complex(aaa, bbb)
    }
    fun div(c:Complex):Complex {
        val aaa = (this.a*c.a+this.b*c.b)/(c.modulee*c.modulee)
        val bbb =((-1)*this.a*c.b+this.b*c.a)/(c.modulee*c.modulee)
        return Complex(aaa, bbb)
    }
    fun conjugates(){
        this.b=this.b*(-1)
    }
    fun prtCmplx():Unit{
        println("Re{x}= ${this.a}, Im{x}= ${this.b}, abs{x}= ${this.module}")
    }
    fun prtCmplx2():Unit{
        println("${this.a}+j${this.b}")
    }
    fun ptr_tryg(){
        println("${this.modulee}(cos(${this.fi})+j*sin(${this.fi}))")
    }
    fun ptr_exp(){
        println("${this.modulee}exp(j*${this.fi})")
    }
    fun set_a(aa:Double){
        this.a=aa
    }
    fun set_b(bb:Double){
        this.b=bb
    }
    fun npow(n:Int):Complex{
        var w:Complex = Complex(0.0,0.0)
        w.a=this.modulee.pow(n)* cos(n*this.fi)
        w.b=this.modulee.pow(n)* sin(n*this.fi)
        return w
    }
    fun nthroots(n:Int):Any{
        var ww:MutableList<Complex> = mutableListOf(Complex(0.0,0.0))
        var w=Complex(0.0,0.0)
        for(i in 0..n-1)
        {
            w.a= this.modulee.pow(1.0/n)*cos((2* PI*i+this.fi)/n)
            w.b= this.modulee.pow(1.0/n)*sin((2* PI*i+this.fi)/n)
            if(abs(w.a)<0.000001){
                w.a=0.0
            }
            if(abs(w.b)<0.000001){
                w.b=0.0
            }
            ww.add(w)
            w.prtCmplx2()
        }
        return ww
    }

}

fun main(){
    var E=Complex(3.0,-8.0)
    E.ptr_tryg()
    val F=E.npow(5)
    F.prtCmplx2()


}