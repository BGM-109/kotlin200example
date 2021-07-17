
fun main(args: Array<String>) 
{
    println(getAverage(100,50,true))
    getAverage(100,50,true)
    println(getAverage(print=true))
    println(getAverage(90))
}

fun getAverage(x:Int=0,y:Int=0,print:Boolean = false):Double {
    val avg = x+y / 2.0 
    if (print) {
        println(avg)
    }
    return avg
    
}