// = 도 연산자임을 이해한다. 배정 연산자와 일반 연산자의 출약형도 알아본다. 

fun main(args: Array<String>):Unit 
{
   	val a:Int 
    var b:Int
    
    a = 10 + 5 
    b = 10 
    
    b += a 
    println(b)
    
    b %= 3 
    println(b)
}

/* 
25
1
*/