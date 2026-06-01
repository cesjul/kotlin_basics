fun main(){
    val string: String = "Learning Kotlin"

    val lastChar: Char = string[string.length -1]

    println(lastChar)

    val startsWithPrefix = string.startsWith("Learn")

    println("Starts with 'Learn': $startsWithPrefix")

    
}