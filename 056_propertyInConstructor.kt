fun main(args: Array<String>){

    val numbers = Calculator(10,20)
    println(numbers.first)
    println(numbers.last)


}

class Calculator(var first:Int,var last:Int)