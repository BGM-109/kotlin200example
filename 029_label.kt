fun main(args: Array<String>):Unit 
{
   	var x = 0
    var y = 0
    
    outer@while (x<20) {
        y = 0 
        while(y<20){
           	if (x+y == 15 && x-y==5) break@outer
            y++
        }
        x++
    }
    println("x: $x, y: $y")
}

// 레이블이란 반복문의 아이디이다. 