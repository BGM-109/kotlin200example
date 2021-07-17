fun main(args: Array<String>):Unit 
{
   	val a = 3 
    val b = 7 
    val c = shorts()
    
    println(sum(a,b))
    println(c)
    println(s(AbstractCollection))
}

fun shorts(): Double = 3.0 + 7 

fun s() = 3.0 + 13

fun sum(x:Int,y:Int): Int{
	return x+y
}
// 함수형 리턴을 없애고 한줄로 표현이 가능하다. 