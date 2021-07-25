
fun main(args: Array<String>){
    println("${Time(15,6).second}초")
    println("${Time(6,3,17).second}초")
	
}

class Time(val second:Int){
    
    init {
        println("init")
    }
    
    constructor(minute:Int,second:Int):this(minute*60+second){
        println("sub init1")
    }
    constructor(hour:Int,minute:Int,second:Int):this(hour*60+minute,second){
        println("sub init 2")
    }
    
    init{
        println("another init")
    }
} 
