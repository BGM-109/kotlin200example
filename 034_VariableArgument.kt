fun main(args: Array<String>) 
{
	println(getSum(1,2,3,4,5,6,7))
    println(getSum())
}

fun getSum(vararg numbers:Int): Int {
    var sum = 0 
    
    numbers.forEach{number -> 
        sum += number
    }
    
    
    return sum
}