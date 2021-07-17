fun main(args: Array<String>):Unit 
{
    celsius(27)
}

fun celsius(t:Int) = println(t * 1.8 + 32)

// 함수의 반환 타입을 생략하면 자동으로 Unit 이 된다. Unit은 리턴 생략이 가능하다. 