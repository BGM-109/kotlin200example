// 조건문의 일종일 when 문에 대해배운다


fun main(args: Array<String>):Unit 
{
   	val score = 64
    
    when (score/10) {
		6 -> { println("D") }
        7 -> { println("C") }
        8 -> { println("B") } // 안에 들어있는 문장이 하나 일때 중괄호를 생략할수있다.
        9 -> { println("A") }
        else -> { println("F") }
    
    
    }
    
    println("test")
}

