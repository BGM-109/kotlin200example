typealias Number = Int
fun main(args: Array<String>):Unit 
{
   	val a: Number = 10 
    println(a)
    if (a is Int) {
        println("correct")
    }
}

/*
10
correct
 */