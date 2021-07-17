// 조건에 따라 문장을 실행할지 말지 결정하는 if문에 대해 배운다. 

fun main(args: Array<String>):Unit 
{
   	var a = 15
    var b = 11
    
    if ( a>b ) {
        println("if안으로들어옴")
        a -= b
    } 
    
    println(a)
   
}

// if안으로들어옴
// 4