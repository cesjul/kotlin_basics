fun sum(a:Int, b:Int):Int{
    return a + b
}

fun printHello():Unit{
    print("Hello")
}


fun main(){
    val result: Int = sum(3, 5)
    print(result)
    printHello()
}