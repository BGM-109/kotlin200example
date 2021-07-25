
fun main(args: Array<String>){
    val person = Person()
    person.age = - 30 
    println(person.age)
   
	
}

class Person(){
    var age:Int = 0 
    get(){
        return field + 1 
    }
    set(value){
        field = if(value >= 0) value else 0 
    }
}