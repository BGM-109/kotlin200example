// 서로 관련 있는 변수를 하나로 묶는 방법을 배운다. 


package ex_object 

fun main(args: Array<String>):Unit 
{
   	val person = object
    {
        val name: String = "홍길동"
        val age: Int = 36
    }
    
    println(person.name)
    println(person.age)
}


// 결과  
// 홍길동
// 36