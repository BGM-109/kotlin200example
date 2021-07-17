// when 을 표현식으로 사용하는 법을 알아본다.


fun main(args: Array<String>):Unit 
{
   	val score = 95 
    
    val grade:Char = when (score/10) 
    {
		6 -> 'D'
        7 -> 'C'
        8 -> 'B'
        9 -> 'A'
        10 -> 'S'
        else -> 'F'
    	
    }
    
    println(grade)
}

//A 